
public class ContaBancariaDeposito extends ContaBancaria{
	
	private double deposito;
	
	public ContaBancariaDeposito (String nome, String cpf, String rg, double saldo, double deposito){
		super(nome,rg, cpf,saldo);
		this.setDeposito(deposito);
		
	}
	
	public double SaldoEdeposito(double saldo, double deposito) {
		double saldoConta;
		saldoConta= saldo + deposito;	
		return saldoConta;
	
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
}
