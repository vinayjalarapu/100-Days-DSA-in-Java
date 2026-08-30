# 🚀 100 Days DSA Challenge

## 📅 Day 30

### 🔹 LeetCode 1781 – Sum of Beauty of All Substrings

- **Difficulty:** Medium
- **Language:** Java
- **Topic:** Strings
- **Concept:** Frequency Counting

### 💡 Approach

For every starting index, maintain the frequency of characters
while extending the substring.

For each substring:
1. Update the frequency of the current character.
2. Find the maximum frequency.
3. Find the minimum frequency.
4. Calculate the beauty:
   
   `Beauty = Maximum Frequency - Minimum Frequency`

5. Add the beauty to the total sum.

### ⏱️ Complexity

- **Time Complexity:** O(n² × k)
- **Space Complexity:** O(k)

Where `k` is the number of distinct characters.

### ✅ Status

Solved ✔️

---

### 📚 What I Learned

Today I improved my understanding of:

- String manipulation
- Frequency counting
- HashMap
- Nested loops
- Substring-based problem solving

🔥 **Day 30/100 Completed!**

#DSA #LeetCode #Java #Strings #ProblemSolving
