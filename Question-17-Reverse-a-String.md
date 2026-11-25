# Java Interview Question 17 - Reverse a String

**Difficulty:** Easy

## Question

Write a Java program to reverse a given string without using the built-in reverse() method.

## Example 1

**Input:**
```text
Hello
```

**Output:**
```text
olleH
```

## Example 2

**Input:**
```text
Shyam
```

**Output:**
```text
mayhS
```

## Approach

1. Take a string as input.
2. Create an empty string to store the reversed string.
3. Run a loop from the last character to the first character.
4. Add each character to the result.
5. Print the reversed string.

## Java Solution

```java
class Main {
    public static void main(String[] args) {
        String str = "Hello";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(reverse);
    }
}
```

## Output

```text
olleH
```

## Time Complexity

O(N) - We traverse each character once.

## Space Complexity

O(N) - We store the reversed string.

## Interview Concepts

- String
- For Loop
- charAt()
- String Manipulation
