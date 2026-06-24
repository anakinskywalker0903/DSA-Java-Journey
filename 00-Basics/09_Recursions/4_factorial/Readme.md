# Factorial Using Recursion

## Problem

* Problem statement: Given an integer `n`, return the factorial of `n` using recursion.
* Factorial is defined as:

```text
n! = n × (n-1) × (n-2) × ... × 1
```

* Examples:

```text
Input: 5

Output: 120

Explanation:
5 × 4 × 3 × 2 × 1 = 120
```

```text
Input: 0

Output: 1
```

## Progress Score

**100/100**

I solved this problem correctly on my first attempt. I immediately recognized that it follows the same recursive return-value pattern as the Sum of First N Numbers problem.

## What I Got Right

* I correctly identified the base case:

```java id="cf0s1q"
if(n == 0){
    return 1;
}
```

* I remembered the mathematical definition:

```text id="v5h15f"
0! = 1
```

* I correctly reduced the problem to a smaller subproblem.
* I immediately derived the recursive formula:

```java id="i65xq4"
return n * factorial(n - 1);
```

* I recognized the similarity with:

```java id="rjxl1e"
return N + NumbersSum(N - 1);
```

from the previous recursion problem.

## Where I Got Stuck

### Logic Mistakes

* None.

### Syntax/API Mistakes

* None.

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* None.

## Hint (Without Spoiling)

When a problem can be expressed as:

```text id="2y9uqz"
Current Answer
=
Current Value
×
Answer to a Smaller Problem
```

try asking:

> "Can I compute the answer for `n` using the answer for `n-1`?"

If yes, recursion is often a natural fit.

## Pattern Learned

* Pattern: **Recursive Return Formula (Reinforcement)**
* Why it matters: Many recursive problems are based on combining the current value with the result of a smaller subproblem.

Template:

```java id="hml0uq"
if(baseCase){
    return answer;
}

return currentWork OPERATOR recursiveCall(smallerProblem);
```

Examples:

### Sum of First N Numbers

```java id="sxaj24"
return n + sum(n - 1);
```

### Factorial

```java id="nce81f"
return n * factorial(n - 1);
```

Same structure.

Only the operator changes.

## Final Solution

### Java

```java
class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
```

### Python

```python
class Solution:
    # Function to calculate factorial of a number.
    def factorial(self, n):

        if n == 0:
            return 1

        return n * self.factorial(n - 1)
```

## Time Complexity

* Time: **O(N)**
* Explanation: One recursive call is made for each value from `n` down to `0`.

## Space Complexity

* Space: **O(N)**
* Explanation: The recursion stack stores `N + 1` function calls before reaching the base case.

## Coach's Note

This problem stands out because it is your **first recursion problem solved correctly in a single attempt**.

That's important because it suggests you are no longer treating recursion as a collection of unrelated problems. Instead, you're beginning to recognize the common structure:

```text
Base Case
↓
Smaller Problem
↓
Combine Result
```

You immediately connected:

```java
return N + NumbersSum(N - 1);
```

to:

```java
return n * factorial(n - 1);
```

and only changed the operation being performed.

That's exactly the kind of pattern transfer that speeds up DSA learning.

### Recursion Patterns Learned So Far

✅ Recursive Build-Up

```java
recurse
then work
```

(Print 1 → N)

✅ Work Before Recursion

```java
work
then recurse
```

(Print N → 1)

✅ Recursive Return Formula

```java
return current OP recursive(smaller);
```

(Sum of N Numbers, Factorial)

The fact that Factorial took one attempt while earlier recursion problems required multiple attempts is a strong sign that recursion is starting to click.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
