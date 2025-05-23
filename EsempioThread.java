class EsempioThread implements Runnable {
    private int numeroThread;
    public EsempioThread(int n) {
        setNumeroThread(n);
    }
    public void setNumeroThread(int n) {
        numeroThread = n;
    }
    public int getNumeroThread() {
        return numeroThread;
    }

    public void run() {
        int n;
        for(n = 0; n < 10; n++) {
         System.out.println("*** thread numero " + getNumeroThread() + " in esecuzione ");
         System.out.println("l'indice n vale: " + n);
         try {
            Thread.sleep(1000);
         }
         catch (InterruptedException e) {
            System.out.println("Errore");
         }
        }
    }
}
