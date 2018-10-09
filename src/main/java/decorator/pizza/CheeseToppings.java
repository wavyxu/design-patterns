package decorator.pizza;

/**
 * @author: Vivian Xu
 */
public class CheeseToppings extends ToppingDecorator{
    public CheeseToppings(Pizza toppingPizza) {
        super(toppingPizza);
    }

    @Override
    public int getPrice() {
        //return this.toppingPizza.getPrice() + 20;
        return super.toppingPizza.getPrice() + 20;
    }
}
