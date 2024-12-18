package pisareff.SimpleExamples.IO.Serialization;

import java.io.*;
import java.nio.file.Path;

public class EntryPoint {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("resources","serializedObjects","serializedObjectsPerson.out");
        //writeObject(path);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object object = objectInputStream.readObject();
            Person person = (Person) object;
            System.out.println(person);
        }

    }

    private static void writeObject(Path path) throws IOException {
        try (ObjectOutputStream objectOutputStream  = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person person = new Person("Alex",28);
            objectOutputStream.writeObject(person);
        }
    }
}
