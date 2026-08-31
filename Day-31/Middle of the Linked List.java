## 📅 Day 31

### 🔹 LeetCode 876 – Middle of the Linked List

- **Difficulty:** Easy
- **Language:** Java
- **Topic:** Linked List
- **Technique:** Slow & Fast Pointers

### 💡 Approach

Use two pointers:

- `slow` moves one node at a time.
- `fast` moves two nodes at a time.

When `fast` reaches the end of the linked list, `slow` will be pointing to the middle node.

For an even-sized linked list, this approach automatically returns the **second middle node**, as required by the problem.

### ⏱️ Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

### 🧠 What I Learned

- Linked List traversal
- Two Pointer technique
- Slow and Fast pointers
- Finding the middle of a linked list

### ✅ Status

Solved ✔️

🔥 **Day 31/100 Completed!**
