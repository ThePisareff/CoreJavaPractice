package pisareff.SimpleExamples.IO.Output.Writer;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;

public class EntryPoint {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources","output.txt").toFile();
        try (Writer writer = new FileWriter(file,true)) {
            writer.append("Hello World");
        }
    }

    private static void bufferedWriterDemo() throws IOException {
        File file = Path.of("resources","output.txt").toFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
            writer.write("Hello World");
            writer.newLine();
        }
    }
}
