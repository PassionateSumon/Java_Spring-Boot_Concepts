// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class DemoChallenge {
//     public static void main(String[] args) throws IOException {
//         FileWriter fw = new FileWriter("res.txt");
//         BufferedReader fr1 = new BufferedReader(new FileReader("file/abc.txt"));
//         BufferedReader fr2 = new BufferedReader(new FileReader("file/demo.txt"));

//         String res1 = fr1.readLine();
//         String res2 = fr2.readLine();

//         String resString = "";

//         while(res1 != null) {
//             resString += res1;
//             res1 = fr1.readLine();
//         }

//         while(res2 != null) {
//             resString += res2;
//             res2 = fr2.readLine();
//         }

//         fw.write(resString);
//         fw.close();
//         fr1.close();
//         fr2.close();
//     }
// }



import java.io.*;

public class DemoChallenge {
    public static void main(String[] args) throws IOException {
        try (
            FileWriter fw = new FileWriter("res.txt");
            BufferedReader fr1 = new BufferedReader(new FileReader("file/abc.txt"));
            BufferedReader fr2 = new BufferedReader(new FileReader("file/demo.txt"))
        ) {
            String line;
            StringBuilder resString = new StringBuilder();

            while ((line = fr1.readLine()) != null) {
                resString.append(line).append("\n");
            }

            while ((line = fr2.readLine()) != null) {
                resString.append(line).append("\n");
            }

            System.out.println(resString);

            fw.write(resString.toString());
        }
    }
}
