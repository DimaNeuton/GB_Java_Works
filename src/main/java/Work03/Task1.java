package Work03;



// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int size = 20;
        for (int i = 0; i < size; i++) {
            arr.add(random.nextInt(0, 10));
        }
        System.out.println(arr);
        arr.removeIf(x -> x%2 == 0);
        System.out.println(arr);
    }
}
