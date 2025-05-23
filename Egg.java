public class Egg {
	public Egg() {
		number = 5;
	}
	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
		{System.out.println(Integer.MAX_VALUE);
		System.out.println(0b11);
		System.out.println(017);
		System.out.println(0x1f);
		System.out.println(56);}
	}
	private int number = 3;
	{number = 4;}
}