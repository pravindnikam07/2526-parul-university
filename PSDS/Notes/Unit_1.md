# 📝 Introduction to Problem Solving and Algorithms

## 🧠 1. What is Problem Solving?

### 📘 What Does "Problem Solving" Mean?

Problem solving is the process of finding a way to reach a goal when the way is not immediately clear.

Think of it like this:

You want to open a locked door.

You try to use a key, then a pin, then maybe even call for help.

All these steps are part of problem solving.

### 🧩 Real-Life Examples

| Problem            | Goal         | How You Solve It                               |
| :----------------- | :----------- | :--------------------------------------------- |
| You're hungry      | Eat food     | Go to the kitchen, cook or grab a snack        |
| Your toy is broken | Fix the toy  | Use glue, tools, or ask a parent               |
| Math homework      | Find answers | Read the question, try steps, check the result |

### 🛠️ Problem Solving in Computers

When computers solve problems, we give them step-by-step instructions.

These steps are called an **algorithm**.

### 📋 What is an Algorithm?

An **algorithm** is a list of steps you follow to solve a problem.

**🧼 Example: Washing Hands**

1.  Turn on the tap.
2.  Wet your hands.
3.  Take soap.
4.  Rub hands for 20 seconds.
5.  Rinse hands.
6.  Turn off the tap.
7.  Dry your hands.

💡 That’s an algorithm! Simple, right?

### 👩‍💻 Problem Solving in Programming

When we write code, we are really doing this:

1.  Understanding the problem
2.  Breaking it into smaller parts
3.  Writing steps (**algorithm**)
4.  Writing code to follow those steps
5.  Testing to see if it works

### 🧠 Key Skills in Problem Solving

- **Observation** – Understand the problem.
- **Planning** – Think of possible ways to solve it.
- **Breaking Down** – Divide big problems into smaller ones.
- **Testing** – Try it out and see if your solution works.
- **Fixing Mistakes (Debugging)** – If it doesn’t work, fix it and try again.

### 💡 Fun Analogy: Problem Solving Is Like Making Maggi 🍜

- **Problem:** You're hungry.
- **Goal:** Eat tasty Maggi.
- **Steps (Algorithm):** Boil water → Add Maggi → Add masala → Stir → Cook → Serve.
- **Success!** You solved the problem!

---

## 🧱 2. What is a Data Structure?

### 📘 Simple Definition

A **Data Structure** is a special way of organizing and storing data in a computer, so that we can use it efficiently.

### 🧠 Real-Life Example

Imagine your school bag:

- 📚 Books are stacked one on top of another → Like a **Stack**
- 🎒 Pencils are kept in a case with slots → Like an **Array**
- 📝 Your subjects are written in a timetable → Like a **Table or List**

So, your bag is like a data structure that holds useful things in an organized way!

### 💻 Why Do We Need Data Structures?

When a computer solves a problem, it needs to:

- Store information (like numbers, names, tasks)
- Find or update that information quickly
- Organize things properly

Without data structures, the computer would just dump everything in one place — and that would be a big mess!

### 🧺 Everyday Analogy: Kitchen Drawers

| Drawer Type       | What's Inside                | Data Structure It Represents |
| :---------------- | :--------------------------- | :--------------------------- |
| Cutlery Tray      | Spoons, forks in rows        | **Array**                    |
| Spice Rack        | Jars with labels             | **Map** (key-value pair)     |
| Stack of Plates   | Plates on top of each other  | **Stack**                    |
| Queue at a buffet | First person gets food first | **Queue**                    |

### 🛠️ Common Tasks Made Easy With Data Structures

| Task                        | Data Structure Used   |
| :-------------------------- | :-------------------- |
| Store a list of students    | **Array** or **List** |
| Store name and phone number | **Dictionary / Map**  |
| Go back in a browser        | **Stack**             |
| Print documents in order    | **Queue**             |

### 🔁 Fun Example: Ice Cream Shop 🍦

You’re running an ice cream shop.

- You have 5 flavors. Customers come one by one.
- You store flavors in an **Array**.
- Orders are taken in a **Queue**.
- If someone cancels, you use **Delete**.
- If new flavors come, you use **Insert**.

➡️ The shop is your program, and the way you manage data is your data structure!

### 💡 Summary

- Data Structures help store and organize data.
- They make our programs faster, smarter, and more organized.
- Without data structures, computers would get confused.

---

## 🧩 3. Types of Data Structures

Data structures come in different types. Some are simple, some are more complex — but each one has a specific purpose!

We can divide data structures into two main categories:

### 🧪 A. Primitive Data Structures

These are the basic building blocks. They are already built into programming languages.

🧱 **Examples:**

- `int` – for whole numbers like 1, 10, -5
- `float` – for decimal numbers like 3.14, 9.8
- `char` – for single letters like 'A', 'z'
- `bool` – for true or false
- `string` – for words like "apple" or "hello"

🧠 **Analogy:**
Primitive data types are like LEGO blocks. You use them to build bigger things (just like structures or arrays).

### 🏗️ B. Non-Primitive Data Structures

These are advanced structures built using primitive data types.

We divide these into two categories:

#### 🔹 1. Linear Data Structures

Data is arranged one after another — like a line.

| Structure       | Description                             |
| :-------------- | :-------------------------------------- |
| **Array**       | Fixed-size collection of items in order |
| **Linked List** | Items linked together using pointers    |
| **Stack**       | Follows "Last In, First Out" (LIFO)     |
| **Queue**       | Follows "First In, First Out" (FIFO)    |

🚌 **Real-Life Examples:**

- **Array:** Seats in a row of a bus
- **Stack:** Plates in a pile
- **Queue:** People standing in a line for movie tickets

#### 🔸 2. Non-Linear Data Structures

Data is arranged in a branching way — like a tree or web.

| Structure | Description                                        |
| :-------- | :------------------------------------------------- |
| **Tree**  | Like a family tree (parent-child relationship)     |
| **Graph** | Items connected in all directions (like a network) |

🌳 **Real-Life Examples:**

- **Tree:** Folder structure in a computer
- **Graph:** Social media friends connection

### 🧠 Summary Table

| Type              | Subtype        | Example        | Used For                     |
| :---------------- | :------------- | :------------- | :--------------------------- |
| **Primitive**     | –              | `int`, `float` | Simple values                |
| **Non-Primitive** | **Linear**     | Array, Stack   | Ordered data                 |
|                   | **Non-Linear** | Tree, Graph    | Hierarchical or network data |

### 📌 Quick Recap:

- **Primitive** = Small basic pieces like numbers, letters.
- **Non-Primitive** = Bigger structures made using primitives.
- **Linear** = Straight line (one after another).
- **Non-Linear** = Branches and networks.

---

## 🔧 4. Common Operations on Data Structures

Data structures are not just for storing data — we can do many actions on them. These actions are called **operations**.

### 🧠 What Are Operations?

Operations are things we do with data:

- Adding new data
- Removing data
- Looking for data
- Changing data
- Arranging data

### 🛠️ Most Common Operations

Let’s learn each operation with simple explanations and examples!

#### 1. Insertion

💡 **Adding a new element to the data structure**

**Example:**
If you have a list of toys:
`["Car", "Doll", "Ball"]`

And you get a new toy "Robot".
**After insertion:**
`["Car", "Doll", "Ball", "Robot"]`

#### 2. Deletion

💡 **Removing an element from the data structure**

**Example:**
List: `["Car", "Doll", "Ball"]`

Remove "Doll"
**After deletion:**
`["Car", "Ball"]`

#### 3. Traversal

💡 **Visiting or looking at each element, one by one**

**Example:**
List: `["Apple", "Banana", "Cherry"]`
**Traversal:**

👀 Look at "Apple" → 👀 "Banana" → 👀 "Cherry"

#### 4. Searching

💡 **Finding if a value exists in the structure and where**

**Example:**
Search for "Banana" in `["Apple", "Banana", "Cherry"]`
**Found at position 2 ✅**

#### 5. Updating

💡 **Changing the value of an existing element**

**Example:**
List: `["Dog", "Cat", "Fish"]`

Change "Cat" to "Rabbit"
**Now the list is:** `["Dog", "Rabbit", "Fish"]`

#### 6. Sorting

💡 **Rearranging the elements in a specific order**

**Example:**
List: `[5, 2, 9, 1]`

**After sorting (ascending):** `[1, 2, 5, 9]`

### 🛒 Real-Life Analogy: Grocery Shelf

| Action                      | Operation     |
| :-------------------------- | :------------ |
| Put a new item              | **Insertion** |
| Remove expired item         | **Deletion**  |
| Check every item            | **Traversal** |
| Look for "milk"             | **Searching** |
| Replace "juice" with "soda" | **Updating**  |
| Arrange items by name       | **Sorting**   |

### 📌 Summary Table

| Operation     | What it Does               |
| :------------ | :------------------------- |
| **Insertion** | Adds data                  |
| **Deletion**  | Removes data               |
| **Traversal** | Visits every data item     |
| **Searching** | Finds a specific data item |
| **Updating**  | Changes a data item        |
| **Sorting**   | Arranges data              |

---

## 📦 5. Arrays: Review and Concepts

### 🧠 What is an Array?

An **array** is a special box that stores multiple values of the **same type** — all in a single line, side by side.

Think of it like an egg carton.

Each egg goes in its own space (slot), and all slots are in order.

**🧺 Real-Life Analogy: Pencil Box with Slots**

- Slot 0 → ✏️ Pencil
- Slot 1 → 🖊️ Pen
- Slot 2 → 🖍️ Crayon
- Slot 3 → 🖌️ Brush

Just like that, in an array:

`Index: 0    1    2    3`
`Array: [10, 20, 30, 40]`

You can access each item by its **index** (position number).

### 🔢 Characteristics of Arrays

| Feature               | Description                                                              |
| :-------------------- | :----------------------------------------------------------------------- |
| **Fixed Size**        | You must decide how many elements when you create it                     |
| **Same Type**         | All elements must be of the same type (e.g., all numbers or all letters) |
| **Indexing**          | Starts from 0                                                            |
| **Continuous Memory** | Stored one after another in memory                                       |

### 🧮 Example in C Language

```c
int numbers[5] = {10, 20, 30, 40, 50};
```

This creates an array named `numbers` with 5 slots.

| Index | Value |
| :---- | :---- |
| 0     | 10    |
| 1     | 20    |
| 2     | 30    |
| 3     | 40    |
| 4     | 50    |

### 🛠️ How Do You Access Elements?

You use index numbers.

```c
printf("%d", numbers[2]);  // Output: 30
```

This prints the value at index 2 (which is 30).

### 📌 Static vs. Dynamic Arrays

| Type              | Explanation                         | Example                                |
| :---------------- | :---------------------------------- | :------------------------------------- |
| **Static Array**  | Fixed size, created at compile time | `int arr[10];`                         |
| **Dynamic Array** | Size can change, created at runtime | `int* arr = malloc(10 * sizeof(int));` |

We'll learn more about dynamic arrays when we study memory allocation.

### 📦 Use of Arrays in Real Life

- Storing marks of students
- Keeping track of prices
- Saving pixel values of an image
- Holding data in games (like player scores)

### ✅ Advantages of Arrays

- Easy to use and understand
- Fast access using index
- Works well when the number of elements is known

### ⚠️ Disadvantages

- Fixed size (can waste memory or be too small)
- Inserting/deleting in the middle is slow

### 🧠 Summary

- Arrays store many items of the same type.
- Use index numbers to get or set values.
- They are stored in a straight line in memory.
- Useful for storing data in order.

---

## 🧱 6. Structures and Unions

In programming, especially in C/C++, we sometimes need to store different types of data together — like a name (text), age (number), and grade (letter). For that, we use **structures** and **unions**.

---

### 🧳 A. What is a Structure?

A **structure** (or `struct`) is a user-defined data type that lets you combine different types of variables under one name.

👨‍👩‍👦 **Real-Life Analogy: Student Record**
A student has:

- Name (text)
- Roll number (number)
- Marks (decimal)

You can store this using a structure!

#### 🧮 Structure Example in C

```c
struct Student {
    char name[20];
    int roll;
    float marks;
};
```

This means every `Student` will have a name, a roll number, and marks.

#### 👨‍🎓 Using the Structure

```c
struct Student s1;

strcpy(s1.name, "Aarav");
s1.roll = 5;
s1.marks = 89.5;
```

Now you’ve stored information about one student — all in one variable\!

#### 🎁 Why Use Structures?

- To group related information together
- To organize real-world objects (e.g., Book, Car, Employee)
- Makes code cleaner and easier to manage

#### 🔄 Structure vs. Array

| Feature                       | Structure        | Array                  |
| :---------------------------- | :--------------- | :--------------------- |
| Can store different types?    | ✅ Yes           | ❌ No (only same type) |
| Organizes real-world objects? | ✅ Yes           | 🚫 Not directly        |
| Example                       | Name, age, marks | Just marks             |

---

### 🔗 B. What is a Union?

A **union** is like a structure, but all members **share the same memory space**.
That means **only one value can be used at a time**.

#### 🧮 Union Example

```c
union Data {
    int i;
    float f;
    char str[20];
};
```

If you assign a value to `i`, and then assign to `f`, the value of `i` is lost.

#### 🧠 Structure vs. Union

| Feature                            | Structure                       | Union                        |
| :--------------------------------- | :------------------------------ | :--------------------------- |
| Memory                             | Each member gets separate space | All members share same space |
| Can store multiple values at once? | ✅ Yes                          | ❌ No                        |
| Usage                              | Student info                    | Memory-saving cases          |

#### 🧴 Real-Life Analogy: Bottle with Compartments

- **Structure:** A lunch box with separate sections. You can keep rice, curry, and salad — all at once.
- **Union:** One bowl for everything. If you put curry, the rice is replaced.

### ✅ Summary

- **Structure:** Combines multiple values of different types. Each member has its own memory.
- **Union:** Combines multiple values of different types but uses shared memory.
- Use structures when you need to store all values together.
- Use unions when you need to save memory and use one value at a time.

---

## 🔄 7. Self-Referential Structures

### 📘 What is a Self-Referential Structure?

A **self-referential structure** is a structure that includes a pointer to itself — or more exactly, to another structure of the same type.

It’s like making a chain of boxes, where each box knows about the next one.

### 🔗 Why Use Self-Referential Structures?

They are used to create linked data, such as:

- **Linked Lists**
- **Stacks**
- **Queues**
- **Trees**

These structures allow data to grow/shrink during runtime.

### 🧠 Real-Life Analogy: Train Coaches

Imagine a train:

- Each coach (structure) carries people (data).
- Each coach is connected to the next (pointer).

That’s a self-referential structure in action!

### 🧮 C Language Example

```c
struct Node {
    int data;
    struct Node* next;
};
```

In this example:

- `data` stores the actual number.
- `next` is a pointer to the next `Node`.

🧠 So, each `Node` can point to another `Node`, forming a chain.

### 🖼️ Visual Representation

`[ 10 | o ]` → `[ 20 | o ]` → `[ 30 | NULL ]`

Each box:

- Has a value
- Has a link (pointer) to the next one

The last node points to `NULL` (nothing).

### 🔁 Where Are Self-Referential Structures Used?

| Use Case           | Description                     |
| :----------------- | :------------------------------ |
| **Linked List**    | Each node points to the next    |
| **Stack (Linked)** | Push and pop using linked nodes |
| **Queue (Linked)** | First in, first out using links |
| **Tree**           | Each node points to child nodes |

### 🛠️ Code to Create a Simple Node

```c
#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

int main() {
    struct Node* head = NULL;
    head = (struct Node*) malloc(sizeof(struct Node));
    head->data = 100;
    head->next = NULL;

    printf("Data: %d\n", head->data);

    return 0;
}
```

This code:

- Creates a node dynamically
- Stores a value
- Points to nothing (`NULL`)

### 🧠 Summary

- A self-referential structure contains a pointer to its own type.
- It helps build dynamic and flexible data structures.
- Most powerful concept for creating linked data.

---

## 🎯 8. Pointers and Memory Addresses

### 📘 What is a Pointer?

A **pointer** is a variable that stores the **memory address** of another variable.

💡 Think of it as a GPS — it doesn’t store the building (value), it stores where the building is located (address).

### 🔢 Real-Life Analogy: House & Address

- 🏠 `value` = House
- 📬 `address` = Where the house is on the map
- 📍 `pointer` = A note that tells you where the house is

### 📦 Example in C

```c
int x = 10;
int *ptr = &x;
```

| Term  | Meaning                              |
| :---- | :----------------------------------- |
| `x`   | A variable with value 10             |
| `&x`  | Address of `x`                       |
| `ptr` | A pointer storing the address of `x` |

### 🧠 What Does `*` Mean?

`*` is called the **dereference operator**.
It tells the computer: “Give me the value from this address.”

```c
printf("%d", *ptr); // Output: 10
```

### 🗂️ Memory Diagram

Let’s visualize it:

| Variable | Address | Value                 |
| :------- | :------ | :-------------------- |
| `x`      | 2002    | 10                    |
| `ptr`    | 3001    | 2002 (address of `x`) |

If you do `*ptr`, it will go to address 2002 and give you value 10.

### 🧠 Why Use Pointers?

| Reason                    | Benefit                                   |
| :------------------------ | :---------------------------------------- |
| **Dynamic memory**        | Allocate memory during program running    |
| **Pass by reference**     | Modify variables inside functions         |
| **Link data**             | Build structures like linked lists, trees |
| **Low-level programming** | Used in drivers, OS, embedded systems     |

### 🛠️ Declaring and Using a Pointer

```c
int num = 5;
int *p = &num;

printf("Value: %d\n", num);    // Output: 5
printf("Address: %p\n", &num); // Address of num
printf("Pointer: %p\n", p);    // Same address
printf("Dereference: %d\n", *p); // Output: 5
```

### ⚠️ Common Mistakes with Pointers

| Mistake                     | Problem                               |
| :-------------------------- | :------------------------------------ |
| Using uninitialized pointer | Might point to garbage memory         |
| Forgetting to use `&`       | Won’t get the correct address         |
| Not freeing memory          | Causes memory leaks in large programs |

### 💡 Pointer Types

| Type     | Description                             |
| :------- | :-------------------------------------- |
| `int*`   | Points to an integer                    |
| `float*` | Points to a float                       |
| `char*`  | Points to a character                   |
| `void*`  | Generic pointer (can point to anything) |

### 🧠 Summary

- A pointer stores the address of another variable.
- `*` is used to get the value from an address.
- Pointers are powerful and essential for dynamic programming and data structures.

---

## 💾 9. Dynamic Memory Allocation

### 📘 What is Dynamic Memory Allocation?

**Dynamic memory allocation** means asking the computer to create memory space **while the program is running**, not before.

💡 It’s like ordering more seats in a restaurant while people are coming in, instead of fixing the number at the start.

### 🧠 Why Do We Need It?

With arrays, we must fix the size beforehand.

What if we need more space later?
Dynamic allocation lets us:

- Use memory only when needed
- Change the size during execution
- Create flexible data structures like Linked Lists

### 📦 How Do We Allocate Memory in C?

We use four main functions from `<stdlib.h>`:

| Function    | Purpose                                        |
| :---------- | :--------------------------------------------- |
| `malloc()`  | Allocates a memory block                       |
| `calloc()`  | Allocates a memory block and initializes to 0  |
| `free()`    | Frees the memory block                         |
| `realloc()` | Changes the size of an already allocated block |

#### 🧮 1. `malloc()` – Memory Allocation

```c
int* ptr = (int*) malloc(5 * sizeof(int));
```

- Reserves space for 5 integers
- Returns the address of the first block
- ⚠️ It does **NOT** initialize the values (they may contain garbage)

#### 🧮 2. `calloc()` – Clear Allocation

```c
int* ptr = (int*) calloc(5, sizeof(int));
```

- Also reserves space for 5 integers
- But initializes them all to 0

#### 🧽 3. `free()` – Freeing the Memory

```c
free(ptr);
```

- Releases the memory back to the system
- **Very important\!** Not doing this causes **memory leaks**.

#### 🔄 4. `realloc()` – Resize Memory

```c
ptr = realloc(ptr, 10 * sizeof(int));
```

- Changes the size to 10 integers
- Keeps the old data and adds new space

### 🧠 Memory Allocation Visual

Let’s say we used `malloc` to allocate space for 3 integers:

`ptr` → `[ __ | __ | __ ]`
`0` `1` `2`

We store values:
`ptr[0] = 10;`
`ptr[1] = 20;`
`ptr[2] = 30;`

Then we `realloc` it to size 5:

`ptr` → `[ 10 | 20 | 30 | __ | __ ]`

### 🧠 Example Program Using `malloc`

```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int* arr;
    arr = (int*) malloc(3 * sizeof(int));

    arr[0] = 5;
    arr[1] = 10;
    arr[2] = 15;

    for(int i = 0; i < 3; i++) {
        printf("%d ", arr[i]);
    }

    free(arr);
    return 0;
}
```

### ✅ Summary

| Function    | Use                                 |
| :---------- | :---------------------------------- |
| `malloc()`  | Allocates memory (uninitialized)    |
| `calloc()`  | Allocates memory (initialized to 0) |
| `realloc()` | Resizes existing memory             |
| `free()`    | Frees up memory                     |

- Dynamic memory allows programs to be more flexible.
- Always use `free()` to avoid memory leaks.

---

## 🧠 10. How Arrays Are Stored in Memory (Static and Dynamic)

Understanding how arrays are stored in memory helps us write faster and smarter programs.

### 📘 What Happens When You Create an Array?

When you create an array, the computer:

- Reserves a block of memory
- Puts the elements side by side (**contiguous memory**)
- Uses index numbers to access each element quickly

### 🔢 Example: Static Array

```c
int arr[4] = {10, 20, 30, 40};
```

Let’s assume the array starts at memory address 1000 and `int` takes 4 bytes.

| Index | Value | Memory Address |
| :---- | :---- | :------------- |
| 0     | 10    | 1000           |
| 1     | 20    | 1004           |
| 2     | 30    | 1008           |
| 3     | 40    | 1012           |

✅ This helps the computer jump directly to any element using:

`Address = Base Address + (Index × Size of Element)`

So, to access `arr[2]`:
`= 1000 + (2 × 4) → 1008`

### ⚙️ How Dynamic Arrays Work

When you use `malloc()` or `calloc()`, the memory is taken from the **heap**, not the stack.

```c
int* arr = (int*) malloc(3 * sizeof(int));
```

This creates memory like this:

`arr` → `[ __ | __ | __ ]` (at unknown runtime address)

You then fill it with values:

`arr[0] = 5;`
`arr[1] = 10;`
`arr[2] = 15;`

✅ Dynamically created arrays are flexible — you can use `realloc()` to resize them\!

### 💡 Key Differences: Static vs Dynamic Arrays

| Feature                         | Static Array          | Dynamic Array                 |
| :------------------------------ | :-------------------- | :---------------------------- |
| **Memory location**             | Stack                 | Heap                          |
| **Size**                        | Fixed at compile-time | Can change at runtime         |
| **Declared using**              | `int arr[5];`         | `int* arr = malloc(...);`     |
| **Flexible?**                   | ❌ No                 | ✅ Yes                        |
| **Memory freed automatically?** | ✅ Yes                | ❌ No (You must use `free()`) |

### 🧠 Behind the Scenes: Access Time

Both static and dynamic arrays offer **O(1) time** for accessing an element because memory is laid out in a row (contiguous).

📦 This is why arrays are fast for searching using index\!

### 🧪 Summary

- Arrays are stored in contiguous memory.
- Static arrays are fixed in size, stored in the stack.
- Dynamic arrays are flexible, stored in the heap.
- Use `malloc()`/`free()` to handle dynamic arrays.

---

## ⏱️ 11. Performance Analysis of Algorithms – Time and Space Complexity

When we write programs, we want them to not only give the right answer, but also do it quickly and efficiently.
This is where **Performance Analysis** comes in.

### 📘 What Is an Algorithm?

An algorithm is a step-by-step set of instructions to solve a problem.
Now we ask:

- ❓ How fast is the algorithm?
- ❓ How much memory does it need?

These questions are answered using:

### 📊 A. Time Complexity

**Time complexity** tells us how long an algorithm takes to run, depending on the size of the input.

Think: ⏳ "How much time will it take if we have 10, 100, or 1000 items?"

We usually write time complexity using **Big O notation**: `O(...)`

#### 🧮 Common Time Complexities

| Time Complexity | What It Means    | Example                 |
| :-------------- | :--------------- | :---------------------- |
| **O(1)**        | Constant time    | Accessing `arr[5]`      |
| **O(n)**        | Linear time      | Loop through an array   |
| **O(n²)**       | Quadratic time   | Nested loops (2 levels) |
| **O(log n)**    | Logarithmic time | Binary Search           |
| **O(n log n)**  | Fast sorting     | Merge Sort              |
| **O(2ⁿ)**       | Exponential time | Recursive Fibonacci     |

🚗 **Example:**

- If you go to each house on a street: **O(n)**
- If you split the street in half each time: **O(log n)** (like guessing a number between 1–100)

### 🧠 What Does “n” Mean?

`n` is the size of the input.
If we loop through:

```c
for (int i = 0; i < n; i++) {
    // do something
}
```

➡️ Time complexity is **O(n)**

### 💾 B. Space Complexity

**Space complexity** tells us how much memory an algorithm uses.
Includes:

- Variables
- Arrays or data structures
- Call stack (especially in recursion)

🧠 **Example:**

```c
int sum = 0;
for (int i = 0; i < n; i++) {
    sum += i;
}
```

Here, no matter how big `n` is:

- We only use a few variables (`sum`, `i`)
  So, space complexity is **O(1)**

### 🎓 Why Analyze Time and Space?

| Without Analysis        | With Analysis              |
| :---------------------- | :------------------------- |
| May write slow code     | Can compare algorithms     |
| May use too much memory | Can optimize space         |
| Hard to scale           | Works well with large data |

### 🧠 Summary

| Concept              | Tells Us About | Measured As             |
| :------------------- | :------------- | :---------------------- |
| **Time Complexity**  | Speed          | O(1), O(n), O(log n)... |
| **Space Complexity** | Memory used    | O(1), O(n)...           |

✅ Good code is not just correct, it's also fast and efficient\!

---

## 🎯 12. Real-Time Examples of Algorithms

In this section, we’ll explore 4 classic problems:

- 🧮 **Factorial**
- 📏 **GCD** (Greatest Common Divisor)
- 🔢 **Fibonacci Sequence**
- 🗼 **Tower of Hanoi**

Each shows how we apply problem solving + data structures + recursion.

---

### 1️⃣ Factorial

🧠 **What Is It?**
The factorial of a number `n` is the product of all whole numbers from 1 to `n`.

**Factorial of 5 = 5 × 4 × 3 × 2 × 1 = 120 ✅**

🧪 **Formula:**
`n! = n × (n-1) × (n-2) ... × 1`

**Iterative Approach**

```c
#include <stdio.h>

int main() {
    int n, fact = 1;

    printf("Enter a number: ");
    scanf("%d", &n);

    for(int i = 1; i <= n; i++) {
        fact = fact * i;
    }

    printf("Factorial of %d is %d\n", n, fact);
    return 0;
}

```

🔁 **Using Recursion**

```c
int factorial(int n) {
    if (n == 0 || n == 1)
        return 1;
    else
        return n * factorial(n - 1);
}
```

---

### 2️⃣ GCD (Greatest Common Divisor)

🧠 **What Is It?**
The GCD of two numbers is the largest number that divides both numbers.

**GCD of 8 and 12 = 4 ✅**

Because:
8 = 2 × 2 × 2
12 = 2 × 2 × 3
Common factors: 2, 2 → Product = 4

**Iterative Approach**

```c
#include <stdio.h>

int main() {
    int a, b;

    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);

    while(a != b) {
        if(a > b)
            a = a - b;
        else
            b = b - a;
    }

    printf("GCD is %d\n", a);
    return 0;
}

```

🔁 **Euclidean Algorithm (Recursive)**

```c
int gcd(int a, int b) {
    if (b == 0)
        return a;
    else
        return gcd(b, a % b);
}
```

Fast and elegant\!

---

### 3️⃣ Fibonacci Sequence

🧠 **What Is It?**
A sequence where each number is the sum of the two before it:

**0, 1, 1, 2, 3, 5, 8, 13, ...**

🧪 **Formula:**
`F(n) = F(n-1) + F(n-2)`
with `F(0) = 0`, `F(1) = 1`

**Iterative Approach**

```c
#include <stdio.h>

int main() {
    int n, t1 = 0, t2 = 1, next;

    printf("Enter number of terms: ");
    scanf("%d", &n);

    printf("Fibonacci Series: ");

    for(int i = 1; i <= n; i++) {
        printf("%d ", t1);
        next = t1 + t2;
        t1 = t2;
        t2 = next;
    }

    return 0;
}

```

🔁 **Recursive Code**

```c
int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacci(n-1) + fibonacci(n-2);
}
```

⚠️ **Slow for big `n`** – better with loops or memoization.

---

### 4️⃣ Tower of Hanoi 🗼

🧠 **What Is It?**
A puzzle with:

- 3 rods (A, B, C)
- `n` disks stacked on rod A
- **Goal:** Move all disks to rod C

**Rules:**

- Only one disk at a time
- Never place a larger disk on a smaller one

🔁 **Recursive Solution**

```c
void towerOfHanoi(int n, char from, char to, char aux) {
    if (n == 1) {
        printf("Move disk 1 from %c to %c\n", from, to);
        return;
    }

    towerOfHanoi(n - 1, from, aux, to);
    printf("Move disk %d from %c to %c\n", n, from, to);
    towerOfHanoi(n - 1, aux, to, from);
}
```

📦 **Example Output for `n = 2`**

```
Move disk 1 from A to B
Move disk 2 from A to C
Move disk 1 from B to C
```

---