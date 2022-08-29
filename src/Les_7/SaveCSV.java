package Les_7;
/*Реализовать сохранение данных в csv файл;
Реализовать загрузку данных из csv файла. Файл читается целиком.*/

import java.io.*;
import java.util.Arrays;

public class SaveCSV {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\a.ponomarev\\Documents\\AQA Java\\Проект\\src\\test\\target\\Wow.txt");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String currenLine = reader.readLine();
            System.out.println(currenLine);
        } catch (FileNotFoundException e) {
            System.out.println("Error 505");
        }
        bild_Of_String();
        readFile();
        read_To_Intermediate_Buffer();
    }

    public static void bild_Of_String() {
        try (FileWriter writer = new FileWriter(
                "C:\\Users\\a.ponomarev\\Documents\\AQA Java\\Проект\\src\\test\\target\\Wow.txt", false)
        ) {
            String entry = "Первая запись в проверочный файл. Добавиться или перезапишет?";
            writer.write(entry);
            writer.append('\n');
            writer.append('E');

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void readFile() {
        try (FileReader reader = new FileReader(
                "C:\\Users\\a.ponomarev\\Documents\\AQA Java\\Проект\\src\\test\\target\\Wow.txt")) {
            int a;
            while ((a = reader.read()) != -1) {
                System.out.println((char) a);
            }
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public static void read_To_Intermediate_Buffer() {
        try (FileReader reader = new FileReader(
                "C:\\Users\\a.ponomarev\\Documents\\AQA Java\\Проект\\src\\test\\target\\Wow.txt")) {
            char[] buf = new char[256];
            int a;
            while ((a = reader.read(buf)) > 0) {
                if (a < 256) {
                    buf = Arrays.copyOf(buf, a);
                }
                System.out.println(buf);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}