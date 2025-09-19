---
# 🔎 Searching and Sorting
---

## **1. Searching**

Searching means **finding something** in a list.

### ✅ Linear Search

- Look at every item one by one until you find what you want.
- Example: Searching for your name in a long list of names written in a notebook.

```c
for (i = 0; i < n; i++) {
    if (arr[i] == key) return i; // found
}
```

---

### ✅ Binary Search

- Works only on **sorted lists**.
- Repeatedly divide the list in half until you find the item.
- Example: Looking for a word in a dictionary → You don’t start from page 1, you open in the middle.

```c
while (low <= high) {
    mid = (low + high) / 2;
    if (arr[mid] == key) return mid;
    else if (arr[mid] < key) low = mid + 1;
    else high = mid - 1;
}
```

---

### ✅ Interpolation Search

- Faster version of Binary Search (for evenly distributed data).
- Jumps closer to where the item might be.
- Example: If you are searching for house number **90** in a street with numbers from 1 to 100, you directly go near 90 instead of starting at 50.

```c
while (low <= high && key >= arr[low] && key <= arr[high]) {
    pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);
    if (arr[pos] == key) return pos;
    else if (arr[pos] < key) low = pos + 1;
    else high = pos - 1;
}
```

---

## **2. Sorting**

Sorting means **arranging things in order** (smallest to largest or alphabetically).

---

### ✅ Bubble Sort

- Compare two numbers → swap if wrong order.
- Repeat until sorted.
- Example: Like bubbles in soda rising to the top.

```c
for (i = 0; i < n-1; i++) {
    for (j = 0; j < n-i-1; j++) {
        if (arr[j] > arr[j+1]) swap(arr[j], arr[j+1]);
    }
}
```

---

### ✅ Selection Sort

- Find the **smallest number** and put it at the beginning.
- Repeat for next positions.
- Example: Teacher asks students to stand from shortest to tallest → you pick the shortest each time.

```c
for (i = 0; i < n-1; i++) {
    min = i;
    for (j = i+1; j < n; j++) {
        if (arr[j] < arr[min]) min = j;
    }
    swap(arr[i], arr[min]);
}
```

---

### ✅ Insertion Sort

- Take one element and insert it into the right place in the sorted part.
- Example: Arranging playing cards in your hand.

```c
for (i = 1; i < n; i++) {
    key = arr[i];
    j = i-1;
    while (j >= 0 && arr[j] > key) {
        arr[j+1] = arr[j];
        j--;
    }
    arr[j+1] = key;
}
```

---

### ✅ Merge Sort (Divide & Conquer)

- Split the list into halves → sort each half → join (merge) them.
- Example: Splitting homework into parts, solving each part, then combining.
  Divide and conquer.
  Divide array into halves, sort, and merge.
  Stable and O(n log n) always.

```c
void merge(int arr[], int l, int m, int r) {
    int n1 = m - l + 1, n2 = r - m;
    int L[n1], R[n2];

    for (int i = 0; i < n1; i++) L[i] = arr[l + i];
    for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) arr[k++] = L[i++];
        else arr[k++] = R[j++];
    }
    while (i < n1) arr[k++] = L[i++];
    while (j < n2) arr[k++] = R[j++];
}

void mergeSort(int arr[], int l, int r) {
    if (l < r) {
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
}
```

---

### ✅ Quick Sort (Divide & Conquer)

- Pick a **pivot** (any number).
- Put smaller numbers on the left, bigger on the right.
- Repeat for each side.
- Example: Choosing a team captain (pivot), dividing players into “stronger” and “weaker” groups.
- Divide and conquer.
- Pick a pivot, partition array, then sort recursively.
- Average case O(n log n).

```c
int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
        }
    }
    int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
    return i + 1;
}

void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
```

---

### ✅ Radix Sort

- Sort by **digits place** (1s, 10s, 100s).
- Example: Sorting roll numbers → first by last digit, then by middle, then by first digit.
- Non-comparison sorting.
- Sorts numbers digit by digit using counting sort.
- Works in O(nk) (n = elements, k = digits).

```c
int getMax(int arr[], int n) {
    int max = arr[0];
    for (int i = 1; i < n; i++)
        if (arr[i] > max) max = arr[i];
    return max;
}

void countingSort(int arr[], int n, int exp) {
    int output[n], count[10] = {0};

    for (int i = 0; i < n; i++)
        count[(arr[i] / exp) % 10]++;

    for (int i = 1; i < 10; i++)
        count[i] += count[i - 1];

    for (int i = n - 1; i >= 0; i--) {
        output[count[(arr[i] / exp) % 10] - 1] = arr[i];
        count[(arr[i] / exp) % 10]--;
    }

    for (int i = 0; i < n; i++)
        arr[i] = output[i];
}

void radixSort(int arr[], int n) {
    int max = getMax(arr, n);
    for (int exp = 1; max / exp > 0; exp *= 10)
        countingSort(arr, n, exp);
}
```

---

# 🌟 Summary

Interpolation Search → fast search on sorted & uniform data.

Selection Sort → simple, O(n²).

Insertion Sort → good for nearly sorted arrays.

Bubble Sort → educational but inefficient.

Quick Sort → fastest in practice, O(n log n) average.

Merge Sort → stable, always O(n log n).

Radix Sort → non-comparison, good for integers.

---
