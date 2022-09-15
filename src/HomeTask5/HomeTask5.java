import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int period = scanner.nextInt();
        float percent = scanner.nextFloat();
        for (int i = 0; i<period; i++){
            sum += sum * percent;
        }
        System.out.println(sum);
    }
}
