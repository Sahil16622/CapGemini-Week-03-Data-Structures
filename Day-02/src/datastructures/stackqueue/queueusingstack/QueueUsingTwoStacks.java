package datastructures.stackqueue.queueusingstack;

// Queue implementation using the two separate stack classes
class QueueUsingTwoStacks {
    private EnqueueStack enqueueStack;
    private DequeueStack dequeueStack;

    public QueueUsingTwoStacks() {
        enqueueStack = new EnqueueStack();
        dequeueStack = new DequeueStack();
    }

    // Enqueue operation
    public void enqueue(int x) {
        enqueueStack.push(x);
    }

    // Dequeue operation
    public int dequeue() {
        if (dequeueStack.isEmpty()) {
            if (enqueueStack.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            transferElements();
        }
        return dequeueStack.pop();
    }

    // Peek operation
    public int peek() {
        if (dequeueStack.isEmpty()) {
            if (enqueueStack.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            transferElements();
        }
        return dequeueStack.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    // Transfer elements from enqueue stack to dequeue stack
    private void transferElements() {
        while (!enqueueStack.isEmpty()) {
            dequeueStack.push(enqueueStack.pop());
        }
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // Output: 1
        queue.enqueue(4);
        System.out.println(queue.peek());    // Output: 2
        System.out.println(queue.dequeue()); // Output: 2
        System.out.println(queue.isEmpty()); // Output: false
    }
}

