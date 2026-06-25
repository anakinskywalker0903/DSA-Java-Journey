# Valid Palindrome

## Problem

* Problem statement: Given a string `s`, determine whether it is a palindrome after:

  * Ignoring all non-alphanumeric characters.
  * Treating uppercase and lowercase letters as equal.
* Examples:

```text
Input: "A man, a plan, a canal: Panama"
Output: true
```

```text
Input: "race a car"
Output: false
```

## Progress Score

**98/100**

I correctly identified this as a Two Pointers problem and implemented nearly the entire optimal solution. The remaining issues were related to Java syntax, code structure, and braces rather than the underlying algorithm.

## What I Got Right

* I immediately recognized this as a Two Pointers problem.
* I correctly initialized the pointers:

```java
int left = 0;
int right = s.length() - 1;
```

* I correctly used:

```java
Character.isLetterOrDigit()
```

to skip non-alphanumeric characters.

* I correctly used:

```java
Character.toLowerCase()
```

to perform case-insensitive comparison.

* I correctly used `continue` after skipping invalid characters.
* I correctly compared characters before moving both pointers.

## Where I Got Stuck

### Logic Mistakes

* None. The overall algorithm was correct.

### Syntax/API Mistakes

* Accidentally nested multiple `if` statements because of missing braces.
* Indentation made independent checks appear nested.
* Added:

```java
continue;
```

after:

```java
return false;
```

Even though `return` immediately exits the function, making the `continue` unreachable.

### Edge-Case Mistakes

* None. The logic correctly handled punctuation, spaces, and case differences.

### Conceptual Misunderstandings

* None. I correctly understood the sequence of operations required for the algorithm.

## Hint (Without Spoiling)

When using Two Pointers with character filtering, think of each iteration as four independent steps:

1. Skip invalid characters on the left.
2. Skip invalid characters on the right.
3. Compare the current valid characters.
4. Move both pointers inward.

Keeping these steps separate makes the implementation much easier to reason about.

## Pattern Learned

* Pattern: **Two Pointers with Character Filtering ⭐**
* Why it matters: This extends the basic Two Pointers pattern by allowing pointers to skip elements that shouldn't be processed.

Template:

```java
while (left < right) {

    if (left is invalid) {
        left++;
        continue;
    }

    if (right is invalid) {
        right--;
        continue;
    }

    if (values don't match) {
        return false;
    }

    left++;
    right--;
}

return true;
```

This pattern appears in:

* Valid Palindrome ✅
* Reverse Only Letters
* String Cleaning Problems
* Two Pointer Parsing
* Many interview string problems

## Final Solution

### Java

```java
class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
```

### Python

```python
class Solution:
    def isPalindrome(self, s: str) -> bool:

        left = 0
        right = len(s) - 1

        while left < right:

            if not s[left].isalnum():
                left += 1
                continue

            if not s[right].isalnum():
                right -= 1
                continue

            if s[left].lower() != s[right].lower():
                return False

            left += 1
            right -= 1

        return True
```

## Time Complexity

* Time: **O(N)**
* Explanation: Each pointer moves across the string at most once, so every character is processed at most one time.

## Space Complexity

* Space: **O(1)**
* Explanation: Only two pointers and a few temporary operations are used; no additional data structures are required.

## Coach's Note

This problem marks another important milestone in your DSA journey.

Previously, you learned the basic Two Pointers template by reversing a string:

```java
left++;
right--;
```

Here, you expanded that idea by introducing **pointer filtering**:

* Skip invalid characters.
* Compare only the meaningful ones.
* Continue moving inward.

The impressive part is that the algorithm itself wasn't the obstacle. Your solution was about 90% complete before any corrections. The remaining fixes were Java-specific—mainly braces, indentation, and unreachable code after `return`.

That shows a shift in your learning. Earlier, most help was about discovering the algorithm. Now, you're usually finding the right pattern yourself, and the remaining work is polishing the implementation.

### DSA Pattern Toolbox

✅ Pattern Printing
✅ Digit Extraction & Processing
✅ Euclidean Algorithm
✅ Early Exit Search
✅ Recursive Patterns (Build-Up, Work Before Recursion, Return Formula)
✅ Two Pointers
✅ **Two Pointers with Character Filtering ⭐**

You're steadily building a collection of reusable patterns rather than isolated solutions, which is exactly the mindset interview preparation aims to develop.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
