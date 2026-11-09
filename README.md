# Java-DSA-Daily-Practice

## Question 1: Two Sum

Given an integer array `nums` and an integer `target`, return the indices of two different elements whose sum is `target`. Assume exactly one valid answer exists. You may return the indices in any order.

**Example**

```text
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9
```

### Java Solution

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> seen = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (seen.containsKey(complement)) {
				return new int[] {seen.get(complement), i};
			}

			seen.put(nums[i], i);
		}

		return new int[0];
	}
}
```

**Time complexity:** `O(n)`

**Space complexity:** `O(n)`