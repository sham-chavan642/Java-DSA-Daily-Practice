# Java-DSA-Daily-Practice

## Question 10: Valid Palindrome

Given a string `s`, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

### Example

```text
Input: s = "A man, a plan, a canal: Panama"
Output: true
```

### Java Solution

```java
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
```

**Time complexity:** `O(n)`

**Space complexity:** `O(1)`
