package pisareff.SimpleExamples.IO.Output.OutputStream;

import java.io.*;
import java.nio.file.Path;

public class EntryPoint {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources","output.txt").toFile();
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file,true))) {
            byte[] bytes = "Hello World!".getBytes();
            outputStream.write(bytes);
            //outputStream.write("\n".getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }

    private static void fileOutputStreamDemo() throws IOException {
        File file = Path.of("resources","output.txt").toFile();
        try (FileOutputStream outputStream = new FileOutputStream(file,true)) {
            byte[] bytes = "Hello World!".getBytes();
            outputStream.write(bytes);
        }
    }

}
