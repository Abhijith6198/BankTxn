package Abhijith;

import java.util.Scanner;

public class Account
{
	public String Name;
	int Id, Limit, Total, n2;
	
	public Account(String name, int Idnum) {
		Name = name;
		Total = 30000;
		System.out.println("The Balance in your Account Id"+" "+Name+" "+"is"+" "+Total);
		Limit = 100000;
	}
		
// Function for Debit
	public Boolean debit(int num1)
	{
		if(num1 <= Total) {
			Total -= num1;
			System.out.println("The updated Balance in your account is:"+Total);
			//return true;
			return true;
		}
		else {
			System.out.println("Insufficient Balance!");
			return false;
		}
	}
	
	public Boolean debitConf(int n2) {
		if(n2 <= Total) {
			return true;
		}
		else {
			return false;
		}
	}

// Function for Credit
	public void credit(int num2)
	{
		if((Total+num2) <= Limit) {
			Total = Total + num2;
			System.out.println("The credited Balance in your account is:"+Total);
		}
		else {
			System.out.println("The credit limit is exceeded!");
		}
		
	}
		
// Function to Show Balance	
	public void showBalance()
	{
		System.out.println("The Balance in your account is:"+Total);
	}
	
	public static void main(String[] args) 
	{
		int accCnt=0;

		Account[] accountArray;
		accountArray = new Account[10];
		Scanner scannerObj1= new Scanner(System.in);
		
		while(true) {
		System.out.println("Chose an operation");
		System.out.println("1. Credit");
		System.out.println("2. Debit");
		System.out.println("3. Create Acoount");
		System.out.println("4. Fund Transfer");
		System.out.println("5. Balance");
						
		int test=scannerObj1.nextInt();
		String name, name1, name2;
		int y,z,n1 = 0;
		switch(test){
		case 1:
			
			System.out.println("Please enter the name");
			name = scannerObj1.next();
			for(int i=0; i<accCnt; i++) {
				if(accountArray[i].Name.equals(name)) {
					System.out.println("Please enter the amount to be credited:");
					int creditAmount=scannerObj1.nextInt();
					accountArray[i].credit(creditAmount);
					break;
				}
			}
			break;
			
		case 2:
			
			System.out.println("Please enter the name");
			name = scannerObj1.next();
			for(int i=0; i<accCnt; i++) {
				if(accountArray[i].Name.equals(name)) {
					System.out.println("Please enter the amount to be debited:");
					int debitAmount=scannerObj1.nextInt();
					accountArray[i].debit(debitAmount);
					break;
				}
			}
			break;
			
		case 3:
			
			System.out.println("Please enter the name");
			name = scannerObj1.next();
			accountArray[accCnt]  = new Account(name,accCnt);
			accCnt++; 
			break;
		
		case 4:
			
			if(accCnt>=2)
			{
				System.out.println("Please enter the From account name-");
				name1 = scannerObj1.next();
				System.out.println("Please enter the To account name-");
				name2 = scannerObj1.next();
				
				for(int i=0; i<accCnt; i++) {
					if(accountArray[i].Name.equals(name1)) {
						System.out.println("Please enter the amount to be debited:");
						y=scannerObj1.nextInt();
						accountArray[i].debit(y);
						n1 = y;
					}
				}
				for(int i=0; i<accCnt; i++) {    
					if(accountArray[i].Name.equals(name2)) {
						z = n1;
						if(accountArray[i].debitConf(z)) {
							accountArray[i].credit(z);
							break;
						}
					}
				}
			}

			else {
				System.out.println("There are not enough accounts for this operation!");
			}
			break;
			
		default:
		
			System.out.println("Please enter the name");
			name = scannerObj1.next();
			for(int i=0; i<accCnt; i++) {
				if(accountArray[i].Name.equals(name)) {
					accountArray[i].showBalance();
					break;
				}
			}
			break;
		}
		}
	}
  }

	
