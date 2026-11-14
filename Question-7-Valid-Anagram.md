# Java-DSA-Daily-Practice

## Question 7: Valid Anagram

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

### Example

```text
Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false
```

### Java Solution

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!freq.containsKey(ch)) return false;

            int count = freq.get(ch) - 1;
            if (count == 0) {
                freq.remove(ch);
            } else {
                freq.put(ch, count);
            }
        }

        return freq.isEmpty();
    }
}
```

**Time complexity:** `O(n)`

**Space complexity:** `O(n)`
