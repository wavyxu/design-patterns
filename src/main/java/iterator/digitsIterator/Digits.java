package iterator.digitsIterator;
import java.util.Iterator;

/**
 * @author: Vivian Xu
 */


public class Digits implements Iterable<Integer>
{
    private int nonnegativeInt;

    public Digits(int num) throws Exception
    {
        if (num < 0) throw new Exception("Negative numbers not supported");
        else nonnegativeInt = num;
    }

    public int valueOf() { return nonnegativeInt; }

    @Override
    public Iterator<Integer> iterator()
    {
        return new DigitsIterator(this);
    }

    public static void main(String[] args) throws Exception {
        Digits num = new Digits(1234);
        for (int next : num)
            System.out.println(next);
    }
}
