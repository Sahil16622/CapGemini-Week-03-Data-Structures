package datastructures.stackqueue.queueusingstack;


import java.util.Stack;


class DequeueStack {
    private Stack<Integer> stack;

    public DequeueStack() {
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

    public int peek() {
        return stack.peek();
    }
}

