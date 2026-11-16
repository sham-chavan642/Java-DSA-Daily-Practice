# Java-DSA-Daily-Practice

## Question 9: Group Anagrams

Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.

### Example

```text
Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

### Java Solution

```java
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
```

**Time complexity:** `O(n * k log k)` where `k` is the maximum length of a string

**Space complexity:** `O(n * k)`
