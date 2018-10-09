package decorator.bill;
/**
 * @author: Vivian Xu
 */
public class TaxDecorator extends BillDecorator {
    private float taxRate = (float) 0.2;
    public TaxDecorator(Bill _component) {
        super(_component);
    }

    @Override
    public float total() {

        return (1 - taxRate) * super.total();
    }
}
