
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class WriterProve {
    public static void main(String[] args) throws IOException {
        BufferedWriter documento = null;

        try {
            File paper = new File("paper.txt");
            FileWriter fpaper = new FileWriter(paper);
            documento = new BufferedWriter(fpaper);

            
            documento.write("Maria" + System.lineSeparator());
            documento.write("Luca" + System.lineSeparator());
            documento.write("Andiamo imparare qualche quotes: ");
            documento.write("'Be the change that you wish to see in the world' - Mahatma Gandhi");
            documento.write("'Let us be grateful to the people who make us happy; they are the charming gardeners who make our souls blossom' - Marcel Proust");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            documento.close();
        }

    }
}
