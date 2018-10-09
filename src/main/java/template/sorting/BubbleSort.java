package template.sorting;

/**
 * @author: Vivian Xu
 */
public abstract class BubbleSort
{
    // The list to sort
    private int[] ary;

    /**
     * constructor to store list
     */
    public BubbleSort(int _ary[])
    {
        ary = _ary;
    }

    /**
     * function to do bubble sort on an integer array
     */
    public final void Bubblesort()  {

        int pair;
        int number_of_swaps = 1;
        int length = ary.length;

        while (number_of_swaps > 0)  {
            number_of_swaps = 0;   // havent made any swaps yet

            for( pair = 0; pair < length-1; ++pair)  {
                // compare() is the primitive operation
                if( compare(ary[pair], ary[pair + 1] ) > 0)  {
                    number_of_swaps ++;
                    swap(ary, pair, pair+1);
                } // ends the if
            } // ends the for loops
        } // ends the while loop

        return;
    } // ends bubblesort

    /*** function to swap two integers in an array
     the inputs are the array, and the indices of the 2
     elements to swap.
     ***/
    private void swap( int ary[], int leftindex, int rightindex) {
        int temp;

        temp = ary[leftindex];
        ary[leftindex] = ary[rightindex];
        ary[rightindex] = temp;

        return;
    } // ends the function

    /**
     * The abstract primitive operation
     *
     */
    protected abstract int compare(int num1, int num2);
}

