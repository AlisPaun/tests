public class TwoThreadsTest {
    public static void main(String[] args) {
        new SimpleThread("aa").start();
        new SimpleThread("bb").start();
        new SimpleThread("cc").start();
        new SimpleThread("dd").start();
        new SimpleThread("ee").start();
    }
}
