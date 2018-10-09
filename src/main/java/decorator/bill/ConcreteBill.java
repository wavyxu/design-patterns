package decorator.bill;
/**
 * @author: Vivian Xu
 */
public class ConcreteBill implements Bill {
    private final float amt;

    public ConcreteBill(float amount) {
        amt = amount;
    }
    @Override
    public float total() {
        return amt;
    }

}
