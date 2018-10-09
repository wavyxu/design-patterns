package iterator.digitsIterator;
import java.util.Iterator;
/**
 * @author: Vivian Xu
 */

public class DigitsIterator implements Iterator<Integer>
{
    private Digits num;
    private int divisor;    // keeps track of where we are

    public DigitsIterator(Digits _num)
    {
        num = _num;
        divisor = 1;
    }

    /**
     * Return "current" digit, move to next most significant digit
     *
     * @returns   "current" digit
     */
    @Override
    public Integer next()
    {
        int result;
        int prevDivisor = divisor;

        divisor = divisor * 10;
        result = (num.valueOf() % divisor) / prevDivisor;

        return result;
    }

    /**
     * Check if most significant digit has been reached
     *
     * @returns   true if so, false if not
     */
    @Override
    public boolean hasNext()
    {
        boolean result = false;

        if (0 == num.valueOf())
        {
            if (1 == divisor) result = true;
            else result = false;
        }
        else
        {
            result = (0 != num.valueOf() / divisor);
        }
        return result;
    }

}

