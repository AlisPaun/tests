package polimorfismo;

public class Fattoria {
	public static void main(String [] args) {
		Animale leo = new Leone();
		leo.emettiVerso();
		
		Animale muu = new Mucca();
		muu.emettiVerso();
		
		Animale cav = new Cavallo();
		cav.emettiVerso();
	}
}