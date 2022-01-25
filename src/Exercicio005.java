import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int qnt = 0;

	System.out.println("Digite o número (1-10) que gostaria de ver a tabuada:");
	
	qnt = scan.nextInt();
	
	for (int num = 1; num <= 10; num = num+1)
	
	System.out.println(qnt + "x" + num + "=" + (qnt*num));

	}

}
