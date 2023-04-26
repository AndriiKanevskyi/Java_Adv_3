package HW_4_Package;

import java.io.*;

public class HW_4 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("MyTxtFile.txt"))){
            writer.write("Привіт, я файл");
            writer.flush();//не обязательно
        } catch (IOException e) {
            System.out.println(e);;
        }//.close() автоматом


        try (BufferedReader reader = new BufferedReader(new FileReader("MyTxtFile.txt"))){
            while (reader.ready()){
                System.out.println(reader.readLine());
            }

        }catch (IOException e){
            System.out.println(e);
        }//.close() автоматом
    }
}
