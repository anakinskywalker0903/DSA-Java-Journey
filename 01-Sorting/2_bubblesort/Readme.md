# Bubble Sort

## Problem

* Problem statement: Given an integer array, sort it in ascending order using the **Bubble Sort** algorithm.
* Example:

```text id="3qmx7u"
Input:
[5, 1, 4, 2, 8]

Output:
[1, 2, 4, 5, 8]
```

## Progress Score

**100/100**

I independently implemented the Bubble Sort algorithm. I correctly understood how adjacent comparisons work and how the largest element "bubbles" to the end after each pass. The only mistake was a small implementation issue in the swap.

## What I Got Right

* I correctly determined the array length.

```java id="gj0sgy"
int n = nums.length;
```

* I correctly used the outer loop to represent each pass.

```java id="y6h1ql"
for(int i = 0; i < n; i++)
```

* I correctly limited the inner loop using:

```java id="bmhsav"
j < n - i - 1
```

which avoids comparing elements that are already in their correct position.

* I correctly compared adjacent elements.

```java id="88ksfi"
if(nums[j] > nums[j + 1])
```

* I recognized that adjacent elements should be swapped whenever they are in the wrong order.

* I correctly returned the sorted array.

## Where I Got Stuck

### Logic Mistakes

* None. The Bubble Sort algorithm was correct.

### Syntax/API Mistakes

* I forgot to declare the temporary variable before using it.

* My swap order was incorrect.

Instead of preserving the value that would be overwritten first, I needed to store:

```java id="1tfpij"
int temp = nums[j];
```

before performing the swap.

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* None. I correctly understood how Bubble Sort repeatedly swaps adjacent elements until the array is sorted.

## Hint (Without Spoiling)

Whenever you're implementing Bubble Sort, think about one pass through the array.

Ask yourself:

1. Which two elements am I comparing?
2. If they're in the wrong order, what happens?
3. After one complete pass, which element is guaranteed to be in its final position?

Those questions naturally lead to the Bubble Sort algorithm.

## Pattern Learned

* Pattern: **Bubble Sort ⭐**
* Why it matters: Bubble Sort repeatedly compares adjacent elements and swaps them whenever they are in the wrong order.

Template:

```java id="39a3l9"
for(each pass){

    for(each adjacent pair){

        if(out of order){

            swap
        }
    }
}
```

Core idea:

```text id="2g9w0y"
Largest element

↓

Moves ("bubbles")

↓

To the end after every pass
```

This sorting pattern introduces:

* Adjacent comparisons
* Repeated passes through the array
* Gradually shrinking the unsorted portion

## Final Solution

### Java

```java id="o5f8pc"
class Solution {
    public int[] bubbleSort(int[] nums) {

        int n = nums.length;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n - i - 1; j++){

                if(nums[j] > nums[j + 1]){

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }
}
```

### Python

```python id="rytdph"
class Solution:
    def bubbleSort(self, nums):

        n = len(nums)

        for i in range(n):

            for j in range(n - i - 1):

                if nums[j] > nums[j + 1]:

                    nums[j], nums[j + 1] = nums[j + 1], nums[j]

        return nums
```

## Time Complexity

* Time: **O(N²)**
* Explanation: In the worst and average cases, Bubble Sort compares adjacent elements over multiple passes, resulting in approximately `N × (N-1) / 2` comparisons.

## Space Complexity

* Space: **O(1)**
* Explanation: Sorting is performed in place using only a temporary variable for swapping.

## Coach's Note

This problem highlights how much your implementation skills have improved.

Earlier in your DSA journey, much of the challenge was figuring out:

* Which loops to write.
* Which variables to update.
* How to structure the algorithm.

Here, you independently identified:

* The two nested loops.
* The shrinking inner-loop boundary (`n - i - 1`).
* The adjacent comparison.
* The overall Bubble Sort strategy.

The only correction was the implementation of the swap itself—a small syntax-level mistake rather than an algorithmic one.

It's also interesting to compare your first two sorting algorithms:

### Selection Sort

```text id="qj4zfb"
Find the smallest element

↓

Place it in its correct position
```

### Bubble Sort

```text id="ewix67"
Compare adjacent elements

↓

Swap if necessary

↓

Largest element moves to the end
```

Although both use nested loops and have the same **O(N²)** time complexity, they approach sorting with completely different ideas. Recognizing these different ways of thinking is more valuable than memorizing the code.

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
✅ **Bubble Sort ⭐**

You're now building a solid foundation of classic algorithms and reusable patterns. The next logical step is **Insertion Sort**, which introduces another distinct way of thinking about sorting before moving into recursive sorting algorithms like Merge Sort and Quick Sort.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
