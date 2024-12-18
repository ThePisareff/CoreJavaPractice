package pisareff.SimpleExamples.IO.Input.File;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class EntryPoint {
    public static void main(String[] args) throws IOException {
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
