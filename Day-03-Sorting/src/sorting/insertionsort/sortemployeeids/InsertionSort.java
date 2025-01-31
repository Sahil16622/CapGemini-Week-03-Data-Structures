package sorting.insertionsort.sortemployeeids;

public class InsertionSort {
    public static void insertionSort(int [] employeeID, int length)
    {
        for(int i=0;i<=length-1;i++)
        {
            int j = i;
            while(j > 0 && employeeID[j-1] > employeeID[j])
            {
                Swapper.swap(employeeID,j-1,j);
                j--;
            }
        }
    }
}
