# If ElseIf

## Problem

* Problem statement: Given the marks of a student, print the corresponding grade:

  * Grade A if marks >= 90
  * Grade B if marks >= 70
  * Grade C if marks >= 50
  * Grade D if marks >= 35
  * Fail otherwise
* Problem link: Not provided

## Progress Score

**95/100**

I understood the grading logic correctly and implemented it successfully in both Java and Python. The only issue I encountered was a minor Java syntax mistake (missing semicolons). I also noticed confusion around taking input in Python because the platform already provides the method parameter.

## What I Got Right

* I correctly identified that this problem requires an `if → else if → else` chain.
* I implemented the grading logic accurately in both Python and Java.
* I ordered the conditions from highest grade to lowest grade, ensuring the correct grade is printed.
* I understood that once a condition is satisfied, the remaining conditions do not execute.

## Where I Got Stuck

### Syntax/API Mistakes

* In Java, I initially forgot to add semicolons after statements, which caused compilation errors.

### Conceptual/API Understanding

* In Python, I tried declaring `marks = int(input())`, which led to a wrong answer because the platform already passes `marks` as an argument to the function. Additional input handling was unnecessary.

### Logic Mistakes

* None.

### Edge-Case Mistakes

* None. The boundary conditions such as 90, 70, 50, and 35 were handled correctly.

## Hint (Without Spoiling)

* Before writing extra input statements, carefully check the function signature provided by the platform. If the parameter is already given, use it directly.
* When using multiple ranges, think about the order of conditions so that higher-priority cases are checked first.

## Pattern Learned

* Pattern: Conditional Branching (`if-elif-else` / `if-else if-else`)
* Why it matters: This is one of the most fundamental control flow concepts. Many future DSA problems depend on making decisions based on conditions before moving to more advanced logic.

## Final Solution

### Python

```java
class Solution:
    def studentGrade(self, marks):
        if marks >= 90:
            print("Grade A")
        elif marks >= 70:
            print("Grade B")
        elif marks >= 50:
            print("Grade C")
        elif marks >= 35:
            print("Grade D")
        else:
            print("Fail")
```

### Java

```java
class Solution {
    public void studentGrade(int marks) {
        if (marks >= 90) {
            System.out.print("Grade A");
        } else if (marks >= 70) {
            System.out.print("Grade B");
        } else if (marks >= 50) {
            System.out.print("Grade C");
        } else if (marks >= 35) {
            System.out.print("Grade D");
        } else {
            System.out.print("Fail");
        }
    }
}
```

## Time Complexity

* Time: **O(1)**
* Explanation: At most a fixed number of conditional checks are performed regardless of the input value.

## Space Complexity

* Space: **O(1)**
* Explanation: No additional data structures are used; only constant extra space is required.

## Coach's Note

This problem wasn't about complex algorithms—it was about building confidence with fundamentals. Solving it in both Python and Java reinforced that programming logic remains the same across languages, while syntax changes. Catching the Java semicolon mistake and understanding why extra input handling caused issues in Python are exactly the kinds of lessons that make future debugging easier. Strong DSA foundations start with mastering these basics.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
