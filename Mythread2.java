public class Mythread2 extends Thread {
    public Mythread2(String name) {
        super(name);
    }
    public void run() {
        int n;
        for(n = 0; n < 10; n++) {
            try {
                sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("L'indice n e uguale a : " + n + " " + getName());
        }
    }
}
