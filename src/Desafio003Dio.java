import java.util.Scanner;

public class Desafio003Dio {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Digite a linha: ");		
	int L = sc.nextInt();
	System.out.println("Digite a linha da coluna: ");
	int C = sc.nextInt();
				
				
					if (((++L+C)% 2 )==0)
					System.out.println("Voc� ter� uma casa branca!");
				else                                              
					System.out.println("Voc� ter� uma casa preta");
				sc.close();
			}
		}
//Linha come�ando o c�lculo com o valor 1 e somando ao C, dividindo o resultado por 2
//Se o resto for igual a 0, ter� uma casa branca, caso contr�rio ter� uma casa preta.
//Importante ressaltar que a coluna sempre come�a no valor 0 e a linha no valor 1
//N�o sei se � a melhor forma de se resolver, mas foi o melhor resultado que eu consegui obter.