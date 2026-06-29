# Selection Sort

## Problem

* Problem statement: Given an integer array, sort it in ascending order using the **Selection Sort** algorithm.
* Example:

```text
Input:
[64, 25, 12, 22, 11]

Output:
[11, 12, 22, 25, 64]
```

## Progress Score

**100/100**

I solved Selection Sort completely on my own after understanding the core idea behind the algorithm. Once I identified how to find the smallest element in the unsorted portion of the array, I was able to implement the entire solution correctly.

## What I Got Right

* I correctly determined the array length.

```java
int n = arr.length;
```

* I correctly used the outer loop to separate the sorted and unsorted portions of the array.

```java
for(int i = 0; i < n; i++)
```

* I correctly assumed the current element was the minimum.

```java
int minIndex = i;
```

* I correctly searched the remaining unsorted portion.

```java
for(int j = i + 1; j < n; j++)
```

* I correctly updated the minimum index whenever a smaller element was found.

```java
if(arr[j] < arr[minIndex]){
    minIndex = j;
}
```

* I correctly swapped the minimum element into its proper position using a temporary variable.

## Where I Got Stuck

### Logic Mistakes

* None in the final solution.

### Syntax/API Mistakes

* None.

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* Initially, I needed to understand the core idea of Selection Sort:

  * The algorithm doesn't sort the entire array at once.
  * Instead, it repeatedly finds the smallest element in the **unsorted** portion and places it at the beginning of that portion.

Once this idea became clear, the implementation followed naturally.

## Hint (Without Spoiling)

Whenever you work with Selection Sort, ask yourself these questions:

1. Where does the unsorted portion begin?
2. Which element is currently the smallest?
3. Once I find the smallest element, where should it be placed?

Answering these three questions gives the complete algorithm.

## Pattern Learned

* Pattern: **Selection Sort ⭐**
* Why it matters: Selection Sort teaches how to repeatedly select the best candidate from an unsorted section before moving the boundary of the sorted section.

Template:

```java
for(each position){

    assume current element is minimum

    search remaining elements

    remember smallest element

    swap into correct position
}
```

Core idea:

```text
Sorted | Unsorted

Find the smallest element in the Unsorted part
↓

Move it to the beginning of the Unsorted part

↓

Repeat
```

This sorting pattern introduces:

* Maintaining a sorted boundary
* Searching for an optimal candidate
* Swapping elements into their final position

## Final Solution

### Java

```java
class Solution {
    void selectionSort(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n; i++){

            int minIndex = i;

            for(int j = i + 1; j < n; j++){

                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
```

### Python

```python
class Solution:
    def selectionSort(self, arr):

        n = len(arr)

        for i in range(n):

            min_index = i

            for j in range(i + 1, n):

                if arr[j] < arr[min_index]:
                    min_index = j

            arr[i], arr[min_index] = arr[min_index], arr[i]
```

## Time Complexity

* Time: **O(N²)**
* Explanation: For each position, the algorithm scans the remaining unsorted portion of the array to find the minimum element.

## Space Complexity

* Space: **O(1)**
* Explanation: Sorting is performed in place using only a temporary variable for swapping.

## Coach's Note

This problem represents a noticeable milestone in my DSA journey.

Earlier, many of my mistakes were related to:

* Loop conditions
* Variable updates
* Java syntax
* Understanding the overall algorithm

In Selection Sort, the situation was different. After understanding the key idea—

> **Find the smallest element in the unsorted portion and move it to the front.**

—I was able to write the implementation almost entirely on my own.

Another interesting observation is that the swapping logic felt familiar because I had already used the same temporary-variable technique in the **Reverse String** problem. This showed me that ideas from previous problems can often be reused in new contexts.

### DSA Pattern Toolbox

✅ Pattern Printing
✅ Digit Extraction & Processing
✅ Euclidean Algorithm
✅ Early Exit Search
✅ Recursive Patterns (Build-Up, Return Formula, Branching)
✅ Two Pointers
✅ Two Pointers with Character Filtering
✅ Hashing Patterns (Seen Before, Frequency Counting, Frequency Analysis, Complement Search)
✅ **Selection Sort ⭐**

This is my first comparison-based sorting algorithm. It taught me that sorting algorithms are often built around one simple repeated idea. For Selection Sort, that idea is:

> **Repeatedly choose the smallest remaining element and place it where it belongs.**

Understanding that principle is much more valuable than memorizing the code.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
