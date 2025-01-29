package datastructures.linkedlist.circularlinkedlist.taskscheduler;

class TaskScheduler {
    private Task head = null;
    private Task tail = null;
    private Task currentTask = null;

    // Add task at the beginning
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head; // Circular link
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head; // Maintain circular link
        }
    }

    // Add task at the end
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head; // Maintain circular link
        }
    }

    // Add task at a specific position
    public void addAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        if (position <= 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newTask.next = temp.next;
        temp.next = newTask;
        if (temp == tail) {
            tail = newTask;
        }
        tail.next = head; // Maintain circular link
    }

    // Remove a task by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head, prev = null;

        // If head is the task to be deleted
        if (head.taskId == taskId) {
            if (head == tail) { // Only one task
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        // Search for the task
        do {
            prev = temp;
            temp = temp.next;
            if (temp.taskId == taskId) {
                prev.next = temp.next;
                if (temp == tail) {
                    tail = prev;
                }
                tail.next = head;
                return;
            }
        } while (temp != head);

        System.out.println("Task not found.");
    }

    // View the current task and move to the next task
    public void viewCurrentTask() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        if (currentTask == null) {
            currentTask = head;
        }

        System.out.println("Current Task: " + currentTask.taskId + " - " + currentTask.taskName +
                " (Priority: " + currentTask.priority + ", Due: " + currentTask.dueDate + ")");
        currentTask = currentTask.next; // Move to next task (circular rotation)
    }

    // Display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search tasks by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Due: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }
}


