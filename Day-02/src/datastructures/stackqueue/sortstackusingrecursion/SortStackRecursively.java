package datastructures.stackqueue.sortstackusingrecursion;

import java.util.*;



public class SortStackRecursively {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        StackSorter sorter = new StackSorter(stack);
        sorter.sort();

        System.out.println("Sorted Stack: " + stack);
    }
}
