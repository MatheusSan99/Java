import java.util.Scanner;
public class CarroObjetos {
	Scanner sc = new Scanner(System.in);
	
		String Cor;
		String Modelo;
		int Capacidade;
		double gasolina = (sc.nextDouble());
		CarroObjetos() {

		}
		
		CarroObjetos(String Cor, String Modelo, int Capacidade) {
			this.Cor = Cor;
			this.Modelo = Modelo;
			this.Capacidade = Capacidade;		
			
		}	
	
		void setCor(String Cor) {
			this.Cor = Cor;
		}
		
		String getCor() {
			return Cor;
		}
		
		void setModelo(String Modelo) {
			this.Modelo = Modelo;
		}
		
		String getModelo() {
			return Modelo;
		}
		
		void Capacidade(int Capacidade) {
			this.Capacidade = Capacidade;
		}
		
		int Capacidade() {
			return Capacidade;
		}
			
			double valortanque() {
			return Capacidade * gasolina;
			
		}
		
		
		
		
		
		
		
		
		
		
		

}
