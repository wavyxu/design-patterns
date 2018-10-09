package decorator.pizza;

/**
 * @author: Vivian Xu
 */
public class MushroomsToppings extends ToppingDecorator {
    public MushroomsToppings(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return super.toppingPizza.getPrice() + 25;
    }
}
