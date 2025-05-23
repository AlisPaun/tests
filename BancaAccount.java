public class BancaAccount {
	private String nome = "Nene Mary";
	private String contoBancario = "100000000 Euro";
	private String parolaChiave = "@ap1459";
	private String parola = "";
	
	
	public BancaAccount(String nome, String contoBancario, String parola) {
		 this.nome = nome;
		 this.contoBancario = contoBancario;
		 this.parola = parola;
	}
	public BancaAccount(){
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContoBancario() {
		if (parolaChiave.equals(parola)) {
			return contoBancario;
		} else {
			return "Access denied";
		}
	}
	public void setContoBancario(String contoBancario) {
		this.contoBancario = contoBancario;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
}