package datastructures.linkedlist.singlylinkedlist.studentrecord;

public class UseStudentLinkedList {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();

        studentList.addAtBeginning(1, "Alice", 20, "A");
        studentList.addAtEnd(2, "Bob", 21, "B");
        studentList.addAtPosition(1, 3, "Charlie", 19, "C");

        studentList.displayAll();

        studentList.searchByRollNumber(2);

        studentList.updateGrade(3, "A+");
        studentList.displayAll();

        studentList.deleteByRollNumber(1);
        studentList.displayAll();
    }
}

