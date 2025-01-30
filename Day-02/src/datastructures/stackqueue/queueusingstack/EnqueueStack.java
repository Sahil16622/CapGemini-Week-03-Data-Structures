package datastructures.stackqueue.queueusingstack;

import java.util.Stack;

// Stack for enqueue operations
class EnqueueStack {
    private Stack<Integer> stack;

    public EnqueueStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int pop() {
        return stack.pop();
    }

    public int size() {
        return stack.size();
    }
}
