import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class MyApplication {
    public static void main(String[] args) {
        Frame f = new Frame("La mia prima finestra");
        f.setLayout (new FlowLayout());
        f.setLocation(100, 100);

        f.add (new Button("Meze 1"));
        f.add (new Button("Botton 2"));
        f.add (new Button("Botton 3"));
        f.add (new TextField("Write a text here"));
        f.pack();
        f.setVisible(true);
    }
}