

# **1. What is Hashing?**

Hashing is a technique to **map data (keys) into a fixed-size table (hash table)** using a **hash function**.
It allows **fast insertion, deletion, and search** (on average **O(1)** time).

---

# **2. Hash Table Organization**

### (a) **Direct Addressing**

* If key range is small, we directly use the key as an index.
* Example: key = roll number from 0–99 → array of size 100.

👉 Problem: **Wastes space** if key range is very large.

---

### (b) **Hash Table**

* Use a **hash function** `h(key)` to map a large range of keys into a smaller range (`0 to m-1`).
* Collisions occur when two keys map to the same slot → must handle them.

---

# **3. Hashing Functions**

A good **hash function** distributes keys **uniformly**.

### Common Methods:

1. **Division Method**:

   ```
   h(key) = key % table_size
   ```

   * Simple and widely used.
   * Choose table\_size as **prime** to reduce collisions.

2. **Multiplication Method**:

   ```
   h(key) = floor(m * ( (key * A) % 1 ))
   ```

   where `0 < A < 1` is a constant (often `(√5 – 1)/2`).

3. **Folding Method**:

   * Break key into parts, add them together.

4. **Mid-Square Method**:

   * Square the key, take middle digits.

---

# **4. Collision Handling**

Since collisions are unavoidable, we need strategies:

### (a) **Open Addressing**

* Probe for next empty slot:

  1. **Linear Probing**: `(h(key) + i) % m`
  2. **Quadratic Probing**: `(h(key) + i^2) % m`
  3. **Double Hashing**: `h1(key) + i*h2(key)`

### (b) **Chaining**

* Each slot of hash table points to a **linked list** of keys that hash there.

---

# **5. Static Hashing**

* Table size is fixed at the start.
* Uses open addressing or chaining.
* Once table is full, performance degrades.

👉 Example (Chaining in C):

```c
#include <stdio.h>
#include <stdlib.h>

#define SIZE 10

// Linked list node
typedef struct Node {
    int key;
    struct Node* next;
} Node;

Node* hashTable[SIZE];

// Hash function
int hash(int key) {
    return key % SIZE;
}

// Insert into hash table
void insert(int key) {
    int index = hash(key);
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->key = key;
    newNode->next = hashTable[index];
    hashTable[index] = newNode;
}

// Search
int search(int key) {
    int index = hash(key);
    Node* temp = hashTable[index];
    while (temp) {
        if (temp->key == key) return 1;
        temp = temp->next;
    }
    return 0;
}

// Display
void display() {
    for (int i = 0; i < SIZE; i++) {
        printf("%d: ", i);
        Node* temp = hashTable[i];
        while (temp) {
            printf("%d -> ", temp->key);
            temp = temp->next;
        }
        printf("NULL\n");
    }
}

int main() {
    insert(15);
    insert(25);
    insert(35);
    insert(20);

    display();

    printf("Search 25: %s\n", search(25) ? "Found" : "Not Found");
    printf("Search 99: %s\n", search(99) ? "Found" : "Not Found");

    return 0;
}
```

---

# **6. Dynamic Hashing**

* Unlike static hashing, table grows/shrinks **dynamically** as elements are added/removed.
* Prevents performance degradation when table gets full.
* **Examples:**

  * **Rehashing** → Double table size and reinsert elements when load factor > threshold.
  * **Extendible Hashing** → Uses a directory that expands as needed.
  * **Linear Hashing** → Splits buckets gradually without full rehash.

👉 Example: **Rehashing in C (Dynamic Hash Table)**

```c
#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int *table;
    int size;
    int count;
} HashTable;

int hash(int key, int size) {
    return key % size;
}

HashTable* createTable(int size) {
    HashTable* ht = (HashTable*)malloc(sizeof(HashTable));
    ht->size = size;
    ht->count = 0;
    ht->table = (int*)malloc(size * sizeof(int));
    for (int i = 0; i < size; i++) ht->table[i] = -1; // -1 means empty
    return ht;
}

void rehash(HashTable *ht);

void insert(HashTable *ht, int key) {
    if ((float)ht->count / ht->size > 0.7) { // load factor > 0.7
        rehash(ht);
    }
    int index = hash(key, ht->size);
    while (ht->table[index] != -1) {
        index = (index + 1) % ht->size;
    }
    ht->table[index] = key;
    ht->count++;
}

void rehash(HashTable *ht) {
    int oldSize = ht->size;
    int *oldTable = ht->table;

    ht->size *= 2;
    ht->count = 0;
    ht->table = (int*)malloc(ht->size * sizeof(int));
    for (int i = 0; i < ht->size; i++) ht->table[i] = -1;

    for (int i = 0; i < oldSize; i++) {
        if (oldTable[i] != -1) {
            insert(ht, oldTable[i]);
        }
    }
    free(oldTable);
    printf("Rehashed: new size = %d\n", ht->size);
}

void display(HashTable *ht) {
    for (int i = 0; i < ht->size; i++) {
        printf("%d: %d\n", i, ht->table[i]);
    }
}

int main() {
    HashTable* ht = createTable(5);
    insert(ht, 10);
    insert(ht, 20);
    insert(ht, 30);
    insert(ht, 40);
    insert(ht, 50);

    display(ht);

    return 0;
}
```

---

# ✅ **Summary**

* **Hash Table Organizations**: Direct addressing, open addressing, chaining.
* **Hashing Functions**: Division, multiplication, folding, mid-square.
* **Static Hashing**: Fixed size, collisions handled by chaining/open addressing.
* **Dynamic Hashing**: Grows/shrinks dynamically (rehashing, extendible hashing, linear hashing).

---
