package Abhijith;

import java.util.Scanner;

public class Account
{
	public String Name;
	int Id;
	//int Balance;
	int Total;
	int Limit;
	
	public Account(String name, int Idnum) {
		Name = name;
		Total = 30000;
		System.out.println("The Balance in your Account Id"+" "+Name+" "+"is"+" "+Total);
		Limit = 100000;
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
	
//	public void fundTransferDebit(int N1) {
//		
//	}
	
	
	
	
// Function to Show Balance	
// Comment
	public void showBalance()
	{
		System.out.println("The Balance in your account is:"+Total);
	}
	
	public static void main(String[] args) 
	{
		int accCnt=0;
		//Account acc  = new Account(100000,1234);
		//Account acc2 = new Account(50000,100000,12345);

		Account[] accountArray;
		accountArray = new Account[10];
		Scanner scannerObj1= new Scanner(System.in);
		//Account acc = new Account();
		while(true) {
		System.out.println("Chose an operation");
		System.out.println("1. Credit");
		System.out.println("2. Debit");
		System.out.println("3. Create Acoount");
		System.out.println("4. Fund Transfer");
		System.out.println("5. Balance");
						
		int test=scannerObj1.nextInt();
		String name, name1, name2, n1, n2, x;
		int y,z;
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
						break;
					}
				}
				
				for(int i=0; i<accCnt; i++) {
					if(accountArray[i].Name.equals(name2)) {
						System.out.println("Please enter the amount to be credited:");
						z=scannerObj1.nextInt();
						accountArray[i].credit(z);
						break;
					}
				}
				
				
				
				//while(!name.equals(name1)) {
//				System.out.println("Press c for credit and d for debit");
//					for(int i=0; i<accCnt; i++) {
//						x = scannerObj1.next();
//						if(x.equals("CRE")) {
//							System.out.println("Enter the amount to be credited:");
//							y = scannerObj1.nextInt();
//							accountArray[i].credit(y);
//							break;
//						}
//					}
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
					//System.out.println("Please enter the amount to be credited:");
					//int creditAmount=scannerObj1.nextInt();
					accountArray[i].showBalance();
					break;
				}
			}
			break;
		}
		}
	}
  }

	
