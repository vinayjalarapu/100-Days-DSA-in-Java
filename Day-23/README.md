# Day 23 - 100 Days DSA Challenge

## LeetCode 1903 - Largest Odd Number in String

### Difficulty
Easy

### Concept
String

### Approach
Traverse the string from right to left and find the first odd digit.

Once the rightmost odd digit is found, return the substring from index 0 to that position.

If there is no odd digit, return an empty string.

### Complexity
- Time Complexity: O(n)
- Space Complexity: O(n) for the returned substring

### Key Learning
The important observation is that the largest odd substring must end at the rightmost odd digit.
