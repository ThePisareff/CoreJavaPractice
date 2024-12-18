package pisareff.SimpleExamples.IO.Output.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Класс Files компиляция всех остальных IO классов, следует использовать его
 */
public class EntryPoint {
    public static void main(String[] args) throws IOException {
       BufferedReader writer  = Files.newBufferedReader(Path.of("resources","GoingToTheRiver.txt"));
       writer.lines().forEach(System.out::println);
    }
}
