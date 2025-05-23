
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class FlowLayoutManager {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout (new FlowLayout());
        f.setLocation(100, 100);

        f.add (new Button("Month"));
        f.add (new Button("Year"));
        f.add (new Button("Age"));
        f.add (new Button("Sex"));
        f.add (new TextField("Write a text"));
        f.pack();
        f.setVisible(true);
    }
}