// 2. Написать метод, который определяет, является ли год високосным, и возвращает
// boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный.

package Work01;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        boolean year = defineYear();
        if (year) {
            System.out.printf("This year is Leap");
        }
        else {
            System.out.printf("This year is not Leap");
        }
    }
    private static boolean defineYear() {
        Scanner in = new Scanner(System.in);
        System.out.print("Write year: ");
        int year = in.nextInt();
        return !((year%4 != 0) || ((year%100 == 0) && (year%400 != 0)));
    }
}
