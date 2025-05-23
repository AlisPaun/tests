
import java.awt.*;

public class GestisceEvento {
    public static void main(String[] args) {
        Button b = new Button("Press me");
        MyActionListener alistener = new MyActionListener();
        b.addActionListener(alistener);

        Frame f = new Frame("My Example");
        f.setLayout(new FlowLayout());
        f.setLocation(100, 100);
        f.add(b);
        f.pack();
        f.setVisible(true);
    }
}
