package Work04;

//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        application();
    }
    private static void application() {
        System.out.println("Это приложение предназначено для хранения информации, введенной с клавиатуры." +
                "\nВы можете:\n" +
                "\tВнести информацию в память\n" +
                "\tВывести информацию на экран с помощью команды print\n" +
                "\tУдалить последний ввод с помощью команды revert\n" +
                "\tЗывершить программу с помощью команды exit");
        Scanner in = new Scanner(System.in);
        List<String> textList = new LinkedList<>();
        boolean flag = true;
        while (flag) {
            System.out.print("Введите текст или команду: ");
            String input = in.next();
            if (input.isBlank()) {
                continue;
            } else {
                switch (input) {
                    case "exit":
                        System.out.println("Выход");
                        flag = false;
                        break;
                    case "print":
                        if (textList.isEmpty()) {
                            System.out.println("Данные отсутствуют");
                        } else {
                            Collections.reverse(textList);
                            System.out.println(textList);
                            Collections.reverse(textList);
                            continue;
                        }
                    case "revert":
                        if (textList.isEmpty()) {
                            System.out.println("Данные отсутствуют");
                        } else {
                            textList.remove(textList.size() - 1);
                        }
                        continue;
                    default:
                        textList.add(input);
                }
            }
        }
    }
}
