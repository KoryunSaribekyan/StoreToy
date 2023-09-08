import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void writeToTextFile(Toy toy) {
        String fileName = "prize_toys.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("ID: " + toy.getId() + "\n");
            writer.write("Название: " + toy.getName() + "\n");
            writer.write("Частота выпадения: " + toy.getWeight() + "%\n");
            writer.newLine();
            System.out.println("Призовая игрушка успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл.");
            e.printStackTrace();
        }
    }
}
