package decorator.degree;
/**
 * @author: Vivian Xu
 */
class DegreeDecorator implements Person {
    protected Person person;
    protected String degree;

    public DegreeDecorator(Person _person, String _degree) {
        person = _person;
        degree = _degree;
    }

    @Override
    public String toName() {
        return person.toName() + ", " + degree;
    }



}