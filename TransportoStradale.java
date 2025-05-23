public abstract class TransportoStradale extends MezoTerrestre {
	private String autonomia;
	
	public TransportoStradale(String nome, String autonomia) {
		super(nome);
		this.autonomia = autonomia;
	}

        @Override
	public String infrastructura() {
		return "Traffico terestre";
	}
        @Override
	public String mobilita() {
		return "Stradale o feriviale";
	}
        @Override
	public String sostenibilita() {
		return "Allimentazione elletrica";
	}
        @Override
	public int passageri() {
		return 4;
	}
        @Override
	public String comforto() {
		return "Privacy";
	}

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }
}