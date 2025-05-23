import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class TestPanel {
    public static void main(String[] args) {

        java.awt.Panel p = new java.awt.Panel();
        p.setLayout(new GridLayout(2, 2));

        p.add(new TextField("Text 1"));
        p.add(new TextField("Text 2"));
        p.add(new TextField("Text 3"));

        Frame finestra = new Frame();
        finestra.setLayout(new BorderLayout());
        finestra.setLocation(100, 100);

        finestra.add ("North", new Button("North"));
        finestra.add ("West", new Button("Center"));
        finestra.add ("South", new Button("South"));
        finestra.add ("Center", p);
        finestra.pack();
        finestra.setTitle("My Application");
        finestra.setVisible(true);
    }
}
