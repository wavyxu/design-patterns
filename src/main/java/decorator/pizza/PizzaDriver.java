package decorator.pizza;

/**
 * @author: Vivian Xu
 */
public class PizzaDriver {
    public static void main(String[] args) {
        Pizza pizza=new PlainPizza();
        System.out.println("Plain Pizza Rs."+ pizza.getPrice());

        pizza=new CheeseToppings(pizza);
        System.out.println("Pizza with Cheese Toppings Rs."+ pizza.getPrice());

        pizza=new ChickenToppings(pizza);
        System.out.println("Pizza with Cheese and Chicken Toppings Rs."+pizza.getPrice());

        pizza=new MushroomsToppings(pizza);
        System.out.println("Pizza with Cheese, Chicken and Mushroom Toppings Rs."+pizza.getPrice());

        Pizza chickPizza = new ChickenToppings(new PlainPizza());
        System.out.println("Pizza with Chicken Topping Rs." + chickPizza.getPrice());

    }
}
