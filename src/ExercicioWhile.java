import java.util.Scanner;

public class ExercicioWhile {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println();
	int nota = 0; {
		System.out.println("Digite um número entre 0 e 10: ");
		nota = scan.nextInt();
		
		
	}
	while(nota < 0 | nota >10) {
		System.out.println("Digite um valor válido:");
		nota = scan.nextInt();
	}
	}
}