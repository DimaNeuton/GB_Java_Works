package Work04;

// 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
