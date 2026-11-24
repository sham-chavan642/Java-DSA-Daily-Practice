# LeetCode 199 - Binary Tree Right Side View

**Difficulty:** Medium

## Problem Statement

Given the root of a binary tree, imagine yourself standing on the right side of it. Return the values of the nodes you can see ordered from top to bottom.

## Example 1

**Input:**
```text
root = [1,2,3,null,5,null,4]
```

**Output:**
```text
[1,3,4]
```

## Example 2

**Input:**
```text
root = [1,2,3,4,null,null,null,5]
```

**Output:**
```text
[1,3,4,5]
```

## Approach - BFS (Level Order Traversal)

1. Use a Queue to traverse the binary tree level by level.
2. Add the root node to the queue.
3. For each level, find the number of nodes.
4. Remove each node from the queue.
5. Add its left and right children to the queue.
6. Store the last node of each level in the result.
7. Return the result.

## Java Solution

```java
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (i == size - 1) {
                    result.add(node.val);
                }

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return result;
    }
}
```

## Time Complexity

O(N) - Every node is visited once.

## Space Complexity

O(N) - Queue stores nodes during level order traversal.

## Key Concept

- Binary Tree
- BFS
- Queue
- Level Order Traversal
