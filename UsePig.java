public class UsePig {
    public static void main(String[] args) {
        Pig myPig = new Pig() {
            public void animalSound() {
                System.out.println("MIAU");
            }
        };
        myPig.animalSound();
        myPig.sleep();
    }
}