package decorator.degree;
/**
 * @author: Vivian Xu
 */
class ConcretePerson implements Person {
    protected String name;

    public ConcretePerson(String _name) {
        name = _name;
    }

    @Override
    public String toName() {
        return name;
    }

}
