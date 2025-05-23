public class Data2 {
	private int giorno;
	private int mese;
	private int anno;
	
	public void setGiorno(int giorno) {
		if (giorno > 0 && giorno >= 31) {
			this.giorno = giorno;
		}
		else {
			System.out.println("Giorno non valido");
		}
	}
	public int getGiorno() {
		return giorno;
	}
	public void setMese(int mese) {
		if (mese > 0 && mese <= 12) {
			this.mese = mese;
		}
		else {
			System.out.println("Mese non valido");
		}
	}
	public int getMese() {
		return mese;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public int getAnno() {
		return anno;
	}
}