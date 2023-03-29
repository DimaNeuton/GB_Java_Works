// 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

package Work02;

import java.io.*;


public class Task2 {
    public static void main(String[] args) {
        String text = createStr();
        addToFile(text);
    }

    private static void addToFile(String text) {
        final String PATH = "src/main/resources/Files/TEST.txt";
        File myFile = new File(PATH);
        try {
            if (myFile.exists() && !myFile.isDirectory()) {
                PrintWriter fw = new PrintWriter(PATH);
                fw.print(text);
            } else {
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static String createStr() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append("TEST");
        }
        return str.toString();
    }
}

