import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Question 2: Valid Parentheses
 *
 * Given a string containing only '(', ')', '{', '}', '[' and ']', determine
 * whether every opening bracket is closed by the matching bracket in the
 * correct order.
 */
public class Question2ValidParentheses {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }

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

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("([)]"));   // false
    }
}
