package template.sorting;

/**
 * @author: Vivian Xu
 */
public class DescendingBubbleSort extends BubbleSort
{
    public DescendingBubbleSort(int _ary[])
    {
        super(_ary);
    }

    /**
     * The primitive comparison operation
     *
     * @param  num1, num2   the numbers to compare
     * @return     positive number if num1 should go after num2
     *             negative number if num1 should go before num2
     *             zero if the two are equivalent for sorting purposes
     */
    protected int compare(int num1, int num2)
    {
        // put your code here
        return num2 - num1;
    }
}

