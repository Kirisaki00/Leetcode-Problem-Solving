# 🧩 Set Mismatch

## 📌 Problem Statement

You are given an integer array `nums` of size `n`.

Originally, the array contained all numbers from:

```
1 to n
```

However, due to an error:

- One number appears **twice**
- One number is **missing**

Your task is to find:
- The duplicate number
- The missing number

And return them in the form:

```
[duplicate, missing]
```

---

## 📝 Examples

### Example 1
**Input**
```
nums = [1,2,2,4]
```

**Output**
```
[2,3]
```

---

### Example 2
**Input**
```
nums = [1,1]
```

**Output**
```
[1,2]
```

---

## 🔒 Constraints

- `2 <= nums.length <= 10^4`
- `1 <= nums[i] <= 10^4`
- Exactly one duplicate and one missing number exist

---

## 🚀 Approach

### 🔎 Frequency Counting Method

Since numbers range from `1` to `n`, we:

1. Create a frequency array of size `n + 1`
2. Traverse `nums` and count occurrences
3. Traverse the frequency array:
   - If frequency = `2` → duplicate number
   - If frequency = `0` → missing number

---

## 💻 Java Implementation

```java
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int[] seen = new int[nums.length + 1];

        for(int num : nums){
            if(seen[num] == 1){
                res[0] = num;   // duplicate
            }
            seen[num]++;
        }

        for(int i = 1; i <= nums.length; i++){
            if(seen[i] == 0){
                res[1] = i;     // missing
                break;
            }
        }

        return res;
    }
}
```

---

## ✅ Submission Result
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/472611f3-5610-4bfc-9089-4d9acc442b8f" />

## ⏱ Time Complexity

- **O(n)**  
We traverse the array twice.

## 🧠 Space Complexity

- **O(n)**  
We use an additional frequency array.

---

## 🎯 Key Learning

- When numbers range from `1` to `n`, indexing can be used as a hashing technique.
- Frequency arrays are useful for detecting duplicates and missing elements.
- Always consider constraints before choosing a solution approach.

---

## 📂 Folder Structure

```
Set-Mismatch/
│
├── Solution.java
└── README.md
```

---

⭐ If you found this useful, feel free to explore other problems in this repository.
