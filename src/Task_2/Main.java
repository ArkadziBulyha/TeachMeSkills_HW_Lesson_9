package Task_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите ваше предложение");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(str.trim().toCharArray());
        System.out.println(MyFirstString.shortWord(str));
    }
}
