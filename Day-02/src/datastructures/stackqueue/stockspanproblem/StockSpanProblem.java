package datastructures.stackqueue.stockspanproblem;

// Main class to test the implementation
public class StockSpanProblem {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        StockSpanCalculator calculator = new StockSpanCalculator(prices);
        int[] spans = calculator.calculateSpan();

        System.out.print("Stock Spans: ");
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}