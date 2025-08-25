import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTest {
    public static void main(String[] args) throws IOException {
        // FileReader fr = new FileReader("abc.txt");
        // BufferedReader br = new BufferedReader(fr);
        // String i = br.readLine();

        // while(i != null) {
        //     System.out.println(i);
        //     i = br.readLine();
        // }

        // br.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = br.readLine();
        System.out.println("Hey " + name);
    }
}
