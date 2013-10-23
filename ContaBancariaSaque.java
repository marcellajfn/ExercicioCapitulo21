public class ContaBancariaSaque extends ContaBancaria{

	private double saque;
	
	public ContaBancariaSaque (String nome, String cpf, String rg, double saldo, double saque){
		super(nome,cpf,rg,saldo);
		this.setSaque(saque);	
	}

	
	
	public void SaldoEretirada(double saldo, double saque) {

		double saldoConta = saldo - saque;
		if ((saldoConta) <= 0) 
			System.out.println("Conta Negativa em" + saldoConta);
		
		if ((saldoConta) >= 0) 
			System.out.println("O saldo da conta é de" + saldoConta);
	}


	
	
}
