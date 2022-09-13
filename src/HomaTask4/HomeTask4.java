package HomaTask4;

public class HomeTask4 {
    public static void main(String[] args) {
        int[] arrRandom = {11, 22, 32, 5, 87, 99};
        int min = arrRandom[0];
        int max = arrRandom[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arrRandom.length; i++) {
            if (arrRandom[i] > max) {
                max = arrRandom[i];
                maxIndex = i;

            }
        }
        for (int n = 0; n < arrRandom.length; n++) {
            if (arrRandom[n] < min) {
                min = arrRandom[n];
                minIndex = n;


            }

        }
        System.out.println(minIndex);
        System.out.println(maxIndex);
    }

}
