package Work06;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков (ArrayList).
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
// Выводить только те ноутбуки, что соответствуют условию

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        NoteBook n1 = new NoteBook(100, "A1", "Asus", 2015);
        NoteBook n2 = new NoteBook(150, "S1", "Samsung", 2020);
        NoteBook n3 = new NoteBook(130, "L1", "Lenovo", 2017);
        NoteBook n4 = new NoteBook(200, "D1", "Dell", 2022);

        var notebooks = new HashSet<>(Arrays.asList(n1, n2, n3, n4));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите максимальную цену ноутбука: ");
        int maxPrice = in.nextInt();
        int count = 0;
        System.out.println("Ноутбуки подходящие по условию: ");
        for (NoteBook nb : notebooks) {
            if (nb.getPrice() <= maxPrice) {
                System.out.printf("цена: %d\t брэнд: %s\t модель: %s\t год выпуска: %d\n", nb.getPrice(), nb.getBrand(), nb.getModel(), nb.getYear());
                count++;
            }
        }
        if (count == 0) {
            System.out.print("Подходящие ноутбуки не найдены");

        }
    }
}
