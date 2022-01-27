import java.util.Scanner;

public class Prova3dio {

	
	public static void main(String[] args) {
		int X, Y;
		float preco = 0;
		
		Scanner input = new Scanner(System.in);
		X = input.nextInt(); //Codigo do Produto, Cachorro quente1, X-Salada2, etc...
		Y = input.nextInt(); //Quantidade de itens do produto
		if (X == 1) {
			preco  = (float) (4.00 * Y); //Cachorro quente, Preço R$4,00
		}else if (X == 2) {
			preco  = (float) (4.50 * Y);  //X-Salada, Preço R$4,50
		}else if (X == 3) {
			preco  = (float) (5.00 * Y    );  //X-Bacon, Preço R$5,00
		}else if (X == 4) {
			preco  = (float) ( 2.00 * Y    ); //Torrada Simples Preço R$2,00
		}else if (X == 5) {
			preco  = (float) ( 1.50 * Y   ); //Refrigerante, Preço R$1,50
		}
		
		System.out.printf("Total: R$ %.2f\n",preco);
	}
}