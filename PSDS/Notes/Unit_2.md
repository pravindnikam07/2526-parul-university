# Linked Lists:

## 🔗 1. **What is a Linked List?**

---

### 🎯 Simple Definition:

A **linked list** is a linear collection of data elements, called **nodes**, where each node points to the **next node** in the sequence using a pointer.

> 🧠 Think of it like a chain:
> 
> 
> Each node = a person holding a paper and pointing to the next person.
> 

---

### ❌ Why Not Arrays?

| Problem with Arrays | Why Linked List Solves It |
| --- | --- |
| Fixed size | Can grow/shrink dynamically |
| Costly insert/delete | Fast insertion/deletion |
| Memory waste if not full | No unused slots |

---

### 🧠 Real-Life Analogy:

Imagine a **treasure hunt**:

- Each clue leads you to the next.
- If someone steals a clue (node), the game breaks!
- That’s what deleting a node without care does.

---

## 🔧 2. **Node Structure in C**

```c
struct Node {
    int data;
    struct Node* next;
};

```

- `data`: stores value
- `next`: pointer to next node

---

## 🎯 Visual Representation

Let’s say we have:

```c
struct Node* head = malloc(sizeof(struct Node));
head->data = 10;
head->next = NULL;

```

| Node | Data | Next |
| --- | --- | --- |
| head | 10 | NULL |

Add another node:

```c
struct Node* second = malloc(sizeof(struct Node));
second->data = 20;
second->next = NULL;
head->next = second;

```

| Node 1 (head) | Data: 10 | Next → second |
| --- | --- | --- |
| Node 2 | Data: 20 | Next: NULL |

---

## 💡 Key Points

- A linked list starts with a **head** pointer.
- The last node always has `next = NULL`.
- Each node is **dynamically allocated** using `malloc`.

---

## 📚 Summary Table

| Term | Meaning |
| --- | --- |
| Node | A structure containing data and a pointer |
| Head | First node in the list |
| NULL | Indicates end of list |
| Traversal | Visiting each node |
| `malloc()` | Allocates memory dynamically |

---

## 🧩 Practice Problems

| Platform | Problem | Link |
| --- | --- | --- |
| LeetCode | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Must-do |
| GeeksforGeeks | [Linked List Set-1](https://www.geeksforgeeks.org/linked-list-set-1-introduction/) | Full intro |
| HackerRank | [Print the Linked List](https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem) | First LL task |
| InterviewBit | [List Cycle](https://www.interviewbit.com/problems/list-cycle/) | Loop detection |

---

# 🔧 Linked List Operations

*(Singly Linked List)*

---

## 🔄 1. **Traversal**

### 🎯 What is it?

Visiting each node of the linked list from start to end.

```c
void traverse(struct Node* head) {
    struct Node* temp = head;
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

```

---

## 🔍 2. **Searching an Element**

### 🎯 What is it?

Checking if a value exists in the list.

```c
bool search(struct Node* head, int key) {
    struct Node* temp = head;
    while (temp != NULL) {
        if (temp->data == key)
            return true;
        temp = temp->next;
    }
    return false;
}

```

---

## ➕ 3. **Insertion**

We can insert a node:

- At the beginning
- At the end
- At a given position

---

### 📍 A. Insert at Beginning

```c
void insertAtBeginning(struct Node** head_ref, int new_data) {
    struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
    new_node->data = new_data;
    new_node->next = *head_ref;
    *head_ref = new_node;
}

```

---

### 📍 B. Insert at End

```c
void insertAtEnd(struct Node** head_ref, int new_data) {
    struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
    struct Node* last = *head_ref;

    new_node->data = new_data;
    new_node->next = NULL;

    if (*head_ref == NULL) {
        *head_ref = new_node;
        return;
    }

    while (last->next != NULL)
        last = last->next;

    last->next = new_node;
}

```

---

### 📍 C. Insert at Given Position

```c
void insertAtPosition(struct Node** head_ref, int pos, int new_data) {
    struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
    new_node->data = new_data;

    if (pos == 0) {
        new_node->next = *head_ref;
        *head_ref = new_node;
        return;
    }

    struct Node* temp = *head_ref;
    for (int i = 0; temp != NULL && i < pos - 1; i++)
        temp = temp->next;

    if (temp == NULL) return; // Invalid position

    new_node->next = temp->next;
    temp->next = new_node;
}

```

---

## ➖ 4. **Deletion**

We can delete:

- A node by value
- A node at a given position

---

### ❌ A. Delete by Value

```c
void deleteByValue(struct Node** head_ref, int key) {
    struct Node* temp = *head_ref;
    struct Node* prev = NULL;

    if (temp != NULL && temp->data == key) {
        *head_ref = temp->next;
        free(temp);
        return;
    }

    while (temp != NULL && temp->data != key) {
        prev = temp;
        temp = temp->next;
    }

    if (temp == NULL) return;

    prev->next = temp->next;
    free(temp);
}

```

---

### ❌ B. Delete at Position

```c
void deleteAtPosition(struct Node** head_ref, int pos) {
    if (*head_ref == NULL) return;

    struct Node* temp = *head_ref;

    if (pos == 0) {
        *head_ref = temp->next;
        free(temp);
        return;
    }

    for (int i = 0; temp != NULL && i < pos - 1; i++)
        temp = temp->next;

    if (temp == NULL || temp->next == NULL) return;

    struct Node* next = temp->next->next;
    free(temp->next);
    temp->next = next;
}

```

---

## ✅ Example Flow

```
Insert 10 at beginning → 10
Insert 20 at end → 10 -> 20
Insert 15 at position 1 → 10 -> 15 -> 20
Delete value 15 → 10 -> 20

```

---

## 🧩 Practice Problems

| Platform | Problem | Link |
| --- | --- | --- |
| LeetCode | [Delete Node in Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/) | Tricky one |
| GeeksforGeeks | [Insert and Delete in Linked List](https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/) | Must-read |
| HackerRank | [Insert a node at a specific position](https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem) | Hands-on |
| InterviewBit | [Remove Duplicates from Sorted List](https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/) | Good logic |

---

## 🎓 What You Learned

- How to **traverse**, **search**, **insert**, and **delete** nodes in a singly linked list.
- Importance of **head pointer**, pointer handling, and dynamic memory.
- Basics that form the foundation for advanced problems (like reversing, detecting cycles, etc.)

---

# 🔁 Types of Linked Lists

---

## 📘 Step-by-Step Plan

Here’s what we’ll cover in this part:

### ✅ 1. Doubly Linked List

### ✅ 2. Circular Linked List

### ✅ 3. Header Linked List

### ✅ 4. Comparison Table

### ✅ 5. Applications of Linked Lists

---

## 🔄 1. **Doubly Linked List (DLL)**

### 🎯 What is it?

Each node has:

- `data`
- `prev` (pointer to previous node)
- `next` (pointer to next node)

```c
struct Node {
    int data;
    struct Node* prev;
    struct Node* next;
};

```

---

### 🧠 Real-World Analogy:

A **browser** lets you move **back** and **forward**.

That’s a **doubly linked list**!

---

### 🔧 Insertion at Front

```c
void push(struct Node** head_ref, int new_data) {
    struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
    new_node->data = new_data;
    new_node->prev = NULL;
    new_node->next = *head_ref;

    if (*head_ref != NULL)
        (*head_ref)->prev = new_node;

    *head_ref = new_node;
}

```

---

### 🔄 Traversal (Forward + Backward)

```c
void printForward(struct Node* node) {
    while (node != NULL) {
        printf("%d ", node->data);
        node = node->next;
    }
}

void printBackward(struct Node* node) {
    struct Node* last;
    while (node != NULL) {
        last = node;
        node = node->next;
    }

    while (last != NULL) {
        printf("%d ", last->data);
        last = last->prev;
    }
}

```

---

## 🔁 2. **Circular Linked List (CLL)**

### 🎯 What is it?

In this list:

- Last node’s `next` points to the **head**
- Can be singly or doubly circular

```c
struct Node {
    int data;
    struct Node* next;
};

```

- Head → 10 → 20 → 30 → back to Head (10)

---

### 🧠 Real-World Analogy:

**Music Playlist** on loop mode.

After the last song plays, the first song plays again.

---

### 🔁 Traversal (Singly Circular)

```c
void printList(struct Node* head) {
    struct Node* temp = head;
    if (head != NULL) {
        do {
            printf("%d ", temp->data);
            temp = temp->next;
        } while (temp != head);
    }
}

```

---

## 🧩 3. **Header Linked List**

### 🎯 What is it?

A **special node** called the **header** node is added at the beginning.

It **does not store data**, only **points to the first data node**.

- Useful to simplify logic for insertion and deletion
- Often used in **queues** or **memory management**

```c
struct Node {
    int data;
    struct Node* next;
};

struct HeaderNode {
    struct Node* head;
};

```

---

## 📊 4. Comparison Table

| Feature | Singly LL | Doubly LL | Circular LL | Header LL |
| --- | --- | --- | --- | --- |
| Memory | Low | Medium | Low | Low |
| Forward Traversal | ✅ | ✅ | ✅ | ✅ |
| Backward Traversal | ❌ | ✅ | ✅ (DLL) | ❌ |
| Insert/Delete at ends | Medium | Easy | Medium | Easy |
| Real-life Example | Train | Browser | Playlist | System list |

---

## 🎯 5. Applications of Linked Lists

| Application | Type Used | Real World Reference |
| --- | --- | --- |
| Browser History | Doubly Linked List | Back and Forward buttons |
| Undo/Redo Features | Doubly Linked List | Text editors |
| Music Player | Circular Linked List | Looped playlists |
| Memory Mgmt (Free Blocks) | Header Linked List | OS memory allocation |
| Stack/Queue | Singly Linked List | Data processing in memory |

---

## 🧪 Practice Problems

| Platform | Problem | Link |
| --- | --- | --- |
| GeeksforGeeks | [DLL Insertion](https://www.geeksforgeeks.org/doubly-linked-list/) | Basics |
| LeetCode | [Flatten a Multilevel DLL](https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/) | Interview Level |
| GeeksforGeeks | [Circular LL Insertion](https://www.geeksforgeeks.org/circular-linked-list/) | Full tutorial |
| InterviewBit | [Palindrome Linked List](https://www.interviewbit.com/problems/palindrome-list/) | Reverse check |

---

## 💡 What You Learned

- How to implement and use different types of linked lists
- Use cases of DLL, CLL, Header LL
- Practical logic that helps in building data structures like **stacks**, **queues**, and **memory allocators**

---

# 🧱 Linked Lists in Action

## 🪜 Stacks and Queues using Linked Lists

---

## 💡 Why Use Linked Lists?

Unlike array-based stacks/queues:

| Limitation in Array | How Linked List Solves It |
| --- | --- |
| Fixed size | Dynamic size (no overflow) |
| Insert/Delete shifts | Direct memory manipulation |
| Space wastage | Allocates only when needed |

---

## 🥞 1. Stack Using Linked List

A **stack** follows **LIFO** – Last In, First Out.

### 🏗 Structure:

```c
struct StackNode {
    int data;
    struct StackNode* next;
};

```

### ✅ Push (Insert at Beginning)

```c
void push(struct StackNode** top_ref, int data) {
    struct StackNode* new_node = (struct StackNode*) malloc(sizeof(struct StackNode));
    new_node->data = data;
    new_node->next = *top_ref;
    *top_ref = new_node;
}

```

### ❌ Pop (Delete from Beginning)

```c
int pop(struct StackNode** top_ref) {
    if (*top_ref == NULL) return -1;  // Underflow

    struct StackNode* temp = *top_ref;
    int popped = temp->data;
    *top_ref = temp->next;
    free(temp);
    return popped;
}

```

### 👀 Peek

```c
int peek(struct StackNode* top) {
    if (top == NULL) return -1;
    return top->data;
}

```

---

## 📦 2. Queue Using Linked List

A **queue** follows **FIFO** – First In, First Out.

### 🏗 Structure

```c
struct QNode {
    int data;
    struct QNode* next;
};

struct Queue {
    struct QNode *front, *rear;
};

```

### ✅ Enqueue (Insert at End)

```c
void enqueue(struct Queue* q, int value) {
    struct QNode* temp = (struct QNode*) malloc(sizeof(struct QNode));
    temp->data = value;
    temp->next = NULL;

    if (q->rear == NULL) {
        q->front = q->rear = temp;
        return;
    }

    q->rear->next = temp;
    q->rear = temp;
}

```

### ❌ Dequeue (Delete from Front)

```c
int dequeue(struct Queue* q) {
    if (q->front == NULL) return -1;  // Underflow

    struct QNode* temp = q->front;
    int data = temp->data;
    q->front = q->front->next;

    if (q->front == NULL)
        q->rear = NULL;

    free(temp);
    return data;
}

```

---

## 📊 Stack vs Queue Comparison

| Feature | Stack | Queue |
| --- | --- | --- |
| Order | LIFO | FIFO |
| Use in Memory | Function call stack | Process scheduling |
| Insert (Push) | At Head | At Tail |
| Remove (Pop) | From Head | From Head |

---

## 🧠 Real-Life Applications

| Data Structure | Use Case |
| --- | --- |
| Stack | Undo operations, recursion, parsing |
| Queue | OS Job Scheduling, Print Queue, BFS |

---

## 🔗 Practice Problems

| Platform | Problem | Link |
| --- | --- | --- |
| LeetCode | [Min Stack](https://leetcode.com/problems/min-stack/) | Stack + Logic |
| LeetCode | [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) | Queue tricks |
| GFG | [Implement Stack using Linked List](https://www.geeksforgeeks.org/implement-a-stack-using-singly-linked-list/) | Basics |
| GFG | [Implement Queue using Linked List](https://www.geeksforgeeks.org/queue-linked-list-implementation/) | Basics |
| HackerRank | [Queue using Linked List](https://www.hackerrank.com/challenges/queue-using-two-stacks/problem) | Hybrid logic |

---

## ✅ Summary

- You learned how to implement **stack** and **queue** using a **linked list** — giving you flexibility and performance.
- These operations **don’t require shifting elements**, hence are faster for large-scale data.

---