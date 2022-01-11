package Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "левел есть котяток нет";
        String[] arrStr = str.split(" ");


        int digit = exectlyNumber(arrStr);
        if (Palindrom.Pal(arrStr, digit)) {
            System.out.println("Слово " + arrStr[digit] + " является палиндоромом");
        } else {
            System.out.println("Слово " + arrStr[digit] + " не является палиндоромом");
        }


    }

    private static int exectlyNumber(String[] arrStr) {

        System.out.println("Введите номер слова в предложении: ");
        Scanner sc = new Scanner(System.in);
        int digit = 1;

        boolean exactlyV = false;
        while (!exactlyV) {
             digit= sc.nextInt();
            if (digit == 0) {
                System.out.println("Введите число больше 0");
            } else if (digit > arrStr.length) {
                System.out.println("Введите число равное " + arrStr.length + " либо меньше него " );
            } else {
                exactlyV = true;
            }
        }

        if (digit > 0) {
            digit -= 1;
        }
        return digit;
    }
}
