import java.io.FileReader;
import java.io.IOException;

public class Program95_ThrowsKeyword {

    public static void readFile() throws IOException {

        FileReader file = new FileReader("data.txt");

        System.out.println("File Opened Successfully");

        file.close();
    }

    public static void main(String[] args) {

        try {

            readFile();

        } catch (IOException e) {

            System.out.println("Exception : " + e.getMessage());

        }

    }
}