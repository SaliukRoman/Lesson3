package HomaTask4;

public class HomeT4 {
    public static void main(String[] args) {
        int[] numbers1 = {11, 22, 32, 5, 87, 99};
        int[] numbers2 = {10, 3, 31, 0, 87, 9};
        int[] numbers3 = new int [6];
        for (int i = 0; i < numbers3.length; i++){
            numbers3[i] = numbers1[i] - numbers2 [i];
            System.out.println(numbers3[i] + " ");
        }

    }
}
