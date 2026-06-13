# Switch Case

## Problem

* Problem statement: Given an integer `day`, print the corresponding weekday:

  * `1 → Monday`
  * `2 → Tuesday`
  * `3 → Wednesday`
  * `4 → Thursday`
  * `5 → Friday`
  * `6 → Saturday`
  * `7 → Sunday`
  * Any other value → `Invalid`
* Problem link: Not provided

## Progress Score

**100/100**

I solved this problem independently with the correct logic and implementation. The solution handled all valid and invalid cases appropriately using Java's `switch` statement.

## What I Got Right

* I correctly identified that a `switch` statement was the most suitable approach for matching one variable against multiple exact values.
* I covered all cases from `1` through `7`.
* I included `break` statements after each case to prevent unintended fall-through.
* I handled invalid inputs using the `default` case.
* I matched the weekday names exactly as specified in the problem statement.
* I demonstrated a clear understanding of Java's `switch-case` syntax.

## Where I Got Stuck

### Logic Mistakes

* None.

### Syntax/API Mistakes

* None. Although I used `System.out.println()` instead of `System.out.print()`, this is generally accepted for single-line outputs.

### Edge-Case Mistakes

* None. Invalid values outside the range `1–7` were properly handled.

### Conceptual Misunderstandings

* None.

## Hint (Without Spoiling)

* Since this problem is solved, an important concept to explore is **switch fall-through**.
* Try removing a `break` statement and predict what happens before running the program.
* Understanding fall-through behavior is useful because it is a common Java interview discussion topic.

## Pattern Learned

* Pattern: Reinforcement of Fundamentals
* Why it matters: This problem reinforces multi-way branching using `switch-case`, which can improve readability compared to long `if-else` chains when checking exact values.

## Final Solution

```java
class Solution {
    public void dayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}
```

## Time Complexity

* Time: **O(1)**
* Explanation: The number of cases is fixed, so the execution time remains constant regardless of the input value.

## Space Complexity

* Space: **O(1)**
* Explanation: The solution uses only a constant amount of extra memory.

## Coach's Note

This problem shows that you're becoming comfortable with Java control structures. Earlier exercises focused on understanding the platform and avoiding syntax mistakes. Here, you translated the problem statement into code cleanly without any logic errors. While this isn't a new DSA pattern, mastering these fundamentals makes it easier to focus on actual algorithmic thinking when you move into arrays, hashing, two pointers, and sliding window problems.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
