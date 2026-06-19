# Reverse Integer

## Problem

* Problem statement: Given a signed 32-bit integer `x`, return its digits reversed.
* If reversing the integer causes it to go outside the signed 32-bit integer range `[-2³¹, 2³¹ - 1]`, return `0`.
* Examples:

  * `123 → 321`
  * `-123 → -321`
  * `120 → 21`
  * Overflow → `0`

## Progress Score

**90/100**

I understood the core reverse-number algorithm and successfully connected it to the digit extraction pattern learned in previous problems. Most of my difficulties came from handling edge cases and Java-specific implementation details rather than the algorithm itself.

## What I Got Right

* I correctly identified that digit extraction is required.

  ```java
  digit = x % 10;
  ```

* I correctly identified that digits must be removed one at a time.

  ```java
  x = x / 10;
  ```

* I eventually derived the reverse-number construction formula myself.

  ```java
  answer = answer * 10 + digit;
  ```

* I realized that overflow must be checked before appending the next digit.

* I connected this problem to the digit-manipulation pattern from the previous Count Digits problem.

## Where I Got Stuck

### Logic Mistakes

* Initially carried over a `count` variable from the previous problem even though counting digits was unnecessary.

* Used:

  ```java
  answer = answer * digit;
  ```

  instead of:

  ```java
  answer = answer * 10 + digit;
  ```

* Returned from inside the loop, causing only the first digit to be processed.

### Syntax/API Mistakes

* Experimented with `long` and `BigInteger` even though the problem required staying within 32-bit integer constraints.

### Edge-Case Mistakes

* Used:

  ```java
  while(x > 0)
  ```

  which ignored negative numbers.

* Initially attempted using `abs(x)` and unintentionally removed the sign.

### Conceptual Misunderstandings

* Knew overflow needed to be checked before appending digits but had not yet learned the standard overflow-checking technique.

## Hint (Without Spoiling)

Whenever you build a number digit by digit, ask:

1. How do I extract the next digit?
2. How do I remove the processed digit?
3. How do I shift the existing answer one place to the left?
4. What happens if the new value exceeds the allowed integer range?

The answer to those four questions forms the entire solution.

## Pattern Learned

* Pattern: **Reverse Number**
* Why it matters: This is one of the most important digit-manipulation templates in DSA.

Core template:

```java
while (number != 0) {
    digit = number % 10;
    answer = answer * 10 + digit;
    number = number / 10;
}
```

This pattern will be reused in:

* Reverse Integer ✅
* Palindrome Number
* Armstrong Number
* Digit Rearrangement Problems
* Number Transformations

## Final Solution

### Java

```java
class Solution {
    public int reverse(int x) {

        int answer = 0;

        while (x != 0) {

            int digit = x % 10;

            if (answer > Integer.MAX_VALUE / 10 ||
               (answer == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (answer < Integer.MIN_VALUE / 10 ||
               (answer == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            answer = answer * 10 + digit;
            x = x / 10;
        }

        return answer;
    }
}
```

### Python

```python
class Solution:
    def reverse(self, x: int) -> int:

        answer = 0

        while x != 0:

            digit = int(x % 10) if x > 0 else -(-x % 10)

            if answer > 214748364:
                return 0

            if answer < -214748364:
                return 0

            answer = answer * 10 + digit
            x = int(x / 10)

        if answer < -2**31 or answer > 2**31 - 1:
            return 0

        return answer
```

## Time Complexity

* Time: **O(d)**
* Explanation: The loop processes each digit exactly once, where `d` is the number of digits in the integer.

## Space Complexity

* Space: **O(1)**
* Explanation: Only a fixed number of variables are used regardless of input size.

## Coach's Note

This problem was less about reversing a number and more about mastering a reusable digit-processing template. The biggest achievement was recognizing the sequence:

```text
Extract Digit
→ Remove Digit
→ Append Digit
→ Repeat
```

That's the foundation for several upcoming number problems.

I also noticed growth in your problem-solving process. Earlier problems required help discovering the main idea. Here, you largely understood the algorithm and spent most of your effort handling implementation details and edge cases. That's a good sign because algorithmic thinking tends to be harder to develop than syntax fluency.

My DSA foundation now includes:

1. If-Else Logic → ✅
2. Switch Case → ✅
3. For Loops → ✅
4. While Loops → ✅
5. Functions → ✅
6. Time & Space Complexity → ✅
7. Pattern Printing → ✅
8. Digit Counting → ✅
9. Reverse Number Construction → ✅

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
