package Work03;

// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            arr.add(random.nextInt(0, 10));
        }
        System.out.println(arr);

        System.out.println("Max number - " + maxIn(arr));

        System.out.println("Min number - " + minIn(arr));

        System.out.println("Average - " + average(arr));

    }

    private static double average(ArrayList<Integer> arr) {
        double sum = 0;
        for (int item : arr) {
            sum += item;
        }
        double aver = sum/arr.size();
        return aver;
    }

    private static int minIn(ArrayList<Integer> arr) {
        int min = Integer.MAX_VALUE;
        for (int item : arr) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    private static int maxIn(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
}
