package Singleton;

/**
 * Singleton
 */
public class Singleton {

    private static Singleton single = new Singleton();

    private void Singleton()
    {
    };

    public static Singleton getObject()
    {
        return single;
    }

    public int getAddress(Singleton object)
    {
        return object.hashCode();
    }

}