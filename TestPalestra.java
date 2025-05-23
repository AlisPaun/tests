public class TestPalestra {
	public static void main(String[] args) {
		ClientePalestra test = new ClientePalestra("Anna", "Favola", "NPNN1664SDGUFGNN", "11.12.2005", "Firenze", "mary.pavel@ymail.com", 85, 250, 1.75, 150);
		System.out.println(test.getNome() + " " + test.getCognome() + " " + test.getCodiceFiscale() + " " + test.getBirthday() + " " + test.getIndirizzo() + " " + test.getEmail());
	}
}