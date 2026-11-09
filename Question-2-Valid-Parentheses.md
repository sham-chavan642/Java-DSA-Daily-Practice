# Question 2: Valid Parentheses

Given a string `s` containing only the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, and `']'`, determine if the input string is valid.

An input string is valid if:
- Open brackets are closed by the same type of brackets.
- Open brackets are closed in the correct order.
- Every closing bracket has a corresponding open bracket.

**Example**

```text
Input: s = "()[]{}"
Output: true
```

```text
Input: s = "([)]"
Output: false
```

### Java Solution

```java
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();
                if ((ch == ')' && open != '(')
                        || (ch == '}' && open != '{')
                        || (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
```

**Time complexity:** `O(n)`

**Space complexity:** `O(n)`
