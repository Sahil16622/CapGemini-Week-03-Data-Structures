package datastructures.stackqueue.stockspanproblem;

import java.util.Stack;

class StockSpanCalculator {
    private int[] prices;

    public StockSpanCalculator(int[] prices) {
        this.prices = prices;
    }

    public int[] calculateSpan() {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stores indices of prices

        for (int i = 0; i < n; i++) {
            // Remove elements from stack while stack is not empty and top price is <= current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Compute span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index to stack
            stack.push(i);
        }
        return span;
    }
}
