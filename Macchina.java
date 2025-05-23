public class Macchina {
	private String modello;
	private String colore;
	
	public Macchina(String param1, String param2) {
		colore = param1;
		modello = param2;
	}
	public Macchina() {
		colore = "Rosso";
		modello = "Ferrari F40";
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
}