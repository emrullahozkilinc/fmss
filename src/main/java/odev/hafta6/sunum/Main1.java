package odev.hafta6.sunum;

public class Main1 {

    public static void main(String[] args) {
        int n = 100;
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
        for (int i = 0; i < n; i++) {
            new CustomerNoFields();
        }
        long s2 = System.nanoTime();

        System.out.println("new:   " + String.format("%,d", (s2-s1)));
    }

    static void withClone(int n){
        long s3 = System.nanoTime();
        CustomerNoFields customer = new CustomerNoFields();
        for (int i = 0; i < n; i++) {
            customer.clone();
        }
        long s4 = System.nanoTime();

        System.out.println("clone: " + String.format("%,d", (s4-s3)));
    }
}

class CustomerNoFields implements Cloneable{

    @Override
    public CustomerNoFields clone() {
        try {
            return (CustomerNoFields) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
