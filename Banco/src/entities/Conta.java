package entities;

public class Conta {
	private int nrConta;
	private String titular;
	private double saldo;
	
	public Conta(int nrConta, String titular) {
		this.nrConta = nrConta;
		this.titular = titular;
	}

	public Conta(int nrConta, String titular, double dpInicial) {
		this.nrConta = nrConta;
		this.titular = titular;
		deposito(dpInicial);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNrConta() {
		return nrConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		saldo -= quantia + 5.00;
	}

	public String toString() {
		return "Conta "
			   + nrConta
			   + ", titular: "
			   + titular
			   + ", saldo: R$ "
			   + String.format("%.2f", saldo);
	}
	
	
}
