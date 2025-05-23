public class TestCount {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Count("primo", 1, 15, 1));
        Thread th2 = new Thread(new Count("secondo", 1, 15, 1));
        Thread th3 = new Thread(new Count("terzzo", 1, 15, 1));
        Thread th4 = new Thread(new Count("quarto", 1, 15, 1));
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
