# Question 3: Best Time to Buy and Sell Stock

You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`th day.

Choose one day to buy one stock and a different day in the future to sell it. Return the maximum profit you can achieve. If you cannot achieve any profit, return `0`.

**Example 1**

```text
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
```

**Example 2**

```text
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: No transactions are completed, so the maximum profit is 0.
```

### Java Solution

```java
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}
```

**Time complexity:** `O(n)`

**Space complexity:** `O(1)`
