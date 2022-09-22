package entities;

public class Banco {

	private int number;
	private String name;
	private double saldo;

	private final double taxa = 5.00;
	
	public Banco(int number, String name, double depositoInicial) {
		
		this.number = number;
		this.name = name;
		deposit(depositoInicial);
	}

	public Banco(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposit(double value) {
		this.saldo += value;
	}

	public void withdraw(double value) {
		this.saldo -= value + taxa;
	}

	public String toString() {
		return "Account " 
				+ getNumber() 
				+ ", Holder: " 
				+ getName() 
				+ ", Balance: $ " 
				+ String.format("%.2f",getSaldo());
	}

}
