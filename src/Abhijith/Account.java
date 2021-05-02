package Abhijith;

public class Account
{
	String name;
	int Id;
	int Balance;
	int Total=30000;
	
// Function for Debit
	public void Debit(int num1)
	{
		Total -= num1;
		Balance = Total;
		System.out.println("The updated Balance is:"+Balance);
	}

// Function for Credit
	public void Credit(int num2)
	{
		Total += num2;
		Balance = Total;
		System.out.println("The updated Balance is:"+Balance);
	}
	
// Function to Show Balance	
// Comment
	public void showBalance()
	{
		System.out.println("The Balance in your account is:"+Total);
	}
	
	public static void main(String[] args) 
	{
		Account acc = new Account();
		acc.Debit(5000);
		acc.Credit(15000);
		acc.showBalance();
	}
	
}
