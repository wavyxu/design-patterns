package factory.widget;

public class Widget {
    private String name;
    private String value;

    public Widget() {
        name = "text";
        value = "static text";
    }

    public void draw () { // Pretend the console is a canvas
        System.out.println(value);
    }

    public void setValue(String _value) { value = _value; }
}
