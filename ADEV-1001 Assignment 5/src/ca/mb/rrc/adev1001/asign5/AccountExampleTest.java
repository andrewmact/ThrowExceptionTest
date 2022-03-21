package ca.mb.rrc.adev1001.asign5;

public class AccountExampleTest {

	public static void main(String[] args) {
		// Instance of Account Example
		AccountExample test = new AccountExample();
		/**
		 * Try adding an amount into an account
		 * Catch AccountException if account number is wrong
		 */
		try {
			test.addAmount(775, 12);
		}
		catch(AccountException e) {
			e.printStackTrace();
		}
		
		/**
		 * Try taken an amount from an account
		 * Catch AccountException if account number is wrong 
		 */
		try {
			test.deleteAmount(775, 12);
		}
		catch(AccountException e) {
			e.printStackTrace();
		}
		
		

	}

}
