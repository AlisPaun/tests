public class UsaCliente {
	public static void main(String [] args) {
		Cliente cliente1 = new Cliente("Maurizio", "Palermo", "0039378983456");
		System.out.println("Il nome del tuo cliente e: " + cliente1.getNome());
		System.out.println("Il suo indirizzio e: " + cliente1.getIndirizzio());
		System.out.println("Il suo numero di telefono e: " + cliente1.getNumeroTelefono());
	}
}