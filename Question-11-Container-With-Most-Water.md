# Java-DSA-Daily-Practice

## Question 11: Container With Most Water

You are given an integer array `height` of length `n`. There are `n` vertical lines such that the two endpoints of the `i`th line are `(i, 0)` and `(i, height[i])`.

Choose two lines that, together with the x-axis, form a container that holds the most water. Return the maximum amount of water the container can store.

The container's area is calculated as:

`(right - left) * min(height[left], height[right])`

### Example

```text
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The lines at indices 1 and 8 form a container with area 7 * min(8, 7) = 49.
```

```text
Input: height = [1,1]
Output: 1
```

### Java Solution

```java
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
```

**Time complexity:** `O(n)`

**Space complexity:** `O(1)`
