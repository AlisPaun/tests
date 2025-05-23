public class Libri {
	public static void main(String [] args) {
		Libreria greca = new ArteGreca();
		greca.lettere();
		greca.storia();
		
		Libreria latina = new ArteLatina();
		latina.lettere();
		latina.storia();
	}
}