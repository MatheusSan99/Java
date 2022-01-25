
public class Vetorteste {

	public static void main(String[] args) {
	int [] vetor = {2,4,6,8,10,12};
	int count = 0;
	
	System.out.println("\nVetor:");
	while(count < vetor.length) {
		System.out.println(vetor[count] + " ");
		count++;
	}
	for (int i = (vetor.length -1); i >= 0; i--)
	System.out.println(vetor[i] + " ");
	
	}

}
