import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ProvaReader {
    public static void main(String[] args) throws IOException {
        Reader romance = new FileReader(args [0]);
        int c;
        while ((c = romance.read()) != -1) {
            System.out.print("Leggo " + (char) c);
        }
    }
}
