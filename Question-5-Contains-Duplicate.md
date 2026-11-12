# Java-DSA-Daily-Practice

## Question 5: Contains Duplicate

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

### Example

```text
Input: nums = [1, 2, 3, 1]
Output: true
Explanation: The value 1 appears twice.
```

### Java Solution

```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }
}
```

**Time complexity:** `O(n)`

**Space complexity:** `O(n)`
