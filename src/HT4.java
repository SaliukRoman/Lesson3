public class HT4 {
    public static void main(String[] args) {
        int[] Fib = new int[10];
        Fib[0] = 0;
        Fib[1] = 1;
        for (int i = 2; i < Fib.length; i++) {
            Fib[i] = Fib[i - 1] + Fib[i - 2];
        }
        for (int i = 0; i < Fib.length; ++i) {
            System.out.println(Fib[i]);
        }
    }
}
