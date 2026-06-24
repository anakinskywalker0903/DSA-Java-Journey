# Print Numbers from N to 1 Using Recursion

## Problem

* Problem statement: Given an integer `n`, print numbers from `n` to `1` using recursion.
* Example:

```text
Input: 5

Output:
5
4
3
2
1
```

## Progress Score

**100/100**

I solved this problem correctly on my first final attempt. More importantly, I understood how changing the position of the print statement relative to the recursive call changes the output order.

## What I Got Right

* I used the correct base case.

```java
if(n < 1){
    return;
}
```

* I correctly reduced the problem size using:

```java
printNumbers(n - 1);
```

* I placed the print statement before the recursive call.
* I did not introduce any unnecessary variables.
* I recognized this as a variation of the previous recursion problem rather than treating it as a completely new problem.

## Where I Got Stuck

### Logic Mistakes

* None.

### Syntax/API Mistakes

* None.

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* None in the final attempt.

## Hint (Without Spoiling)

When working with recursion, ask:

> Should the current work happen before the recursive call or after it?

That single decision often determines the order of the output.

## Pattern Learned

* Pattern: **Work Before Recursive Call**
* Why it matters: Performing work before recursion processes the current state immediately and then moves toward smaller subproblems.

Template:

```java
function(n){

    if(base_case){
        return;
    }

    // current work

    function(n - 1);
}
```

### Comparison with Previous Problem

#### Print 1 → N

```java
printNumbers(n - 1);
System.out.println(n);
```

Pattern:

```text
Recurse
Work
```

Output:

```text
1
2
3
...
N
```

#### Print N → 1

```java
System.out.println(n);
printNumbers(n - 1);
```

Pattern:

```text
Work
Recurse
```

Output:

```text
N
N-1
...
1
```

## Final Solution

### Java

```java
class Solution {
    public void printNumbers(int n) {

        if (n < 1) {
            return;
        }

        System.out.println(n);
        printNumbers(n - 1);
    }
}
```

### Python

```python
class Solution:
    def printNumbers(self, n):

        if n < 1:
            return

        print(n)
        self.printNumbers(n - 1)
```

## Time Complexity

* Time: **O(n)**
* Explanation: One recursive call is made for each number from `n` down to `1`.

## Space Complexity

* Space: **O(n)**
* Explanation: The recursion stack stores `n` active function calls before reaching the base case.

## Coach's Note

This problem is significant because it demonstrates understanding rather than memorization.

In the previous recursion problem, you learned:

```java
printNumbers(n - 1);
System.out.println(n);
```

Here, you immediately recognized that reversing the order:

```java
System.out.println(n);
printNumbers(n - 1);
```

would reverse the output.

That means you're beginning to understand how recursion executes rather than simply copying a pattern. This is an important step because future recursion problems—such as sums, factorials, tree traversals, and backtracking—will rely on the same idea:

> The position of the recursive call determines when the work gets done.

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
11. Recursive Build-Up (1 → N) → ✅
12. Work Before Recursion (N → 1) → ✅

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
