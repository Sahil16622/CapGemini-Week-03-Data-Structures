package sorting.insertionsort.sortemployeeids;


public class UseInsertionSort {

    public static void main(String [] args)
    {
        int employeeID[] = {23,15,12,11,65,77,32,54};
        int size =  employeeID.length;

        //display the actual array of marks
        System.out.println("The id's of employee initially was in this order: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(employeeID[i]+" ");
        }
        System.out.println();

        InsertionSort.insertionSort(employeeID,size);

        //after the swapping
        System.out.println("The employee id after proper sorting: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(employeeID[i]+" ");
        }
    }

}
