import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;


import javax.swing.*;
import javax.imageio.event.*;




public class DontMess {
    final JPanel tablou;
    final JButton pushme;
    final JLabel backgroundLabel;

    public DontMess() {
        JFrame frame = new JFrame("Believe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tablou = new JPanel();
        tablou.setLayout(new BorderLayout());
        ImageIcon picture1 = new ImageIcon("success.jpg");
        ImageIcon picture2 = new ImageIcon("true.jpg");

        Choice days = new Choice();
        for (int i = 1; i <= 31; i++) {
            days.add(String.valueOf(i));
        }
        days.setLocation(15, 45);
        days.setSize(50, 50);
        tablou.add(days, BorderLayout.NORTH);

        Choice months = new Choice();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        months.setLocation(100, 45);
        months.setSize(70, 50);
        tablou.add(months, BorderLayout.NORTH);

        Choice year = new Choice();
        year.add("2023");
        year.add("2024");
        year.add("2025");
        year.add("2026");
        year.add("2027");
        year.add("2028");
        year.add("2029");
        year.add("2030");
        year.setLocation(150, 45);
        year.setSize(70, 50);
        tablou.add(year, BorderLayout.NORTH);


        frame.add(tablou);
        frame.pack();
        frame.setVisible(true);

        backgroundLabel = new JLabel(picture1);
        tablou.add(backgroundLabel, BorderLayout.CENTER);

        pushme = new JButton("Press me");
        pushme.addActionListener(DontMess) {
            public void actionPerformed(ActionEvent e) {
                if (backgroundLabel.getIcon() == picture1) {
                    backgroundLabel.setIcon(picture2);
                } else {
                    backgroundLabel.setIcon(picture1);
                }
            }
        });
        tablou.add(pushme, BorderLayout.SOUTH);

    //Set up the frame

        frame.add(tablou);
        frame.setTitle("Try me");
        frame.setSize(600, 750);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DontMess();
            }
        });
    }
}


