package odev.hafta6.sunum;

import java.util.Date;
import java.util.Random;

public class Main2 {


    public static void main(String[] args) {
        int n  = 100;
        int n1 = 10_000;
        int n2 = 1_000_000;
        int n3 = 100_000_000;


        System.out.println("\nn = " + String.format("%,d", n));
        withNew(n);
        withClone(n);
        System.out.println();

        System.out.println("n1 = " + String.format("%,d", n1));
        withNew(n1);
        withClone(n1);
        System.out.println();

        System.out.println("n2 = " + String.format("%,d", n2));
        withNew(n2);
        withClone(n2);
        System.out.println();

        System.out.println("n3 = " + String.format("%,d", n3));
        withNew(n3);
        withClone(n3);
        System.out.println();

    }

    static void withNew(int n){
        long s1 = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            new Customer("Emrullah", "Ozkilinc", random.nextInt(), new Date());
        }
        long s2 = System.nanoTime();

        System.out.println("new:   " + String.format("%,d", (s2-s1)));
    }

    static void withClone(int n){
        long s3 = System.nanoTime();
        Customer customer = new Customer("Emrullah", "Ozkilinc", 0, new Date());
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            customer.clone();
            customer.setAge(random.nextInt());
        }
        long s4 = System.nanoTime();

        System.out.println("clone: " + String.format("%,d", (s4-s3)));
    }
}

class Customer implements Cloneable{
    String name;
    String lastname;
    int age;
    Date date;

    public Customer(String name, String lastname, int age, Date date) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.date = date;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Customer clone() {
        try {
            return (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
