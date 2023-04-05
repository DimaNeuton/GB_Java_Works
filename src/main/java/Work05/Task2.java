package Work05;

// 2. Пусть дан список сотрудников:

//Иван Иванов
//Светлана Петрова
//Кристина Белова
//Анна Мусина
//Анна Крутова
//Иван Юрин
//Петр Лыков
//Павел Чернов
//Петр Чернышов
//Мария Федорова
//Марина Светлова
//Мария Савина
//Мария Рыкова
//Марина Лугова
//Анна Владимирова
//Иван Мечников
//Петр Петин
//Иван Ежов

//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности.

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> workers = Map.ofEntries(
                Map.entry("Иванов", "Иван"),
                Map.entry("Петрова", "Светлана"),
                Map.entry("Белова", "Кристина"),
                Map.entry("Мусина", "Анна"),
                Map.entry("Крутова", "Анна"),
                Map.entry("Юрин", "Иван"),
                Map.entry("Лыков", "Петр"),
                Map.entry("Чернов", "Павел"),
                Map.entry("Чернышов", "Петр"),
                Map.entry("Федорова", "Мария"),
                Map.entry("Светлова", "Марина"),
                Map.entry("Савина", "Мария"),
                Map.entry("Рыкова", "Мария"),
                Map.entry("Лугова", "Марина"),
                Map.entry("Владимирова", "Анна"),
                Map.entry("Мечников", "Иван"),
                Map.entry("Петин", "Петр"),
                Map.entry("Ежов", "Иван")
        );
        System.out.println(workers.values());
        Map<String, Integer> names = new HashMap<>();
        for (String workerName : workers.values()) {
            int nameCount = 0;
            for (int i = 0; i < workers.values().toArray().length; i++) {
                if (workers.values().toArray()[i].equals(workerName)) {
                    nameCount++;
                }
                if ((i == workers.values().toArray().length - 1) && (nameCount > 1)) {
                    names.put(workerName, nameCount);
                }
            }
        }
        System.out.println(names);
        names.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
