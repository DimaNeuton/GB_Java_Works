// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

package Work01;

public class Task1 {
    public static void main(String[] args) {
        searchMaxAndMin();
    }
    private static void searchMaxAndMin() {
        int[] array = {4, 6, 9, 8, 7, 3, 7};
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int item : array) {
            if (item > maxNum) {
                maxNum = item;
            }
            if (item < minNum) {
                minNum = item;
            }
        }
        System.out.printf("Maximal number - %d\nMinimal number - %d", maxNum, minNum);
    }
}
