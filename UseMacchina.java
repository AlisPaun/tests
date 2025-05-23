public class UseMacchina {
	public static void main(String [] args) {
		
		Macchina mycar = new Macchina();
		Macchina mycar2 = new Macchina("Verde", "Fiat 500");
		
		System.out.println(mycar.getModello());
		System.out.println(mycar2.getColore());


	}
}