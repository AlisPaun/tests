public abstract class MezoTerrestre extends MezoTransportoPersone {
	private int rote;
	private boolean su_binario;
	public MezoTerrestre(String nome) {
		super(nome);
	}
        @Override
	public String infrastructura() {
		return "Transporto terestre";
	}

    public boolean isSu_binario() {
        return su_binario;
    }

    public void setSu_binario(boolean su_binario) {
        this.su_binario = su_binario;
    }

    public int getRote() {
        return rote;
    }

    public void setRote(int rote) {
        this.rote = rote;
    }

    @Override
    public abstract int passageri();

    @Override
    public abstract String mobilita();

    @Override
    public abstract String allimentazione();
	
}