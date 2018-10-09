package factory.widget;



public class WidgetFactory
{
    // singleton instance
    private static WidgetFactory instance = null;

    // private constructor to support making this a singleton
    private WidgetFactory() {}

    public Widget makeWidget()
    {
        return new Widget();
    }

    public static WidgetFactory getWidgetFactory() {
        if (instance == null)
            instance = new WidgetFactory();
        return instance;
    }
}
