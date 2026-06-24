# Print Numbers from 1 to N Using Recursion

## Problem

* Problem statement: Given an integer `n`, print numbers from `1` to `n` using recursion.
* Example:

```text
Input: 5

Output:
1
2
3
4
5
```

## Progress Score

**100/100**

I successfully understood the recursive structure required for the problem. After a few attempts, I identified the correct base case and learned how the position of the recursive call affects the output order.

## What I Got Right

* I understood that recursion means a function calls itself.
* I recognized that recursion requires a base case to stop execution.
* I eventually realized that the recursive call must happen **before** printing the current value.
* I removed the unnecessary `count` variable and simplified the solution.
* I correctly used `n` as the only state that changes between recursive calls.
* I understood how recursion builds up the call stack and then executes statements while returning.

## Where I Got Stuck

### Logic Mistakes

* Initially used:

```java
printNumbers(n + 1);
```

which moved away from the base case and caused infinite recursion.

### Syntax/API Mistakes

* Tried changing the function signature:

```java
printNumbers(n, count + 1);
```

which did not match the provided function definition.

### Edge-Case Mistakes

* None in the final solution.

### Conceptual Misunderstandings

* Introduced an unnecessary `count` variable.
* Used:

```java
if(count == n)
```

as the base case even though recursion should be controlled directly by `n`.

## Hint (Without Spoiling)

When solving recursion problems, ask:

1. What is the smallest problem I can solve directly?
2. How can I make the current problem smaller?
3. Should I do the work before the recursive call or after it?

The answer to the third question often determines the output order.

## Pattern Learned

* Pattern: **Recursive Build-Up**
* Why it matters: This is one of the most fundamental recursion patterns.

Template:

```java
function(n){

    if(base_case){
        return;
    }

    function(n - 1);

    // current work
}
```

This pattern appears in:

* Print 1 to N ✅
* Sum of First N Numbers
* Factorial
* Recursive Array Traversal
* Backtracking Foundations

## Final Solution

### Java

```java
class Solution {
    public void printNumbers(int n) {

        if (n < 1) {
            return;
        }

        printNumbers(n - 1);
        System.out.println(n);
    }
}
```

### Python

```python
class Solution:
    def printNumbers(self, n):

        if n < 1:
            return

        self.printNumbers(n - 1)
        print(n)
```

## Time Complexity

* Time: **O(n)**
* Explanation: One recursive call is made for each value from `n` down to `1`.

## Space Complexity

* Space: **O(n)**
* Explanation: The recursion stack stores `n` function calls before reaching the base case.

## Coach's Note

This problem marks your first important recursion milestone.

The biggest lesson wasn't the code itself—it was understanding that:

```text
Recursive Call Position
↓
Controls Output Order
```

By placing:

```java
printNumbers(n - 1);
```

before printing `n`, you allowed the recursion to reach the base case first and then print while the stack unwound.

That's the foundation of recursive thinking.

I also noticed a shift from earlier problems:

* Earlier mistakes were often about loops and variable updates.
* Here, you were reasoning about recursion structure and base cases.

That's a sign you're moving beyond basic control flow and starting to think recursively.

My DSA foundation now includes:

1. If-Else Logic → ✅
2. Switch Case → ✅
3. Loops → ✅
4. Functions → ✅
5. Time & Space Complexity → ✅
6. Pattern Printing → ✅
7. Digit Manipulation → ✅
8. GCD (Euclidean Algorithm) → ✅
9. Prime Number Check → ✅
10. Recursion Basics → ✅
11. Recursive Build-Up Pattern → ✅

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
