package ca.mb.rrc.adev1001.asign5;

public class AccountExample {
	/**
	 * Account Number
	 * Error code variables for add or delete error
	 */
	final int ACCOUNT_NO = 777;
	final int ADD_ACCT_ERR = -10;
	final int DEL_ACCT_ERR = -20;
	
	/**
	 * Add Amount Function
	 * used to add money into the account
	 * Catches AccountException if occurs
	 * @param acctNo used to compare with ACCOUNT_NO
	 * @param amt The amount to be entered into the account
	 * @return amt
	 * @throws AccountException if account number does not match AccountException is throw
	 */
	public int addAmount(int acctNo, int amt) throws AccountException
	{
		if(acctNo != ACCOUNT_NO) {
			throw new AccountException("Invalid account number", ADD_ACCT_ERR);
		}
		else {
			return amt;
		}	
		
	}
	/**
	 * Delete Amount Function
	 * used to delete money from the account
	 * Catches AccountException if occurs
	 * @param acctNo used to compare with ACCOUNT_NO
	 * @param amt The amount to be taken out of the account
	 * @return amt
	 * @throws AccountException if account number does not match AccountException is throw
	 */
	public int deleteAmount(int acctNo, int amt) throws AccountException
	{
		if(acctNo != ACCOUNT_NO) {
			throw new AccountException("Invalid account number", DEL_ACCT_ERR);
		}
		else {
			return amt;
		}	
	}
	
	
	
	
	
}
