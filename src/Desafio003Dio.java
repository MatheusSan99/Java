import java.util.Scanner;

public class Desafio003Dio {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Digite a linha: ");		
	int L = sc.nextInt();
	System.out.println("Digite a linha da coluna: ");
	int C = sc.nextInt();
				
				
					if (((++L+C)% 2 )==0)
					System.out.println("Você terá uma casa branca!");
				else                                              
					System.out.println("Você terá uma casa preta");
				sc.close();
			}
		}
//Linha começando o cálculo com o valor 1 e somando ao C, dividindo o resultado por 2
//Se o resto for igual a 0, terá uma casa branca, caso contrário terá uma casa preta.
//Importante ressaltar que a coluna sempre começa no valor 0 e a linha no valor 1
//Não sei se é a melhor forma de se resolver, mas foi o melhor resultado que eu consegui obter.