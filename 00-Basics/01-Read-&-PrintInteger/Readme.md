# Read and Print Integer

## Problem
Read an integer from the provided Scanner sc and print exactly that integer.

## Progress Score
95/100

## What I Got Right
- Used the provided Scanner.
- Read the input before printing.
- Stored it in a variable.
- Printed only the integer.

## Where I Got Stuck
Used:

sc.nextint()

instead of:

sc.nextInt()

Java is case-sensitive.

## Hint
Look at Scanner methods:
- nextLine()
- nextDouble()
- nextBoolean()

Notice the capitalization pattern.

## Pattern Learned
Separate logic errors from syntax errors.

## Final Solution

```java
int value = sc.nextInt();
System.out.println(value);