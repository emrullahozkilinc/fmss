package odev.hafta2.classes;

import java.util.Random;
import java.util.Scanner;

public class NumberUtil {

    public static void main(String[] args) {
        // Ödev1
        /*
        System.out.println(getDigitsCount(100));
        System.out.println(getDigitsCount(10324));
        System.out.println(getDigitsCount(99));
        System.out.println(getDigitsCount(1034210));
        */

        //Ödev2
        wordConcat();
    }

    //1
    static int getDigitsCount(int number) {
        int digit = 0;
        while (number > 0){
            number /= 10;
            digit++;
        }
        return digit;
    }

    //2
    static int getReverse(int number) {
        int digit = getDigitsCount(number);
        int result = 0;
        int[] digits = new int[digit];
        for (int i = 0; i < digit; i++) {
            digits[i] = number %10;
            number /= 10;
        }
        for (int i = digit; i > 0; i--) {
            System.err.println(i^10);
            result += (i%10) * digits[i-1];
        }
        return result;
    }

    //3
    static int pow(int a, int b){
        if (b > 0){
            int temp = 1;
            for (int i = 0; i < b; i++) {
                temp *=a;
            }
            return temp;
        } else {
            return 0;
        }

    }

    //4
    static boolean isArmstrong(int a){
        if(a>0){
            int sum = 0;
            for (int i = 1; a > 0; i++) {
                sum += pow((a%10),i);
                a /= 10;
            }
            return sum == a;
        } else
            return false;
    }

    //5
    static int factorial(int number) {
        if (number == 0)
            return 1;
        else if (number < 0)
            return -1;
        return number * factorial(number-1);
    }

    //6
    static boolean isLeapYear(int year) {
        return year %4 == 0;
    }

    //7
    static boolean isValidDate(int day, int month, int year){
        return daysOfMonth(day,month,year)>0;
    }

    static int daysOfMonth(int day, int month, int year){
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(isValidDay(day,31))
                    return 31;
            case 2:
                if (isLeapYear(year))
                    if (isValidDay(day,29))
                        return 29;
                    else
                        return 28;
            case 4: case 6: case 9: case 11:
                if(isValidDay(day,30))
                    return 30;
        }
        return -1;
    }

    static boolean isValidDay(int day, int max){
        return (day >= 1) && (day <= max);
    }


    //8
    static int getDayOfYear(int day, int month, int year){
        int sum = 0;
        for (int i = 0; i < month; i++) {
            sum += daysOfMonth(1,(i+1), 1991);
        }
        sum += day;
        return sum;
    }

    //9
    static String getDayOfWeek(int day, int month, int year){
        if(!isValidDate(day,month,year))
            return "-1";
        int days = 0;
        days += year*365;
        days += (year/4);
        for (int i = 1; i <= month; i++) {
            days += daysOfMonth(1,i,1999);
        }
        days += day;

        return getDay((days%7)+1);
    }

    static String getDay(int day){
        switch (day){
            case 0: return "Pazartesi";
            case 1: return "Salı";
            case 2: return "Çarşamba";
            case 3: return "Perşembe";
            case 4: return "Cuma";
            case 5: return "Cumartesi";
            case 6: return "Pazar";
        }
        return "";
    }


    //10
    static void bankApp(){
        String user = "user";
        String pass = "pass";
        int n = 3;

        while(n>0){
            System.out.println("Kullanıcı Adı Girin:");
            String inputUser = getInput();
            String passUser = getInput();

            n--;

            if((inputUser.equals(user)) & (passUser.equals(pass))) {
                System.out.println("Giriş Başarılı.");
                return;
            }else
                System.out.printf("Giriş Başarısız %d hakkınız kaldı.", n);
        }
        System.out.println("Giriş hakkınız bitti.");
    }

    static String getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    //11
    static void toDice(int simulationN){
        Random r = new Random();
        int twices = 0;
        int others = 0;
        for (int i = 0; i < simulationN; i++) {
            int a = r.nextInt(1,7);
            int b = r.nextInt(1,7);

            if (a == b)
                twices++;
            else
                others++;
        }

        System.out.printf("Deneme Sayısı: %d \n Çiftler: %d \n Diğerleri: %d \n Oran: %f",
                simulationN, twices, others, ((double)twices/(double) simulationN));
    }

    //12
    static void wordConcat(){
        String result = "";
        String input = "";
        while (!input.equals("quit")){
            result = result.concat(input.concat("-"));
            System.out.println("Bir şey yazın:");
            input = getInput();
        }

        System.out.println(result);
    }
}
