package decorator.bill;
/**
 * @author: Vivian Xu
 */
public class CouponDecorator extends BillDecorator {
    private float discount = (float) 0.1;
    public CouponDecorator(Bill component) {
        super(component);
    }

    @Override
    public float total() {
        return (1 - discount) * super.total();
    }
}
