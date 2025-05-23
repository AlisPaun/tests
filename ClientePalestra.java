public class ClientePalestra extends Anagrafica {
	private double peso;
	private double sommaPagata;
	private double altezza;
	private double abonamento;

	
	public double getPeso() {

		return peso;
	}
	public void setPeso(double peso) {

		this.peso = peso;
	}	
	public double getSommaPagata() {

		return sommaPagata;
	}
	public void setSommaPagata(double sommaPagata) {

		this.sommaPagata = sommaPagata;
	}
	public double getAltezza() {

		return altezza;
	}
	public void setAltezza(double altezza) {

		this.altezza = altezza;
	}	
	public double getAbonamento() {

		return abonamento;
	}
	public void setAbonamento(double abonamento) {

		this.abonamento = abonamento;
	}
	public ClientePalestra(String nome, String cognome, String codiceFiscale, String birthday, String indirizzo, String email, double peso, double sommaPagata, double altezza, double abonamento) {
		super(nome, cognome, codiceFiscale, birthday, indirizzo, email);
		this.peso = peso;
		this.sommaPagata = sommaPagata;
		this.altezza = altezza;
		this.abonamento = abonamento;
	}
	public ClientePalestra() {
	}
}