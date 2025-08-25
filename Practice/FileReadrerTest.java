import java.io.FileReader;
import java.io.IOException;

public class FileReadrerTest {
    public static void main(String[] args) throws IOException  {
        FileReader fr = new FileReader("abc.txt");
        // int i = fr.read();
        // while(i != -1) {
        //     System.out.println((char)i);
        //     i = fr.read();
        // }

        char[] c = new char[100];
        int res = fr.read(c);
        System.out.println(c);
        System.out.println(res);

        fr.close();
    }
}
