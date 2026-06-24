# Sum of First N Numbers Using Recursion

## Problem

* Problem statement: Given an integer `N`, return the sum of the first `N` natural numbers using recursion.
* Examples:

```text
Input: N = 5

Output: 15

Explanation:
1 + 2 + 3 + 4 + 5 = 15
```

```text
Input: N = 3

Output: 6

Explanation:
1 + 2 + 3 = 6
```

## Progress Score

**100/100**

I successfully discovered the recursive relationship needed for the problem and implemented it correctly. After an initial attempt involving an unnecessary variable, I simplified the solution into a clean recursive return formula.

## What I Got Right

* I correctly identified the base case:

```java
if(N == 0){
    return 0;
}
```

* I understood that the problem can be reduced to a smaller version of itself.
* I correctly used recursion on:

```java
NumbersSum(N - 1)
```

* I derived the correct recursive formula:

```java
return N + NumbersSum(N - 1);
```

* I avoided loops entirely, as required by the recursion approach.

## Where I Got Stuck

### Logic Mistakes

* Initially tried introducing an unnecessary `sum` variable.

### Syntax/API Mistakes

* Wrote:

```java
return sum + NumbersSum;
```

instead of making an actual recursive function call.

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* Initially focused on storing intermediate values manually rather than expressing the problem recursively.

## Hint (Without Spoiling)

Whenever a recursion problem asks for a single value:

Ask yourself:

```text
Can I express the answer for N
using the answer for N-1?
```

If yes, you've probably found the recursive relationship.

## Pattern Learned

* Pattern: **Recursive Return Formula**
* Why it matters: Many recursion problems return a value rather than printing something.

Template:

```java
if(baseCase){
    return answer;
}

return currentWork + recursiveCall(smallerProblem);
```

This pattern will appear again in:

* Sum of First N Numbers ✅
* Factorial
* Fibonacci
* Tree Problems
* Dynamic Programming

## Final Solution

### Java

```java
class Solution {
    public int NumbersSum(int N) {

        if (N == 0) {
            return 0;
        }

        return N + NumbersSum(N - 1);
    }
}
```

### Python

```python
class Solution:
    def NumbersSum(self, N):

        if N == 0:
            return 0

        return N + self.NumbersSum(N - 1)
```

## Time Complexity

* Time: **O(N)**
* Explanation: One recursive call is made for each value from `N` down to `0`.

## Space Complexity

* Space: **O(N)**
* Explanation: The recursion stack stores `N + 1` function calls before reaching the base case.

## Coach's Note

This problem introduced a new recursion pattern.

In previous recursion problems, the goal was to print values:

```java
print
recurse
```

or

```java
recurse
print
```

Here, the goal was different:

```java
return current + recurse(smallerProblem)
```

That's an important step because most interview recursion problems return values rather than simply printing output.

The strongest sign of progress is how quickly you adapted:

```text
Print 1 → N      : Multiple attempts
Print N → 1      : One attempt
Sum of First N   : Two attempts
```

That trend shows you're beginning to recognize recursion structures instead of learning each problem from scratch.

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
12. Work Before Recursion Pattern → ✅
13. Recursive Return Formula → ✅

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
