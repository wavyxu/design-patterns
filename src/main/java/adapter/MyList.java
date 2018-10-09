package adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Vivian Xu
 */
public class MyList implements Iterable<String>{
//public class MyList{

    List<String> list = new ArrayList<String>();

    public MyList() {
    }

    public void add(String s) {
        list.add(s);
    }

    public boolean contains(String s) {
        return list.contains(s);
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }

}
