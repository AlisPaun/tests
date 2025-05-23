public class Anagrafica {
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String birthday;
	private String indirizzo;
	private String email;
	
	public Anagrafica(String nome, String cognome, String codiceFiscale, String birthday, String indirizzo, String email) {
		 this.nome = nome;
		 this.cognome = cognome;
		 this.codiceFiscale = codiceFiscale;
		 this.birthday = birthday;
		 this.indirizzo = indirizzo;
		 this.email = email;
	}
	public Anagrafica(){
		
	}
	
	public String getNome() {

		return nome;
	}
	public void setNome(String nome) {

		this.nome = nome;
	}
	public String getCognome() {

		return cognome;
	}
	public void setCognome(String cognome) {

		this.cognome = cognome;
	}
	public String getCodiceFiscale() {

		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {

		this.codiceFiscale = codiceFiscale;
	}
	public String getBirthday() {

		return birthday;
	}
	public void setBirthday(String birthday) {

		this.birthday = birthday;
	}
	public String getIndirizzo() {

		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getEmail() {

		return email;
	}
	public void setEmail(String email) {

		this.email = email;
	}
}