public class ImplementazioneNumThr {
    public static void main(String[] args) {
        EsempioThread thread1 = new EsempioThread(1);
        EsempioThread thread2 = new EsempioThread(2);
        EsempioThread thread3 = new EsempioThread(3);
        EsempioThread thread4 = new EsempioThread(4);

        Thread nuovoThread = new Thread(thread1);
        Thread nuovoThread2 = new Thread(thread2);
        Thread nuovoThread3 = new Thread(thread3);
        Thread nuovoThread4 = new Thread(thread4);

        nuovoThread.start();
        nuovoThread2.start();
        nuovoThread3.start();
        nuovoThread4.start();
    }
}
