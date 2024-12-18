package pisareff.SimpleExamples.IO.Input.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class EntryPoint {
    public static void main(String[] args) throws IOException {
        fileInputStreamDemoByteByByte();
    }

    public static void fileInputStreamDemoByteByByte() throws IOException {
        File file = Path.of("resources", "GoingToTheRiver.txt").toFile();
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            int currentByteNumber = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1) {
                bytes[currentByteNumber++] = currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
    }

    public static void fileInputStreamDemo() throws IOException {
        //File file = new File(String.join(File.separator,"resources","file.txt")); // File.separator - разделитель директорий основанный на запускающей системе, для решения данной проблемы есть метод у класса Path.of()
        File file = Path.of("resources", "GoingToTheRiver.txt").toFile(); // класс Path позволяет удобно работать с путями к ресурсам. Так же он имеет метод toFile() который возвращает файл
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = inputStream.readAllBytes();
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
    }

}
