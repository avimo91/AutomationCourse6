import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Assignment4 {


    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Avi\\Downloads\\Players.csv";

        //Files.writeString(Paths.get(filePath), "Hello Avi");

        String Players = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(Players);
    }
}


