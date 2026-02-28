# 🧩 How Many Numbers Are Smaller Than the Current Number

## 📌 Problem Statement

Given an integer array `nums`, for each element `nums[i]`, determine how many numbers in the array are strictly smaller than it.

Return the result as an array where:

```
result[i] = count of elements j such that j ≠ i and nums[j] < nums[i]
```

---

## 📝 Examples

### Example 1

**Input**
```
nums = [8,1,2,2,3]
```

**Output**
```
[4,0,1,1,3]
```

**Explanation**

- 8 → 4 smaller numbers (1, 2, 2, 3)
- 1 → 0 smaller numbers
- 2 → 1 smaller number (1)
- 2 → 1 smaller number (1)
- 3 → 3 smaller numbers (1, 2, 2)

---

### Example 2

**Input**
```
nums = [6,5,4,8]
```

**Output**
```
[2,1,0,3]
```

---

### Example 3

**Input**
```
nums = [7,7,7,7]
```

**Output**
```
[0,0,0,0]
```

---

## 🔒 Constraints

- `2 <= nums.length <= 500`
- `0 <= nums[i] <= 100`

---

# 🚀 Approach

### Brute Force (Nested Loop)

For each element in the array:
1. Traverse the entire array.
2. Count how many numbers are strictly smaller.
3. Store that count in the result array.

---

## 💻 Java Implementation (My Solution)

```java
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int count = 0;

            for(int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    count++;
                }
            }

            arr[i] = count;
        }

        return arr;
    }
}
```

---

## ⏱ Complexity Analysis

- **Time Complexity:** O(n²)  
  Each element is compared with every other element.

- **Space Complexity:** O(n)  
  A new result array is created.

---
## ✅ Submission Result
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/cc1f1aac-7779-4a0d-ac97-b2c7d5590b8c" />

---
## 🎯 Key Learning

- Nested loops are useful for direct comparison problems.
- Always compare values, not indexes.
- Simple logic can still solve the problem effectively when constraints are small.
