import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class GridLayoutManager {
    public static void main(String[] args) {
        Frame finestrina = new Frame("Grid Layout Manager");
        finestrina.setLocation(100, 100);
        finestrina.setLayout(new GridLayout(2, 2,20,20));

        finestrina.add(new Button("Button 1"));
        finestrina.add(new Button("Button 2"));
        finestrina.add(new Button("Button 3"));
        finestrina.add(new TextField("Write a text"));
        finestrina.pack();
        finestrina.setVisible(true);
    }
}