import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutManager {
    public static void main(String[] args) {
        Frame finestra = new Frame("Border Layout Manager");
        finestra.setLocation(100, 100);
        finestra.setLayout(new BorderLayout());
        finestra.add(new Button("North"), BorderLayout.NORTH);
        finestra.add(new Button("South"), BorderLayout.SOUTH);
        finestra.add(new Button("West"), BorderLayout.WEST);
        finestra.add(new Button("Center"), BorderLayout.CENTER);
        finestra.pack();
        finestra.setVisible(true);
    }
}
