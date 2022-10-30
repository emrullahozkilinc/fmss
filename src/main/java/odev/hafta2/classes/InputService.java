package odev.hafta2.classes;

import java.util.Scanner;

public class InputService {

    static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    static String getString(){
        return sc.next();
    }

    static int getInt(){
        return sc.nextInt();
    }
}
