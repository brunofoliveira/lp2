public class ContaBancaria2{
	int agencia, contaCorrente;
 	double saldo, limiteExtra;
	String titularConta;

	public void imprimirAgencia(){
		System.out.println("A agencia e': " + this.agencia);
	}

	public void imprimirContaCorrente(){
		System.out.println("A conta-corrente e': " + this.contaCorrente);
	}
	
	public void imprimirTitular(){
		System.out.println("O titular da conta e': " + this.titularConta);
	}

	public void imprimirSaldo(){
		System.out.println("Saldo: " + this.saldo);
	}

	public void imprimirSaldoTotal(){
		double soma= this.saldo + this.limiteExtra;
		System.out.println("Saldo com limite extra: " + soma);
	}
	
	public static void main (String [] args){
	
		ContaBancaria2 cb1 = new ContaBancaria2();
		cb1.agencia=3610;
		cb1.contaCorrente=15766;
		cb1.saldo=35.54;
		cb1.limiteExtra=50;

		ContaBancaria2 cb2 = new ContaBancaria2();
		cb2.titularConta="Bruno";
		cb2.agencia=0810;
		cb2.contaCorrente=6132;
		cb2.saldo=42.31;
		cb2.limiteExtra=75.00;
		
		cb2.imprimirTitular();
		cb2.imprimirAgencia();
		cb2.imprimirContaCorrente();
		cb2.imprimirSaldo();
		cb2.imprimirSaldoTotal();
	}
}
