package account;

public class AccountTest2 {

	public static void main(String[] args) {
		Account[] account = new Account[5];
		
		for(int i = 0; i < account.length; i++) {
			account[i] = new Account("221-0101-211"+ (i+1),100000,4.5);
		}
		for(int i = 0; i < account.length; i++) {
			account[i].accountInfo();
		}
		System.out.println();
		for(int i = 0; i < account.length; i++) {
			account[i].setInterestRate(3.7);
			System.out.println("계좌번호: " + account[i].getAccount() +
					  " 잔액: " + account[i].getBalance() + "원" + 
					  " 이자율: " +account[i].getInterestRate()+ "%" +
					  " 이자: " + (int)(account[i].getBalance()*account[i].getInterestRate())/100 + "원");
		}
	}
}
