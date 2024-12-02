package pisareff.SimpleExamples.IO.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class EntryPoint {
    public static void main(String[] args) throws IOException {

    }

    private static void ReadGoingToTheRiverByteByByte() throws IOException {
        File file = Path.of("resources","GoingToTheRiver.txt").toFile();
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            int currentByteNumber = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1){
                bytes[currentByteNumber++] = currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);
            }
    }

    private static void ReadGoingToTheRiver() throws IOException {
        //File file = new File(String.join(File.separator,"resources","file.txt")); // File.separator - разделитель директорий основанный на запускающей системе, для решения данной проблемы есть метод у класса Path.of()
        File file = Path.of("resources","GoingToTheRiver.txt").toFile();
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = inputStream.readAllBytes();
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
    }

    public void BasicDemo() throws IOException {
        File file = new File("resources/file.txt");
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
    }
}
