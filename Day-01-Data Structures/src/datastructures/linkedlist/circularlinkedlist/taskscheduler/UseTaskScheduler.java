package datastructures.linkedlist.circularlinkedlist.taskscheduler;

public class UseTaskScheduler {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(101, "Complete Report", 1, "2025-02-01");
        scheduler.addAtBeginning(102, "Team Meeting", 2, "2025-02-02");
        scheduler.addAtEnd(103, "Submit Assignment", 3, "2025-02-03");
        scheduler.addAtPosition(104, "Code Review", 2, "2025-02-04", 2);

        System.out.println("All Tasks:");
        scheduler.displayTasks();

        System.out.println("\nViewing Current Task:");
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();

        System.out.println("\nSearching for Tasks with Priority 2:");
        scheduler.searchByPriority(2);

        System.out.println("\nRemoving Task ID 102:");
        scheduler.removeByTaskId(102);
        scheduler.displayTasks();
    }
}

