import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Serializare
 */
public class Serializare {
        public Serializare(String file, Object obj) throws IOException {
            FileOutputStream fileOut = null;
            ObjectOutputStream out = null;
    
            try {
                fileOut = new FileOutputStream(file);
                out = new ObjectOutputStream(fileOut);
                out.writeObject(obj);
    
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                out.close();
                fileOut.close();
            }
        }
        public static void main(String[] args) {
            List <String> lista = new ArrayList<String>();
                lista.add("Maria");
                lista.add("Luca");
                lista.add("Giovanni");
            Serialize("quotes.txt", lista);

            List <String> lista1 = (List<String>) Deserialize("quotes.txt");
            System.out.println(lista1);
        }
}
