public abstract class MezoNellaAtmosfera extends MezoTransportoPersone {
	private String sistemo_propulsione;
	
	public MezoNellaAtmosfera(String nome, String sistemo_propulsione) {
		super(nome);
		this.sistemo_propulsione = sistemo_propulsione;
	}
        @Override
	public String infrastructura() {
		return "Transporto nell'atmosfera";
	}

    public String getSistemo_propulsione() {
        return sistemo_propulsione;
    }

    public void setSistemo_propulsione(String sistemo_propulsione) {
        this.sistemo_propulsione = sistemo_propulsione;
    }
}