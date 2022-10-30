package odev.hafta6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\main\\java\\odev\\hafta6\\demo.pdf");
        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
