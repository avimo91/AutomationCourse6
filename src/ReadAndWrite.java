import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadAndWrite {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Avi\\Desktop\\1.txt";

        Files.writeString(Paths.get(filePath), "Hello Avi");

        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(content);
    }
}
