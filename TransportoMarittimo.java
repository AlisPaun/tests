public abstract class TransportoMarittimo extends MezoAquatico {
	private String sull_mare;
	
	public TransportoMarittimo(String nome, String sull_mare) {
		super(nome);
		this.sull_mare = sull_mare;
	}
	
	public String energia() {
		return "Sistemi di Propulsioni e energia eletrica";
	}
        @Override
	public String infrastructura() {
		return "Transporto sull mare";
	}
        @Override
	public String mobilita() {
		return "Transporoto con la Nave o Yacht";
	}
        @Override
	public String sostenibilita() {
		return "L'uso dei propulsioni ibridi e dei illuminazioni LED aiutano di riduree l'impacto sulla natura";
	}
        @Override
	public int passageri() {
		return 1000;
	}
        @Override
	public String comforto() {
		return "Transporto con Cabinete personali e restauranti";
	}
	public String getSull_mare() {
		return sull_mare;
	}
	public void setSull_mare(String sull_mare) {
		this.sull_mare = sull_mare;
	}
}