package factory.widget;


public class Driver {
    public static void main(String[] args) {
        WidgetFactory f = WidgetFactory.getWidgetFactory();
        Widget w = f.makeWidget();
        w.draw();
        Widget w2 = f.makeWidget();
        w2.setValue("2nd widget");
        w2.draw();
    }
}
