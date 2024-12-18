package pisareff.SimpleExamples.IO.Input.FileReader;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class EntryPoint {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "GoingToTheRiver.txt").toFile();
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
            String string = bufferedReader.lines()
                    .collect(Collectors.joining("\n"));
            //.forEach(System.out::println);
            System.out.println(string);
            bufferedReader.close();
        }
    }
}
