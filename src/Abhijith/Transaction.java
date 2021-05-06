package Abhijith;

public class Transaction 
{
	int txnId, txnAmount;
	Account fromAccount, toAccount;
	
	public Transaction(Account fromAcc, Account toAcc,int txnAmt)
	{
		fromAccount = fromAcc;
		toAccount = toAcc;
		txnAmount = txnAmt;
	}
	
	public void performTxn()
	{
		fromAccount.debit(txnAmount);
		toAccount.credit(txnAmount);
	}
	
	public Boolean validateTxn()
	{
		if((txnAmount <= fromAccount.Total) && ((txnAmount+toAccount.Total) <= toAccount.Limit))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
