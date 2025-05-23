public class TestEccezioni extends Divisione {
    public static void main(String[] args) {
        try {
            System.out.printl("Divisione.div(10, 0)");
        }catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}