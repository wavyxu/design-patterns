package template.dodish;

/**
 * @author: Vivian Xu
 */
public abstract class DodishTemplate {
    /**
     * 具体的整个过程
     */
    protected void dodish(){
        this.preparation();
        this.doing();
        this.carriedDishes();
    }

    public abstract void preparation();

    public abstract void doing();

    public abstract void carriedDishes ();
}
