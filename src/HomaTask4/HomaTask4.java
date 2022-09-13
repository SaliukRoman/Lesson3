package HomaTask4;

public class HomaTask4 {
    public static void main(String[] args) {
        int number = 0;
        int array [] = new int[100];
        for (int i = 0; i<100; i++){
            if (i%14 == 0) {
                array [i] = i;
                System.out.println(array[i]);
            }
        }
    }

}
