import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int cont = 0;
	int nota = 0;
	int maior = 0;
	int media = 0;
	do {
		
		System.out.println("Digite a " + cont + "° nota: ");
		nota = scan.nextInt();
		media = media+nota;
		
		if (nota > maior) maior = nota;
		
		cont = cont + 1;
		
	} while(cont < 5);

	System.out.println("A maior nota foi: " + maior);
	System.out.println("A média dos números é:" + (media/cont));
	
}
}
