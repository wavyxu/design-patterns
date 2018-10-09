package decorator.pizza;

/**
 * @author: Vivian Xu
 */
abstract public class ToppingDecorator implements Pizza{
    Pizza toppingPizza;
    public ToppingDecorator(Pizza toppingPizza) {
        this.toppingPizza = toppingPizza;
    }
}
