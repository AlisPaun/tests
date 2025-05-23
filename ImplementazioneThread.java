public class ImplementazioneThread {
    public static void main(String[] args) {
//        Mythread1 nuovoThread = new Mythread1();
//        Mythread1 nuovoThread2 = new Mythread1();
//        nuovoThread.start();
//        nuovoThread2.start();
        Mythread2 nuovoThread = new Mythread2("Primo");
        Mythread2 nuovoThread2 = new Mythread2("Secondo");
        nuovoThread.start();
        nuovoThread2.start();
    }
}
