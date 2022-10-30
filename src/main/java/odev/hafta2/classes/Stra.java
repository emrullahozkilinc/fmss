package odev.hafta2.classes;

public class Stra {

    private final char[] chars;

    public Stra(int size){
        chars = new char[size];
    }

    public char[] getChars() {
        return chars;
    }

    public void setChar(int index, char c){
        chars[index] = c;
    }

    public static void main(String[] args) {
        Stra stra1 = new Stra(10);
        stra1.setChar(0, 'a');
        stra1.setChar(1, 'b');
        stra1.setChar(2, 'c');
        stra1.setChar(3, 'd');
        stra1.setChar(4, 'e');
        stra1.setChar(5, 'f');
        stra1.setChar(6, 'g');
        stra1.setChar(7, 'h');
        stra1.setChar(8, 'i');
        stra1.setChar(9, 'j');

        for (char c : stra1.getChars()) {
            System.out.print(c);
        }

        System.out.println();

        // Dizi final olmasına rağmen elemanları değiştirilebiliyor.

        stra1.setChar(0, 'z');
        stra1.setChar(1, 'y');
        stra1.setChar(2, 'x');

        for (char c : stra1.getChars()) {
            System.out.print(c);
        }
    }
}
