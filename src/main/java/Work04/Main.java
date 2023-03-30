package Work04;

import java.util.*;

public class Main  {
    public static void main(String[] args) {
//        ex0();

        // Реализовать консольное приложение, которое:
        // 1. Принимает от польщователя строку вида text~num
        // 2. Нужно рассплититьстроку по ~, сохранить text в связный список на позицию num
        // 3. Если введено print~num, выводит строку из позиции num в связном списке
        // и удаляет ее из списка
        // 4. exit - завершение
        // 5. print~all - вывести весь список
        ex1();
    }

    private static void ex1() {
        Scanner in = new Scanner(System.in);
//        System.out.println("Введите текст: ");
//        String inputText = in.next();
        String inputText = "qwe~rty~uio";
        String[] textArr = inputText.split("\\~");
        List<String> textList = new LinkedList<>();
        Collections.addAll(textList, textArr);
        boolean flag = true;
        while (flag); {
            System.out.println(textList);
            System.out.print("Введите команду: ");
            String[] command = in.next().split("~");
            switch (command[0]) {
                case "exit":
                    flag = false;
                    System.out.println("Выход");
                    break;
                case "print":
                    if (command[1] == "all") {
                        System.out.println(textList);
                    } else {
                        int index = Integer.parseInt(command[1]);
                        System.out.println(textList.get(index - 1));
                        textList.remove(index);
                    }
                    break;
                case "text":
                    System.out.println("Введите новый элемент: ");
                    String addText = in.next();
                    int commandNumber = Integer.parseInt(command[1]);
                    textList.add(commandNumber, addText);
                default:
                    System.out.println("Непонятно что делать");

            }

        }

    }

    private static void ex0() {
        final int SIZE = 1_000_000;
        Random random = new Random();

        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(0, random.nextInt());
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));


        List<Integer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(0,random.nextInt());
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));
    }
}
