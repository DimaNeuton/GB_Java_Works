package Work05;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Создать структуру для хранения паспортов и Фамилий
        // сотрудников
        Map<String, String> structure = new HashMap<>();
        structure.put("111111", "Иванов");
        structure.put("222222", "Петров");
        structure.put("333333", "Сидоров");
        structure.put("444444", "Иванов");
        structure.put("555555", "Васильев");

//        for (String key : structure.keySet()) {
//            System.out.println(key + " - " + structure.get(key));
//        }

        for (Map.Entry<String, String> entry : structure.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Наисать метод, который переведет число из римского формата записи
        // в арабский

    }
}
