# LeetCode 118 - Pascal's Triangle

## Problem
Given an integer `numRows`, return the first `numRows` of Pascal's Triangle.

## Approach
- Create the triangle row by row.
- Every row starts and ends with `1`.
- For each middle element:
  - `currentRow[j] = previousRow[j-1] + previousRow[j]`
- Store each row in the result list.

## Algorithm
1. Initialize an empty list.
2. Generate each row from `0` to `numRows - 1`.
3. Fill first and last elements with `1`.
4. Calculate middle elements using the previous row.
5. Return the complete triangle.

## Complexity
- **Time Complexity:** O(n²)
- **Space Complexity:** O(n²)

## Concepts Learned
- ArrayList
- Nested Lists
- Dynamic Programming (basic)
- Matrix/List construction

## Language
Java ☕

## Status
✅ Accepted on LeetCode
