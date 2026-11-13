# Java-DSA-Daily-Practice

## Question 6: Product of Array Except Self

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

The product of any prefix or suffix of the array is used to build the result, and the overall time complexity should be `O(n)`.

### Example

```text
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Explanation:
- For index 0, product of all elements except nums[0] = 2*3*4 = 24
- For index 1, product of all elements except nums[1] = 1*3*4 = 12
- For index 2, product of all elements except nums[2] = 1*2*4 = 8
- For index 3, product of all elements except nums[3] = 1*2*3 = 6
```

### Java Solution

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}
```

**Time complexity:** `O(n)`

**Space complexity:** `O(1)` extra space
