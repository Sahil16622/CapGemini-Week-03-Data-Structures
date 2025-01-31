package sorting.bubblesort.sortstudentmarks;

public class Swapper {
    public static void swap(int [] studentMarks, int i, int j)
    {
        int temp = studentMarks[i];
        studentMarks[i] = studentMarks[j];
        studentMarks[j] = temp;
    }
}
