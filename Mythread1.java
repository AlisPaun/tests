public class Mythread1 extends Thread {
    public void run() {
        int n;
        for(n = 0; n < 10; n++)
        System.out.println("L'indice n e uguale a : " + n);
    }
}