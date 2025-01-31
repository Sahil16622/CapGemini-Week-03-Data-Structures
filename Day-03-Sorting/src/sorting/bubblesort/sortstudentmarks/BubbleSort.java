package sorting.bubblesort.sortstudentmarks;

public class BubbleSort {
    public static void bubbleSort(int [] studentMarks,int size){
        for(int i=size-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(studentMarks[i] < studentMarks[j])
                {
                   Swapper.swap(studentMarks,i,j);
                }
            }
        }
    }
}
