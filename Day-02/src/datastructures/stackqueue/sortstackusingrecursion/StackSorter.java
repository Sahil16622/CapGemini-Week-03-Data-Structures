package datastructures.stackqueue.sortstackusingrecursion;

import java.util.Stack;


class StackSorter {
    private Stack<Integer> stack;

    public StackSorter(Stack<Integer> stack) {
        this.stack = stack;
    }

    public void sort() {
        if (!stack.isEmpty()) {
            int temp = stack.pop(); // Pop the top element
            sort(); // Recursively sort the remaining stack
            SortedStackInserter.insertSorted(stack, temp); // Insert in the correct position
        }
    }
}

