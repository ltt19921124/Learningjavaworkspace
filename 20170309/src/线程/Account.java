package Ïß³Ì;

public class Account {
	
	private String accountNo;
	private double balance;
	
	public Account(){
		
	}
	public Account(String accountNo,double balance){
		this.accountNo = accountNo;
		this.balance = balance;
		for (int i = 0; i < 10; i++){
			System.out.println(i);
		}
	}
	
}
