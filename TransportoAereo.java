public TransportoAereo extends MezoNellaAtmosfera {
	private String equipaggio;
	private String sigurezza;
	private String controloDocumenti;
	
	public TransportoAtmosferico(String nome) {
		super(nome);
		equipaggio = "2 Piloti piu 5 attendents"
	}
	public String infrastructura() {
		return "Transporto nationale o internationale";
	}
	public String mobilita() {
		return "Con AIrbus";
	}
	public String sostenibilita() {
		return "L'obiectivo è di utilisare i biocarburanti";
	}
	public int passageri() {
		return 100;
	}
	public String comforto() {
		return "Velocita e cibo";
	}
}