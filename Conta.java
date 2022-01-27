
public abstract class Conta implements InterfaceConta {
	
	
	private static final int AGENCIA = 1;
	public static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta() {
		
		this.agencia = Conta.AGENCIA;
		this.numero = SEQUENCIAL++;	
		
	}
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	@Override
	public void saque(double valor) {
		 saldo -= valor;
	}

	@Override
	public void deposito(double valor) {
		 saldo += valor;
		
	}

	@Override
	public void transferencia(double valor, Conta contaDestino) {
		this.saque(valor);
		contaDestino.deposito(valor);
		
	}
	protected void imprimirInfoComum() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
