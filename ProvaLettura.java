
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class ProvaLettura {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = null;

       try {
        File quotes = new File("quotes.txt");
        FileReader fquotes = new FileReader(quotes);
        reader = new BufferedReader(fquotes);

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
       }
       catch (Exception e) {
        e.printStackTrace();
       }
       finally {
        if (reader != null) {
            reader.close();
        }
       }
    }     
}
