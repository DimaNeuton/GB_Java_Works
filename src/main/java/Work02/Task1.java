// 1. Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).

package Work02;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        boolean flag = isPalindrom();
        if (flag) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");

        }
    }
    private static boolean isPalindrom() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.next();
        char[] charStr = str.toCharArray();
        for (int i = 0; i < charStr.length/2; i++) {
            if (charStr[i] == charStr[charStr.length - 1 - i]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
