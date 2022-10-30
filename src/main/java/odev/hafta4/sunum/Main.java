package odev.hafta4.sunum;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception{
        Singleton inst1 = Singleton.instance;
        Singleton inst2;

        Constructor constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        inst2 = (Singleton) constructor.newInstance();

        System.out.println("inst1.hashcode = " + inst1.hashCode());
        System.out.println("inst2.hashcode = " + inst2.hashCode());
    }
}

class Singleton {
    public final static Singleton instance = new Singleton();

    private Singleton(){

    }
}