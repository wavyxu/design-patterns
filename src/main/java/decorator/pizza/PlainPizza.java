package decorator.pizza;

/**
 * @author: Vivian Xu
 */
public class PlainPizza implements  Pizza {
    @Override
    public int getPrice() {
        return 50;
    }
}
