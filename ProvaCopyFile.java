
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ProvaCopyFile {
    
    public static void main(String[] args) throws IOException {
        File source = new File("important.jpg");
        File destination = new File("dream.jpg");
   
        InputStream inPut = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
        OutputStream outPut = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                
            }
        };
        try {
            inPut = new FileInputStream(source);
            outPut = new FileOutputStream(destination);
            byte[] buf = new byte[1024];
            int byteRead;
            while ((byteRead = inPut.read(buf)) > 0) {
            outPut.write(buf, 0, byteRead);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            inPut.close();
            outPut.close();
        }
    }
}
