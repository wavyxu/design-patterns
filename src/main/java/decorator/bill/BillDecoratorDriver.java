package decorator.bill;
/**
 * @author: Vivian Xu
 */
public class BillDecoratorDriver {
    public static void main(String[] args) {
        Bill bill = new TaxDecorator(new CouponDecorator(new ConcreteBill(10)));
        System.out.println("Total = $" + bill.total());
    }
}
