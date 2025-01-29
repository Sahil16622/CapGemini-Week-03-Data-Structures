package datastructures.linkedlist.circularlinkedlist.roundrobinschedulingalgo;

import java.util.LinkedList;
import java.util.Queue;



class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head; // Circular link
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head; // Maintain circular link
        }
    }

    // Remove a process by Process ID
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes available.");
            return;
        }

        Process temp = head, prev = null;

        // If head is the process to be removed
        if (head.processId == processId) {
            if (head == tail) { // Only one process
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        // Search for the process
        do {
            prev = temp;
            temp = temp.next;
            if (temp.processId == processId) {
                prev.next = temp.next;
                if (temp == tail) {
                    tail = prev;
                }
                tail.next = head;
                return;
            }
        } while (temp != head);

        System.out.println("Process not found.");
    }

    // Simulate Round Robin Scheduling
    public void simulateScheduling() {
        if (head == null) {
            System.out.println("No processes available.");
            return;
        }

        Queue<Integer> waitingTimes = new LinkedList<>();
        Queue<Integer> turnaroundTimes = new LinkedList<>();
        int totalTime = 0;
        Process current = head;

        System.out.println("\nExecuting Round Robin Scheduling with Time Quantum = " + timeQuantum);

        while (head != null) {
            System.out.println("\nCurrent Process Queue:");
            displayProcesses();

            if (current.burstTime > timeQuantum) {
                System.out.println("Process " + current.processId + " executes for " + timeQuantum + " units.");
                current.burstTime -= timeQuantum;
                totalTime += timeQuantum;
                current = current.next;
            } else {
                System.out.println("Process " + current.processId + " completes execution.");
                totalTime += current.burstTime;
                turnaroundTimes.add(totalTime);
                waitingTimes.add(totalTime - current.burstTime);

                int completedProcessId = current.processId;
                current = current.next;
                removeProcess(completedProcessId);
            }
        }

        calculateAverageTimes(waitingTimes, turnaroundTimes);
    }

    // Calculate and display average waiting and turnaround time
    private void calculateAverageTimes(Queue<Integer> waitingTimes, Queue<Integer> turnaroundTimes) {
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int count = waitingTimes.size();

        for (int time : waitingTimes) totalWaitingTime += time;
        for (int time : turnaroundTimes) totalTurnaroundTime += time;

        System.out.println("\nAverage Waiting Time: " + (count > 0 ? (double) totalWaitingTime / count : 0));
        System.out.println("Average Turnaround Time: " + (count > 0 ? (double) totalTurnaroundTime / count : 0));
    }

    // Display processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes available.");
            return;
        }

        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}

