# Question 4: Maximum Subarray

Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum, and return its sum.

**Example 1**

```text
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum, which is 6.
```

**Example 2**

```text
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum, which is 1.
```

**Example 3**

```text
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum, which is 23.
```

### Java Solution (Kadane's Algorithm)

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
```

**Time complexity:** `O(n)`

**Space complexity:** `O(1)`
