import java.io.*;

public class HW_2 {
    public static void main(String[] args) {

        ;
    try(BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\andrii.kanevski\\Favorites\\test.txt"))) {
            br.write("Лишь за одной\n" +
                    "наблюдаю я в шумной стае\n" +
                    "пролетных уток…");
            br.flush();//не обязательно
        }
        catch (IOException e){
            System.out.println("EKCПШН ЗАПИСИ");
        }
    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\andrii.kanevski\\Favorites\\test.txt"))) {
        while (reader.ready()){
            String line = reader.readLine();
            System.out.println(line);
        }
    }
    catch (IOException e){
        System.out.println("EKCПШН ЧТЕНИЯ");
    }
    }
}
