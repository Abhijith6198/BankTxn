package Abhijith;

import java.util.Scanner;

public class Account
{
	String name;
	int Id;
	//int Balance;
	int Total;
	int Limit;
	
	public Account(int thresholdBalance, int Idnum) {
		Total = 30000;
		System.out.println("The Balance in your Account Id"+" "+Idnum+" "+"is"+" "+Total);
		Limit = thresholdBalance;
	}
	
/*	public Account(int defaultBalance, int thresholdBalance, int Idnum) {
		System.out.println("The Balance in your Account Id"+" "+Idnum+" "+"is"+" "+defaultBalance);
		Total = defaultBalance;
		Limit = thresholdBalance;
	}
*/	
// Function for Debit
	public void debit(int num1)
	{
		//Balance = Total;
		if(num1 <= Total) {
			Total -= num1;
			System.out.println("The updated Balance in your account is:"+Total);
		}
		else {
			System.out.println("Insufficient Balance!");
		}
	}

// Function for Credit
	public void credit(int num2)
	{
		//Total += num2;
		if((Total+num2) <= Limit) {
			Total = Total + num2;
			System.out.println("The updated Balance in your account is:"+Total);
		}
		else {
			System.out.println("The credit limit is exceeded!");
			//Total -= num2;
		}
		
	}
	
// Function to Show Balance	
// Comment
	public void showBalance()
	{
		System.out.println("The Balance in your account is:"+Total);
	}
	
	public static void main(String[] args) 
	{
		Account acc  = new Account(100000,1234);
		//Account acc2 = new Account(50000,100000,12345);

		while(true) {
		System.out.println("Chose an operation");
		System.out.println("1. Credit");
		System.out.println("2. Debit");
		System.out.println("3. Balance");
		Scanner scannerObj= new Scanner(System.in);
		
		//Account acc = new Account(100000,1234);
		
		int test=scannerObj.nextInt();

		if(test==1) {
			System.out.println("Please enter the amount to be credited:");
			int creditAmount=scannerObj.nextInt();
			acc.credit(creditAmount);
			
		}
		else if(test==2) {
			System.out.println("Please enter the amount to be debited:");
			int debitAmount=scannerObj.nextInt();
			acc.debit(debitAmount);
		}
		else {
			acc.showBalance();
		}
	}
  }
}
	
