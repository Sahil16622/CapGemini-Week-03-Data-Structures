package sorting.bubblesort.sortstudentmarks;

public class UseBubbleSort {

    public static void main(String [] args)
    {
        int studentMarks[] = {78,88,98,96,99,34,40};
        int size = studentMarks.length;

        //display the actual array of marks
        System.out.println("The marks of student initially was in this order: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(studentMarks[i]+" ");
        }
        System.out.println();

        BubbleSort.bubbleSort(studentMarks,size);

        //after the swapping
        System.out.println("The marks of student after proper sorting: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(studentMarks[i]+" ");
        }
    }
}
