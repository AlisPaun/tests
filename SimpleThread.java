public class SimpleThread extends Thread {
    public SimpleThread(String name) {
        super(name);
    }
    public void run() {
        int n;
        for(n = 0; n < 10; n++) {
            System.out.println("" + getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
