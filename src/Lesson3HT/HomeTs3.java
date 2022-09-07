package Lesson3HT;

import java.util.Scanner;

public class HomeTs3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float m = scanner.nextFloat();
        float n = scanner.nextFloat();
        float v = closestToTen(m, n);
        if (Float.isNaN(v)) System.out.println("Одинакові");
        else System.out.println("ближче до 10: " + v);
    }

    static float closestToTen(float m, float n) {
        float d1 = Math.abs(m - 10);
        float d2 = Math.abs(n - 10);
        if (d1 == d2) return Float.NaN;
        return d1 < d2 ? m : n;
    }
}


