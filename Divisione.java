public class Divisione {
    static int div(int a, int b) throws ArithmeticException {
        if(b==0) throw new ArithmeticException("Impossibile effettuare la divisione per zero");
        return a / b;
    }
}
