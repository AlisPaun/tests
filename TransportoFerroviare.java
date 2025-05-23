public abstract TransportoFerroviare extends MezoTerrestre {
	private String stazione;
	
	public TransportoFerroviare(String nome, String stazione) {
		super(nome);
		this.stazione = stazione;
		this.ruote = "Non va sulle ruote";
	}
	public String energia() {
		return "Magnetica o elletrica"
	}
	public String infrastructura() {
		return "Transporto sui binari";
	}
	public String mobilita() {
		return "Un viaggio molto piu siguro e meno ritardi";
	}
	public String comfort() {
		return "Meno traffico";
	}
}