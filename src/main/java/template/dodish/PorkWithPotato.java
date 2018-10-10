package template.dodish;

/**
 * @author: Vivian Xu
 */
public class PorkWithPotato extends DodishTemplate {
    @Override
    public void preparation() {
        System.out.println("Prepare port and potato");
    }

    @Override
    public void doing() {
        System.out.println("Cooking pork with potato");
    }

    @Override
    public void carriedDishes() {
        System.out.println("Send to customers");
    }

}
