# Reverse String

## Problem

* Problem statement: Given a character array `s`, reverse the array **in place** without using extra arrays.
* Example:

```text
Input:  ['h','e','l','l','o']

Output: ['o','l','l','e','h']
```

## Progress Score

**100/100**

I successfully solved this problem and correctly identified it as a Two Pointers problem. After a few implementation mistakes, I arrived at the optimal in-place solution using constant extra space.

## What I Got Right

* I recognized that the array should be reversed by swapping elements from both ends.
* I correctly initialized the two pointers:

```java
int left = 0;
int right = s.length - 1;
```

* I used the correct loop condition:

```java
while (left < right)
```

* I correctly swapped the characters using a temporary variable.
* I correctly moved both pointers toward the center after each swap.
* I solved the problem in-place without allocating another array.

## Where I Got Stuck

### Logic Mistakes

* Initially tried solving the problem using an `if` statement instead of repeatedly swapping with a loop.
* Tried resetting the pointers instead of moving them inward after each swap.
* Attempted to return a value from a `void` method.

### Syntax/API Mistakes

* Initially used Python-style indexing:

```java
-1
```

instead of Java's:

```java
s.length - 1
```

* Mixed up the swap order before arriving at the correct implementation.

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* None. Once I recognized the Two Pointers pattern, the overall algorithm became clear.

## Hint (Without Spoiling)

Whenever you need to reverse an array or string **in place**, ask yourself:

1. Which two elements should be exchanged first?
2. How do the pointers move after each swap?
3. When should the process stop?

If both pointers keep moving toward the center, you're likely using the correct approach.

## Pattern Learned

* Pattern: **Two Pointers ⭐**
* Why it matters: Two pointers allow efficient in-place processing of arrays and strings while using constant extra space.

Template:

```java
int left = 0;
int right = arr.length - 1;

while (left < right) {

    // Process or swap

    left++;
    right--;
}
```

This pattern appears in:

* Reverse String ✅
* Reverse Array
* Valid Palindrome
* Two Sum II
* Container With Most Water
* Trapping Rain Water
* Remove Duplicates
* Merge Sorted Arrays
* Many more interview problems

## Final Solution

### Java

```java
class Solution {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
```

### Python

```python
class Solution:
    def reverseString(self, s):

        left = 0
        right = len(s) - 1

        while left < right:

            s[left], s[right] = s[right], s[left]

            left += 1
            right -= 1
```

## Time Complexity

* Time: **O(N)**
* Explanation: Each character is visited at most once as the two pointers move toward the center.

## Space Complexity

* Space: **O(1)**
* Explanation: The reversal is performed in place using only a temporary variable.

## Coach's Note

This problem is a major milestone because it introduces your **first fundamental array pattern**.

Earlier, you learned reusable templates for:

* Digit Manipulation

```java
digit = n % 10;
n = n / 10;
```

* Recursion

```java
Base Case
↓
Smaller Problem
↓
Combine Result
```

Now you've added another core pattern to your toolbox:

```java
left = 0;
right = n - 1;

while (left < right) {
    // work
    left++;
    right--;
}
```

What impressed me most wasn't just the final code—it was that you recognized this as a **Two Pointers** problem before being given the complete algorithm. That's an important shift from learning syntax to recognizing reusable DSA patterns.

### DSA Pattern Toolbox

✅ Pattern Printing
✅ Digit Extraction & Processing
✅ Euclidean Algorithm
✅ Early Exit Search
✅ Recursive Build-Up
✅ Recursive Return Formula
✅ **Two Pointers ⭐**

You're no longer solving isolated problems—you've started building a collection of patterns that will reappear throughout your DSA journey. That's exactly the progression interview preparation is built on.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
