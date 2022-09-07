package Lesson1HT;

import java.util.Scanner;

public class HT1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        double pi = 3.14;
        int square = (int) (pi * radius * radius);
        int length = (int) (2 * pi * radius);

        System.out.println(square);
        System.out.println(length);
    }
}


