## 📅 Day 32

Today I solved two Linked List problems.

### 🔹 LeetCode 206 – Reverse Linked List

- **Difficulty:** Easy
- **Language:** Java
- **Topic:** Linked List
- **Technique:** Iterative Pointer Manipulation

### 💡 Approach

Use three pointers:

- `previous` → stores the previous node
- `current` → points to the current node
- `next` → stores the next node before changing the link

Reverse the `next` pointer of each node and move forward until the end of the list.

### ⏱️ Complexity

- **Time:** O(n)
- **Space:** O(1)

---

### 🔹 LeetCode 141 – Linked List Cycle

- **Difficulty:** Easy
- **Language:** Java
- **Topic:** Linked List
- **Technique:** Floyd's Cycle Detection

### 💡 Approach

Use two pointers:

- `slow` moves one step at a time.
- `fast` moves two steps at a time.

If a cycle exists, the two pointers will eventually meet.

If `fast` reaches `null`, there is no cycle.

### ⏱️ Complexity

- **Time:** O(n)
- **Space:** O(1)

### 🧠 What I Learned

- Linked List pointer manipulation
- Reversing a linked list
- Slow and Fast pointers
- Floyd's Cycle Detection
- Efficient O(1) space solutions

### ✅ Status

Solved ✔️

🔥 **Day 32/100 Completed!**
