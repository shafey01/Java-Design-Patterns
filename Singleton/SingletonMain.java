package Singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getObject();
        Singleton singleton2 = Singleton.getObject();

        System.out.println("The Memory Address is : " + singleton1.getAddress(singleton1));
        System.out.println( "The Memory Address is : " + singleton1.getAddress(singleton2));

    }
    
}
