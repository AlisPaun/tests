public class Auto extends TransportoStradale {
	private String sulle_rote;
	
	public Auto(String nome) {

		super(nome);
	}
	public String infrastructura() {

		return "Transporto sull sulle ruote";
	}
	public String mobilita() {

		return "Transporoto stradale";
	}
	public String sostenibilita() {

		return "Veicoli elletrici in favore dei vechi veicoli";
	}
	public String comforto() {

		return "Autonomia e diversita";
	}
}