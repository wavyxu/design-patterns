package decorator.pizza;

/**
 * @author: Vivian Xu
 */
public class ChickenToppings extends ToppingDecorator{
    public ChickenToppings(Pizza toppingPizza) {
        super(toppingPizza);
    }

    @Override
    public int getPrice() {
        return super.toppingPizza.getPrice() + 15;
        //return this.toppingPizza.getPrice() + 15;
    }
}
