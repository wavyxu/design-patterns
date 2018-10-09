package template.sorting;

/**
 * @author: Vivian Xu
 */
public class SortDriver {
    final static int LENGTH = 10; // length of the array

    public static void main (String[] args) {

        int element;
        int myarray[] = new int[LENGTH];   // array of integers

        // Entering the array  use random numbers between 0 & 100
        for (element = 0; element < LENGTH; ++element)   {
            myarray[element] = (int) (Math.random() * 101);
        }

        /*** Print original list ***/
        System.out.println("Original list:");
        show_array( myarray);

        /*** The sorting  ***/
        // ascending order
        BubbleSort sortingObject = new AscendingBubbleSort(myarray);
        sortingObject.Bubblesort();

        /*** Print the results ***/
        System.out.println("Sorted list: (ascending)");
        show_array( myarray);

        // descending order
        sortingObject = new DescendingBubbleSort(myarray);
        sortingObject.Bubblesort();

        /*** Print the results ***/
        System.out.println("Sorted list: (descending)");
        show_array( myarray);

        return;
    } // ends the main



    /*** Printing out an array ***/
    static void show_array( int ary[]) {

        int j;

        System.out.println("(" + ary.length + " array elements) ");

        for(j=0;j < ary.length; ++j) {
            System.out.print(ary[j] + "\t");
        }

        System.out.println("\nEnd of array");
        return;
    } // ends the function
}

