package template.dodish;

/**
 * @author: Vivian Xu
 */
public class DodishDriver {
    public static void main(String[] args) {
        DodishTemplate eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dodish();

        System.out.println("-----------------------------");

        DodishTemplate porkWithPotato = new PorkWithPotato();
        porkWithPotato.dodish();
    }
}
