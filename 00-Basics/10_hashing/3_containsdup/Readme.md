# Contains Duplicate

## Problem

* Problem statement: Given an integer array `nums`, return `true` if any value appears at least twice in the array. Otherwise, return `false`.
* Examples:

```text
Input: [1,2,3,1]
Output: true
```

```text
Input: [1,2,3,4]
Output: false
```

## Progress Score

**98/100**

I successfully recognized this as a hashing problem and implemented the correct HashMap approach. The only remaining mistake was returning the wrong data type after the loop.

## What I Got Right

* I correctly chose a `HashMap` to keep track of previously seen numbers.
* I correctly iterated through the array using an enhanced for-loop.

```java
for (int num : nums)
```

* I correctly checked whether a number had already been seen.

```java
map.containsKey(num)
```

* I correctly inserted unseen numbers into the map.

```java
map.put(num, 1);
```

* I correctly returned `true` immediately when a duplicate was found.

## Where I Got Stuck

### Logic Mistakes

* None. The duplicate detection logic was correct.

### Syntax/API Mistakes

* Initially struggled with:

  * Declaring a `HashMap`
  * Understanding `containsKey()`
  * Using `put()` correctly

* In the final attempt, I returned:

```java
return nums;
```

instead of returning a boolean value.

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* I initially focused on storing values in the map before realizing that the important question was simply:

> "Have I seen this number before?"

## Hint (Without Spoiling)

Whenever a problem asks:

> "Have I already encountered this value?"

Think about using a hashing data structure.

Ask yourself:

1. Can I check existence quickly?
2. What should happen the second time I see the same element?
3. What should I return if the loop finishes without finding a duplicate?

## Pattern Learned

* Pattern: **Hashing – Seen Before Pattern ⭐**
* Why it matters: This is one of the most common interview patterns for duplicate detection and fast lookups.

Template:

```java
HashMap<Integer, Integer> map = new HashMap<>();

for (int value : array) {

    if (map.containsKey(value)) {
        return true;
    }

    map.put(value, 1);
}

return false;
```

### Interview Note

This problem is often solved using a `HashSet` because only existence needs to be tracked:

```java
HashSet<Integer> set = new HashSet<>();
```

However, solving it with a `HashMap` first helped me understand:

* `put()`
* `containsKey()`

making it easier to learn `HashSet` later.

## Final Solution

### Java

```java
import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 1);
            }
        }

        return false;
    }
}
```

### Python

```python
class Solution:
    def containsDuplicate(self, nums):

        seen = {}

        for num in nums:

            if num in seen:
                return True

            seen[num] = 1

        return False
```

## Time Complexity

* Time: **O(N)**
* Explanation: Each element is processed once, and `containsKey()`/`put()` operations take **O(1)** on average.

## Space Complexity

* Space: **O(N)**
* Explanation: In the worst case, every element is unique and stored in the hash map.

## Coach's Note

This problem marks your **first successful hashing pattern**.

Earlier, you were learning what methods like:

```java
map.put()
map.containsKey()
```

actually do.

Now, you're using them to solve a real DSA problem rather than just learning the API.

The most important realization was that this problem doesn't require counting frequencies. It only asks:

> **"Have I seen this value before?"**

That shift in thinking is what makes hashing so powerful.

### DSA Pattern Toolbox

✅ Pattern Printing
✅ Digit Extraction & Processing
✅ Euclidean Algorithm
✅ Early Exit Search
✅ Recursive Patterns (Build-Up, Return Formula, Branching)
✅ Two Pointers
✅ Two Pointers with Character Filtering
✅ **Hashing – Seen Before Pattern ⭐**

You're steadily building a reusable toolbox of patterns. From this point onward, many array and string problems will become pattern-matching exercises instead of completely new challenges.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
