package decorator.bill;
/**
 * @author: Vivian Xu
 */
public abstract class BillDecorator implements Bill {
    protected Bill component;

    public BillDecorator(Bill _component) {
        component = _component;
    }

    @Override
    public float total() {
        return component.total();
    }

}
