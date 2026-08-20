# Day 20 - Find Minimum in Rotated Sorted Array

## LeetCode 153 - Find Minimum in Rotated Sorted Array

### Problem
Given a rotated sorted array of unique integers, find the minimum element.

### Approach
Used Binary Search to find the minimum efficiently.

- If `nums[mid] > nums[right]`, the minimum is in the right half.
- Otherwise, the minimum is in the left half including `mid`.

### Complexity

- Time Complexity: `O(log n)`
- Space Complexity: `O(1)`

### Key Learning

Learned how Binary Search can be modified to work with rotated sorted arrays and how to identify which side contains the minimum element.

## Progress

**Day 20 / 100 ✅**

Continuing my journey to improve DSA, problem-solving, and logical thinking using Java.
