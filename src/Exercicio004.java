import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int qnt = 0;
	int count = 0;
	int npar = 0;
	int nimp = 0;
	int valor = 0;
	
	System.out.println("Digite a quantidade de valores a serem calculados:");
	qnt = scan.nextInt();
	do {
		System.out.println("Digite o " + count + "° valor:");
		valor = scan.nextInt();
		count = count + 1;
		if (valor % 2 == 0) npar++;
		else
			nimp++;

	
	} while (count < qnt);
System.out.println("Você tem:" + npar + " números pares.");
System.out.println("Você tem:" + nimp + " números impares.");
	
	}

}
