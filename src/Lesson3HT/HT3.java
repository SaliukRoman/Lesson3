package Lesson3HT;

import java.util.Scanner;

public class HT3 {
    public static void main(String[] args) {
        System.out.println("Введіть день тижня: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Понеділок робота");
                break;
            case 2:
                System.out.println("Вівторок робота");
                break;
            case 3:
                System.out.println("Середа робота");
                break;
            case 4:
                System.out.println("Четвер робота");
                break;
            case 5:
                System.out.println("Пятниця робота");
                break;
            case 6:
                System.out.println("Субота вихідний");
                break;
            case 7:
                System.out.println("Неділя вихідний");
                break;
            default:
                System.out.println("Немає такого дня");
                break;
        }

    }
}
