//package decorator.degree;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
//import org.junit.Test;
//
//public class DegreeDecoratorTest {
//    private Person person = new ConcretePerson("Lee Jones");
//
//    @Test
//    public void undecorated() {
//        assertThat(person.toName(), is("Lee Jones"));
//    }
//
//    @Test
//    public void oneDecoration() {
//        assertThat(new DegreeDecorator(person, "BA CSU East Bay").toName(), is("Lee Jones, BA CSU East Bay"));
//    }
//
//
//    @Test
//    public void twoDecorations() {
//        assertThat(new DegreeDecorator(new DegreeDecorator(person, "BA CSU East Bay"), "MA UW").toName(), is("Lee Jones, BA CSU East Bay, MA UW"));
//    }
//}
