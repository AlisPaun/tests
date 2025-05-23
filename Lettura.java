import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class  Lettura {
    public static void main(String[] args) throws IOException {
        InputStream stdln = System.in;
        String inputLine;

        InputStreamReader in = new InputStreamReader(stdln);
        BufferedReader myReader = new BufferedReader(in);

        try {
            inputLine = new String(myReader.readLine());
        }
        catch(IOException e) {
            throw e;
        }
        System.out.println("Hai scritto " + inputLine);
    }


}
