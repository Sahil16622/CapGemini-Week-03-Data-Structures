package datastructures.stackqueue.sortstackusingrecursion;
import java.util.Stack;


class SortedStackInserter {
    public static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element); // Base case: Insert when stack is empty or correct position found
        } else {
            int temp = stack.pop(); // Remove top element
            insertSorted(stack, element); // Recur to find correct position
            stack.push(temp); // Push back the removed element
        }
    }
}
