import java.util.Scanner;
public class UseBancaAccount {
	public static void main(String [] args) {
				
		BancaAccount cliente = new BancaAccount("Nene Mary", "100000000 Euro", "@ap1459");
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Inscerite la parola: ");

		cliente.setParola(input.nextLine());
		
		System.out.println(cliente.getContoBancario());
	}
}