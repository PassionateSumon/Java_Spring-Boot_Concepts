import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc.txt");
        fw.write("Hello");
        fw.write('\n');
        char[] ch = new char[]{'S', 'u', 'm', 'o', 'n'};
        fw.write(ch);

        fw.close();
    }
}
