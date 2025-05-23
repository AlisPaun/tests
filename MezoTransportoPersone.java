public abstract class MezoTransportoPersone {
	private String nome;
	private String modello;
	protected int anno;
	
	public MezoTransportoPersone(String nome) {
		this.nome = nome;
	}

    public MezoTransportoPersone() {
    }
	public abstract String allimentazione();
	public abstract String infrastructura();
	public abstract String mobilita();
	public abstract String sostenibilita();
	public abstract int passageri();
	public abstract String comforto();
	
	public void presentazione() {
		System.out.println("La presentazione del veicolo: " + allimentazione() + ", " + infrastructura() + ", " + mobilita() + ", "
		 + sostenibilita() + ", " + passageri() + "e " + comforto());
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
}