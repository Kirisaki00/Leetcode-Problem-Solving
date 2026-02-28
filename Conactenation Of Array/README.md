# 🧩 Concatenation of Array

## 📌 Problem Statement

Given an integer array `nums` of length `n`, create an array `ans` of length `2n` such that:

```
ans[i] = nums[i]
ans[i + n] = nums[i]
```

Return the array `ans`.

---

## 📝 Examples

### Example 1
**Input**
```
nums = [1,2,1]
```

**Output**
```
[1,2,1,1,2,1]
```

---

### Example 2
**Input**
```
nums = [1,3,2,1]
```

**Output**
```
[1,3,2,1,1,3,2,1]
```

---

## 🔒 Constraints

- `n == nums.length`
- `1 <= n <= 1000`
- `1 <= nums[i] <= 1000`

---

## 🚀 Approach

1. Create a new array of size `2n`
2. Traverse the original array
3. Copy each element to:
   - The same index
   - Index shifted by `n`

---

## 💻 Java Implementation

```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
```

---

## ⏱ Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

---

## ✅ Submission Result

Status: Accepted  
Runtime: 1 ms || Beats 96.13%  

```

```
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/bff9e551-e6c3-425f-a915-8d2984bcb96f" />

```

---

# 📂 Recommended Folder Structure

```
<img width="1001" height="305" alt="image" src="https://github.com/user-attachments/assets/fa0c6c31-d923-47c1-8827-146969ec5595" />

```

