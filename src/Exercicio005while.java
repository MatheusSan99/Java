import java.util.Scanner;

public class Exercicio005while {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = 0;
	int tabuada = 0;
	
	
	System.out.println("Digite um número entre 1 e 10 para ver sua tabuada:");
	tabuada = scan.nextInt();
	do {
	System.out.println(tabuada + " X " + count +  " = " + count*tabuada);
	++count;
	
	}
	while (count < 11);
	
}
}
