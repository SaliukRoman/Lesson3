import java.util.Scanner;

public class HTask5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введіть кількість елементів масиву: ");
        int num = s.nextInt();
        int a[] = new int[num];
        System.out.println("введіть елементи: ");
        for (int i = 0; i < num; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Елементи в зворотньому порядку: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
