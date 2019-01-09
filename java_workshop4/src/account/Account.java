package account;

public class Account {
	
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return this.account = account;
	}
	public int getBalance() {
		return this.balance = balance;
	}
	
	public double calculateInterest() {
		return balance * interestRate;
	}
	public void deposit(int money) {
		this.setBalance(this.getBalance() + money);
	}
	public void withdraw(int money) {
		this.setBalance(this.getBalance() - money);
	}

	public void accountInfo() {
		System.out.println("계좌번호: " + this.account +
								  " 잔액: " + this.balance + "원" + 
								  " 이자율: " +this.interestRate + "%");
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
