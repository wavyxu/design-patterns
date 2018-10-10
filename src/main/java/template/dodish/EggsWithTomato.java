package template.dodish;

/**
 * @author: Vivian Xu
 */
public class EggsWithTomato extends DodishTemplate {
    @Override
    public void preparation() {
        System.out.println("Prepare eggs and tomato");
    }

    @Override
    public void doing() {
        System.out.println("Cooking eggs and tomato");
    }

    @Override
    public void carriedDishes() {
        System.out.println("Send to customers");
    }

}
