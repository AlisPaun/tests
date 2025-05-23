public class Count implements Runnable {
    String name;
    int min, max, incr;
    public Count(String name, int min, int max, int incr) {
        this.name = name;
        this.min = min;
        this.max = max;
        this.incr = incr;
    }
    public void run() {
        for (int i = min; i <= max; i += incr) {
            System.out.println(name + ": " + i);
        }
    }
}
