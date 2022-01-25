import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite o número a ser fatorado: ");
	int fatorial = scan.nextInt();
	int multiplicador = 1;
	
	System.out.println(fatorial + "!");
	for (int count = fatorial; count >= 1; count--)
	
	
	
	multiplicador = multiplicador * count;

	

	System.out.println(multiplicador);
	}
}
