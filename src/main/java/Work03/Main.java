package Work03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. Заполнить список десятью случайными числами.
        // Отсортировать список методом sort() и вывести его на экран

        int size = 10;
        ArrayList<Integer> arr = new ArrayList<Integer>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr.add(random.nextInt(0, 100));
        }
        Collections.sort(arr);
        arr.sort(Comparator.naturalOrder());
//        System.out.println(arr);

        // 2. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторяениями.
        // Вывести название каждой планеты и количество его повторений в списке.
        // Удалить повторяющиеся элементы

        List<String> planetList = List.of("Earth", "Saturn", "Uran", "Venera", "Uran", "Venera", "Saturn",
                "Uran", "Venera", "Jupiter", "Venera", "Venera", "Uran", "Venera", "Earth", "Saturn", "Uran", "Mars");
        ArrayList<String> planetArr = new ArrayList<String>();
        for (int i = 0; i < planetList.size(); i++) {
            if (!(planetArr.contains(planetList.get(i)))) {
                int count = 0;
                for (int j = i; j < planetList.size(); j++) {
                    if (planetList.get(j).equals(planetList.get(i))) {
                        count++;
                    }
                }
                planetArr.add(planetList.get(i));
                System.out.println(planetList.get(i) + " - " + count);
            }
        }

        File planets = new File("src/main/resources/Files/planets.txt");
        if (!planets.isFile()) {
            throw new RuntimeException("Неверный файл");
        }
        try(PrintWriter pw = new PrintWriter(planets)) {
            pw.print(planetArr);
        } catch(IOException e) {
            e.printStackTrace();
        }


    }
}
