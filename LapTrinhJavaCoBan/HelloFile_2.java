package CodeJava1.LapTrinhJavaCoBan;
import java.io.*;
public class HelloFile_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("Hello.txt");
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader2 = new BufferedReader(inputStreamReader);
        String line = "";
        while((line = reader2.readLine()) != null){
            System.out.println(line);
        }
    }
}
