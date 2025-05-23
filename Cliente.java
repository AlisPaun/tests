public class Cliente {
	private String nome;
	private String indirizzio;
	private String numeroTelefono;
	
	public Cliente(String nome, String indirizzio, String numeroTelefono){
		this.nome = nome;
		this.indirizzio = indirizzio;
		this.numeroTelefono = numeroTelefono;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIndirizzio() {
		return indirizzio;
	}
	public void setIndirizzio(String indirizzio) {
		this.indirizzio = indirizzio;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
}