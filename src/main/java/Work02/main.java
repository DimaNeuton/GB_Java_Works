package Work02;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.io.File;
import java.util.logging.Logger;

public class main {

    static Logger logger = Logger.getLogger("Ex5");
    public static void main(String[] args) {

//        Дано четное число N (>0) и символы c1 и c2
//        Написать метод, который вернет строку длины N, которая
//        состоит из чередующихся символов c1 и c2, начиная с c1
        System.out.println(strBuild('x', 'y', 6));

//        Напишите метод, который сжимает строку.
//        Пример: вход aaaabbbcdd.
        compressStr();

//        1. Напишите метод, который вернет содержимое текущей папки в виде
//        массва строк.
//        2. Напишите метод, который запишет массив, возвращенный предыдущим
//        методом в файл.
//        3. Обработайте ошибки с помощью try-catch конструкции. В случае
//        возникновения исключения оно должно записаться в лог-файл.
        ex5("D:\\GeekBrains\\1 четверть\\11. Знакомство и как " +
                "пользоваться базовым API\\Семинары\\GB_Java_Works");



    }

    private static void ex5(String pathDir) {
        String[] dirListNames;
        try {
            dirListNames = convertPathToNamesArr(pathDir);
        } catch (RuntimeException e) {
            logger.severe(e.getMessage());
            throw e; 
        }
        StringBuilder sb = new StringBuilder();
        for (String fileName : dirListNames) {
            sb.append(fileName).append(System.lineSeparator());
        }

        try(PrintWriter pw = new PrintWriter("src/main/resources/Files/lesson2.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            logger.severe(e.getMessage());
            throw new RuntimeException(e);
        }

//        PrintWriter pw = null;
//        try {
//            pw = new PrintWriter("src/main/resources/Files/lesson2.txt");
//            pw.print(sb);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            pw.close();
//        }


    }

    private static String[] convertPathToNamesArr(String path) {
        File dir = new File(path);
        if (!dir.isDirectory()) {
//            return new String[]{};
            throw new RuntimeException("Директория по заданному пути не найдена");
        }
        return dir.list();
    }

    private static void compressStr() {
        StringBuilder comprStr = new StringBuilder();
        String text = "aaaabbbcdd";

        int count = 1;
        for (int i = 1; i < text.length(); i++) {
            if (i == text.length() - 1) {
                if (count > 1) {
                    comprStr.append(count);
                    comprStr.append(text.charAt(i - 1));
                    count = 1;
                } else {
                    comprStr.append(text.charAt(i));
                }
            } else {
                if (text.charAt(i) == text.charAt(i - 1)) {
                    count++;
                } else {
                    if (count > 1) {
                        comprStr.append(count);
                        comprStr.append(text.charAt(i - 1));
                        count = 1;
                    } else {
                        comprStr.append(text.charAt(i - 1));
                    }
                }
            }

        }
        System.out.println(comprStr);
    }

    private static String strBuild(char c1, char c2, int size) {
        StringBuilder str = new StringBuilder("f");
        int i = 0;
        while (i < size) {
            if (i % 2 == 0) {
                str.append(c1);
            } else {
                str.append(c2);
            }
            i++;
        }
        return str.toString();
    }
}
