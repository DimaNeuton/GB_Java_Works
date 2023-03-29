package Work03;

// 3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Moscow");
        arr.add("515");
        arr.add("London");
        arr.add("312");
        arr.add("Paris");
        System.out.println(arr);

        removeInt(arr);
        System.out.println(arr);
    }

    private static void removeInt(ArrayList arr) {
        for (int i = 0; i < arr.size(); i++) {
            String element = (String) arr.get(i);
            int intItem = 0;
            try {
                intItem = Integer.parseInt(element);
                arr.remove(arr.get(i));
            } catch (NumberFormatException e) {
                continue;
            }
        }
    }
}
