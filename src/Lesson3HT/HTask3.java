package Lesson3HT;


public class HTask3 {
    public static void main(String[] args) {
        int[] arrRandom = {11, 22, 32, 5, 87, 99, };
        int array = arrRandom[0];
        for (int i : arrRandom) {
            if (i < array) {
                array = i;
                System.out.println("Найменший елемент масива " + array);
            }
        }
        for (int i : arrRandom) {
            if (i > array) {
                array = i;
                System.out.println("Найбільший елемент масива " + array);

            }

        }

    }

}


