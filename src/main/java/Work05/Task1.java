package Work05;

// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("11-11-11", "Иван Иванов");
        phoneBook.put("22-22-22", "Петр Петров");
        phoneBook.put("33-33-33", "Сергей Сегеев");
        phoneBook.put("44-44-55", "Иван Иванов");
    }
}
