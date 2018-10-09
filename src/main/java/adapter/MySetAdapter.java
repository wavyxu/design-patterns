package adapter;

/**
 * @author: Vivian Xu
 */
public class MySetAdapter extends MyList implements MySet {

    @Override
    public void union(MySet other) {
        MySetAdapter otherList = (MySetAdapter)other;
        for (String string : otherList) {
            if (!this.contains(string)) {
                this.add(string);
            }
        }
    }

}
