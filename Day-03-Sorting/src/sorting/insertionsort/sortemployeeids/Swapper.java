package sorting.insertionsort.sortemployeeids;

public class Swapper {
    public static void swap(int [] employeeID, int i, int j)
    {
        int temp = employeeID[i];
        employeeID[i] = employeeID[j];
        employeeID[j] = temp;
    }
}
