# 📘 Tree Data Structures

---

## 🌳 1. What is a Tree?

- A **Tree** is a **hierarchical data structure**.
- It is made of **nodes** connected by **edges**.
- Think of it like a **family tree** or **file explorer** (folders inside folders).

---

## 🧩 2. Terminology

- **Node** → Each element in a tree.
- **Root** → The topmost node of the tree.
- **Parent** → A node that has child nodes.
- **Child** → A node that comes from a parent.
- **Leaf** → A node with no children.
- **Siblings** → Nodes having the same parent.
- **Height of Tree** → Longest path from root to leaf.
- **Depth of Node** → Distance from root to that node.

![alt text](image.png)

Example:

```
        A (root)
       / \
      B   C
     / \
    D   E
```

- A → root
- B, C → children of A
- D, E → children of B
- D, E, C → leaf nodes

---

## 🌲 3. Types of Trees

---

## 1. **General Tree**

- A node can have **any number of children**.
- Example: A family tree or company hierarchy.

```
         A
      /  |  \
     B   C   D
        / \
       E   F
```

---

## 2. **Binary Tree**

- Each node has **at most 2 children**: **Left** and **Right**.

```
        A
       / \
      B   C
     / \
    D   E
```

---

## 3. **Full Binary Tree**

- Every node has either **0 or 2 children**.
- No node has only one child.

```
        A
       / \
      B   C
     / \
    D   E
```

---

## 4. **Complete Binary Tree**

- All levels are completely filled **except possibly the last**.
- The last level is filled from **left to right**.

```
        A
       / \
      B   C
     / \  /
    D  E F
```

---

## 5. **Perfect Binary Tree**

- All **internal nodes have 2 children**.
- All **leaf nodes are at the same level**.

```
        A
       / \
      B   C
     / \ / \
    D  E F  G
```

---

## 6. **Binary Search Tree (BST)**

- Special Binary Tree with ordering rule:

  - Left child < Parent
  - Right child > Parent

```
        50
       /  \
     30    70
    / \   / \
  20  40 60  80
```

---

## 7. **AVL Tree (Balanced BST)**

- A **self-balancing BST**.
- Height difference between left & right subtree ≤ 1.
- Ensures **fast searching (O(log n))**.

---

## 8. **Red-Black Tree**

- A **balanced BST** with nodes colored **Red or Black**.
- Maintains balance using **coloring rules**.
- Used in **databases, OS, libraries**.

---

## 9. **Threaded Binary Tree**

- Special Binary Tree that makes **traversal faster**.
- Unused pointers are replaced with **links to next node**.

---

## 10. **Expression Tree**

- A binary tree used to represent **mathematical expressions**.
- Operators → Internal nodes, Operands → Leaf nodes.

Example: Expression `(a + b) * c`

```
        *
       / \
      +   c
     / \
    a   b
```

---

## 11. **B-Tree**

- A **multi-way search tree**.
- Used in **databases & file systems**.
- Stores large amounts of data efficiently.

---

## 12. **Heap Tree**

- A **complete binary tree**.
- Types:

  - **Max Heap** → Parent ≥ children
  - **Min Heap** → Parent ≤ children

- Used in **priority queues**.

---

## 📑 Summary Table

| Tree Type            | Special Property              | Example Use |
| -------------------- | ----------------------------- | ----------- |
| General Tree         | Any number of children        | Family tree |
| Binary Tree          | Max 2 children                | Basic DS    |
| Full Binary Tree     | 0 or 2 children only          | Structure   |
| Complete Binary Tree | Filled left to right          | Heap        |
| Perfect Binary Tree  | All leaves at same level      | Ideal case  |
| BST                  | Ordered left < root < right   | Searching   |
| AVL Tree             | Balanced BST (height ≤1 diff) | Fast search |
| Red-Black Tree       | Balanced with colors          | Databases   |
| Threaded Tree        | Fast traversal using links    | Memory save |
| Expression Tree      | Represents math expressions   | Compilers   |
| B-Tree               | Multi-way search              | Databases   |
| Heap Tree            | Min/Max property              | Priority Q  |

---

## 🏗️ 4. Tree Representation in C

### 🔹 Using Structures (Linked Representation)

```c
#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

// Create a new node
struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->left = newNode->right = NULL;
    return newNode;
}
```

### 🔹 Using Arrays (For Complete Binary Trees Only)

- Store nodes in an array like heap.
- Example:

```
Index:   0   1   2   3   4   5
Value:   A   B   C   D   E   F
```

- Parent at `i`, Left Child at `2*i+1`, Right Child at `2*i+2`.

---

## 🔄 5. Tree Traversals

Traversal means visiting all nodes.

1. **Inorder (Left → Root → Right)**

   - Example BST: Output → Sorted order

2. **Preorder (Root → Left → Right)**

   - Used in copying trees

3. **Postorder (Left → Right → Root)**

   - Used in deleting trees

### C Implementation of Traversals

```c
void inorder(struct Node* root) {
    if (root != NULL) {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}

void preorder(struct Node* root) {
    if (root != NULL) {
        printf("%d ", root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(struct Node* root) {
    if (root != NULL) {
        postorder(root->left);
        postorder(root->right);
        printf("%d ", root->data);
    }
}
```

---

## ⚙️ 6. Operations on BST

### 🔹 Insertion

```c
struct Node* insert(struct Node* root, int value) {
    if (root == NULL) return createNode(value);
    if (value < root->data) root->left = insert(root->left, value);
    else if (value > root->data) root->right = insert(root->right, value);
    return root;
}
```

### 🔹 Searching

```c
struct Node* search(struct Node* root, int key) {
    if (root == NULL || root->data == key) return root;
    if (key < root->data) return search(root->left, key);
    return search(root->right, key);
}
```

### 🔹 Deletion (3 Cases)

1. Node is a leaf → Delete directly.
2. Node has one child → Replace with child.
3. Node has two children → Replace with **inorder successor**.

---

## 📑 7. Applications of Trees

- **Expression Trees** → Used to evaluate math expressions.
- **Databases** → Indexing with B-trees.
- **File Systems** → Directory structures.
- **Networking** → Routing algorithms.
- **AI/ML** → Decision Trees.

---

## 🎯 8. Quick Comparison

| Type of Tree | Special Property              | Use Case               |
| ------------ | ----------------------------- | ---------------------- |
| Binary Tree  | Max 2 children                | General representation |
| BST          | Ordered left < root < right   | Searching & sorting    |
| AVL Tree     | Balanced BST                  | Faster searching       |
| Red-Black    | Balanced BST with color rules | OS, Databases          |

---
