
public class Main {

	public static void main(String[] args) {
		Banco b = new Banco();
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.sacar(300);
		
		b.addConta(poupanca);
		b.addConta(cc);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
