package Les_7;
/*Реализовать сохранение данных в csv файл;
Реализовать загрузку данных из csv файла. Файл читается целиком.*/

import java.io.*;

public class SaveCSV {
    public static void main(String[] args) throws Exception {
//            try {
//                File file = new File("C:\\Users\\a.ponomarev\\Documents\\AQA Java\\Проект\\src\\test\\target\\Wow.txt");
//                InputStream inputStream =new FileInputStream(file);
//                byte[] arr = inputStream.readAllBytes();
//                System.out.println(Arrays.toString(arr));
//            }catch (Exception ex){
//                System.out.println(Arrays.toString(ex.getStackTrace()));
//            }finally {
//                System.out.println("Inaff");
//            }
        File file = new File("C:\\Users\\a.ponomarev\\Documents\\AQA Java\\Проект\\src\\test\\target\\Wow.txt");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String currenLine = reader.readLine();
            System.out.println(currenLine);
        } catch (FileNotFoundException e) {
            System.out.println("Error 505");
        }
    }
}