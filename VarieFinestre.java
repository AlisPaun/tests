import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class VarieFinestre {
    public static void main(String[] args) {
        Choice mese = new Choice();
        mese.addItem("Gennaio");
        mese.addItem("Febbraio");
        mese.addItem("Marzo");
        mese.addItem("Aprile");
        mese.addItem("Maggio");
        mese.addItem("Giugno");
        mese.addItem("Luglio");
        mese.addItem("Agosto");
        mese.addItem("Settembre");
        mese.addItem("Ottobre");
        mese.addItem("Novembre");
        mese.addItem("Dicembre");
        mese.select("Gennaio");

        Choice anno = new Choice();
        anno.addItem("2023");
        anno.addItem("2024");
        anno.addItem("2025");
        anno.addItem("2026");
        anno.addItem("2027");
        anno.addItem("2028");
        anno.addItem("2029");
        anno.addItem("2030");
        anno.select("2023");

        TextArea scrivi = new TextArea(5, 20);
        TextField scrivere = new TextField("Write a text");

        Label esempio = new Label("My Calendar");

        Frame finestra = new Frame();
        finestra.setLayout(new GridLayout(2, 2));
        finestra.setLocation(100, 100);

        finestra.add(mese);
        finestra.add(anno);
        finestra.add(scrivi);
        finestra.add(esempio);
        finestra.add(scrivere);
        finestra.pack();
        finestra.setTitle("My Application");
        finestra.setVisible(true);

    }
}
