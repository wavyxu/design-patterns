package template;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: Vivian Xu
 */
class TestRemoveTest {

    protected List<String> list;
    RemoveTemplate obj;

    @Before
    public void initList() {
        list = new ArrayList<String>();
       // obj = new RemoveFREE();
    }

    @Test
    public void removeEmpty() {
        obj.remove(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void removeOnce() {
        list.add("FREE");
        list.add("No Sales");
        obj.remove(list);
        assertFalse(list.contains("FREE"));
    }

    @Test
    public void removeMultiple() {
        list.add("FREE");
        list.add("No Sales");
        list.add("FREE");
        obj.remove(list);
        assertFalse(list.contains("FREE"));
    }

    @Test
    public void removeInexact() {
        list.add("NOTFREE");
        list.add("No Sales");
        list.add("there is no FREE lunch");
        obj.remove(list);
        assertTrue(list.contains("No Sales"));
        assertEquals(list.size(), 1);
    }
}