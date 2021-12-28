public class Main {

	public static void main(String[] args) {
		Cliente Saccha = new Cliente();
		Saccha.setNome("Saccharomyces");
		
		Conta cc = new ContaCorrente(Saccha);
		Conta poupanca = new ContaPoupanca(Saccha);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}


 
