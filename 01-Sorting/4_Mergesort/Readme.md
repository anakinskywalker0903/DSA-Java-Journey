# Merge Sort

## Problem

* Problem statement: Given an integer array, sort it in ascending order using the **Merge Sort** algorithm.
* Example:

```text id="sm0b7j"
Input:
[5, 2, 3, 1]

Output:
[1, 2, 3, 5]
```

## Progress Score

**95/100**

I understood the overall Merge Sort algorithm, including the recursive divide-and-conquer approach. Most of my mistakes were inside the merge function, which is the most implementation-heavy part of the algorithm.

## What I Got Right

* I correctly recognized that Merge Sort uses recursion.
* I correctly divided the array into two halves.

```java id="i88mjl"
int mid = (low + high) / 2;
```

* I correctly made recursive calls on both halves.

```java id="y1ggmf"
mergeSort(nums, low, mid);
mergeSort(nums, mid + 1, high);
```

* I understood that the two sorted halves must be merged together.

```java id="uvcfp3"
merge(nums, low, mid, high);
```

* I correctly understood the purpose of the two pointers:

```java id="0lpkzv"
i = low
j = mid + 1
```

## Where I Got Stuck

### Logic Mistakes

* Compared the wrong way during merging.

I initially used:

```java id="3c77q9"
if(nums[i] > nums[j])
```

Instead of selecting the smaller element first:

```java id="20p7iz"
if(nums[i] <= nums[j])
```

* Forgot to handle one side of the merge correctly after one half was exhausted.

### Syntax/API Mistakes

* Declared the temporary list inside the merge loop.

```java id="a4mxxi"
while(...) {
    ArrayList<Integer> temp = new ArrayList<>();
}
```

which recreated the list every iteration.

The temporary list should be created once before merging begins.

### Edge-Case Mistakes

* Forgot to copy the merged elements back into the original array after the merge completed.

Without copying back, the recursive calls produce a sorted temporary list, but the original array never becomes sorted.

### Conceptual Misunderstandings

* Initially thought the merge process ended once the comparisons finished.

I later understood that Merge Sort has three distinct steps:

1. Merge while both halves contain elements.
2. Copy any remaining elements from the left half.
3. Copy any remaining elements from the right half.
4. Copy the merged result back into the original array.

## Hint (Without Spoiling)

Whenever you're writing the merge function, think of two sorted queues.

Ask yourself:

1. Which side currently has the smaller value?
2. After taking that value, which pointer should move?
3. What happens when one side becomes empty?
4. Where should the merged result finally be stored?

If you answer those four questions, the merge function almost writes itself.

## Pattern Learned

* Pattern: **Divide and Conquer ⭐**
* Why it matters: Instead of solving the entire problem at once, Merge Sort repeatedly divides it into smaller problems, solves them recursively, and combines the results.

### Divide

```java id="jlwmqk"
mid = (low + high) / 2;
```

↓

Recursively sort both halves.

### Conquer

```java id="z8sqy5"
merge(leftHalf, rightHalf);
```

↓

Produce one sorted array.

The merge operation itself combines two important techniques:

* Recursion
* Two Pointers

This pattern appears in:

* Merge Sort ✅
* Count Inversions
* Merge Intervals
* External Sorting
* Many Divide & Conquer algorithms

## Final Solution

### Java

```java id="wnf6nv"
import java.util.ArrayList;

class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp.add(nums[i]);
                i++;
            } else {
                temp.add(nums[j]);
                j++;
            }
        }

        while (i <= mid) {
            temp.add(nums[i]);
            i++;
        }

        while (j <= high) {
            temp.add(nums[j]);
            j++;
        }

        for (int k = low; k <= high; k++) {
            nums[k] = temp.get(k - low);
        }
    }
}
```

### Python

```python id="22z4i8"
class Solution:

    def sortArray(self, nums):

        self.mergeSort(nums, 0, len(nums) - 1)
        return nums

    def mergeSort(self, nums, low, high):

        if low >= high:
            return

        mid = (low + high) // 2

        self.mergeSort(nums, low, mid)
        self.mergeSort(nums, mid + 1, high)

        self.merge(nums, low, mid, high)

    def merge(self, nums, low, mid, high):

        i = low
        j = mid + 1

        temp = []

        while i <= mid and j <= high:

            if nums[i] <= nums[j]:
                temp.append(nums[i])
                i += 1
            else:
                temp.append(nums[j])
                j += 1

        while i <= mid:
            temp.append(nums[i])
            i += 1

        while j <= high:
            temp.append(nums[j])
            j += 1

        for k in range(low, high + 1):
            nums[k] = temp[k - low]
```

## Time Complexity

* Time:

  * **Best Case:** **O(N log N)**
  * **Average Case:** **O(N log N)**
  * **Worst Case:** **O(N log N)**
* Explanation: The array is repeatedly divided into halves (`log N` levels), and each level processes all `N` elements during merging.

## Space Complexity

* Space: **O(N)**
* Explanation: An additional temporary array is required during every merge operation.

## Coach's Note

Merge Sort is a major milestone because it combines multiple concepts you've already learned into a single algorithm.

Earlier in your journey, recursion and two pointers were separate topics:

* Recursion solved smaller problems.

* Two Pointers compared elements efficiently.

Merge Sort brings them together.

The biggest challenge wasn't recursion—it was writing the merge function correctly. That's completely normal because the merge step contains most of the implementation details.

What impressed me most is that you already understood the overall flow:

```text id="siv4tx"
Divide

↓

Recursively Sort

↓

Merge
```

The corrections were focused on the merge implementation rather than the recursive structure itself.

### Sorting Algorithms Learned

#### ✅ Selection Sort

**Idea**

> Find the smallest remaining element.

Time: **O(N²)**

---

#### ✅ Bubble Sort

**Idea**

> Swap adjacent elements that are out of order.

Worst Time: **O(N²)**

---

#### ✅ Insertion Sort

**Idea**

> Shift larger elements and insert the current element.

Worst Time: **O(N²)**

Best Time: **O(N)**

---

#### ✅ Merge Sort ⭐

**Idea**

> Divide the array recursively and merge sorted halves.

Time: **O(N log N)**

Space: **O(N)**

### DSA Pattern Toolbox

✅ Pattern Printing
✅ Digit Extraction & Processing
✅ Euclidean Algorithm
✅ Early Exit Search
✅ Recursive Patterns (Build-Up, Return Formula, Branching)
✅ Two Pointers
✅ Two Pointers with Character Filtering
✅ Hashing Patterns (Seen Before, Frequency Counting, Frequency Analysis, Complement Search)
✅ Selection Sort
✅ Bubble Sort
✅ Insertion Sort
✅ **Divide & Conquer (Merge Sort) ⭐**

This is your first algorithm with **O(N log N)** time complexity, making it significantly faster than the quadratic sorting algorithms you've learned so far. Even more importantly, it demonstrates how previously learned concepts—recursion and two pointers—can combine to solve a more advanced problem. That's a big step in your DSA journey.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
