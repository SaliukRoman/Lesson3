package Lesson1HT;

import java.util.Scanner;

public class HomeTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = b * 2 - 4 * a * c;
        int x1 = (int) ((-b - Math.sqrt(1.0 * d)) / (2 * a));

        int x2 = (int) ((-b + Math.sqrt(1.0 * d)) / (2 * a));



        if (d == 0)

            System.out.printf("One root: %.0f\n", x1);

        else if (d < 0)

            System.out.printf("No roots\n");

        else if (x1 < x2)

            System.out.printf("Two roots: %.0f %.0f\n", x1, x2);

        else

            System.out.printf("Two roots: %.0f %.0f\n ", x2, x1);



        scanner.close();

    }

}
