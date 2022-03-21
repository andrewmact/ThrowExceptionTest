package ca.mb.rrc.adev1001.asign5;

public class AccountException extends Exception{
	
	/*
	 * Constructor variables
	 */
	private int errorCode;
	private String message;
	/**
	 * Constructor
	 * @param message: 	 entered String equals message
	 * @param errorCode: entered integer equals error code
	 */
	AccountException(String message, int errorCode)
	{
		this.message = message;
		this.errorCode = errorCode;
	}
	/**
	 * Adjusted toString method to provide error code and error message
	 */
	@Override
	 public String toString(){
	  return " Error Code: "+getErrorCode()+" "+getMessage();
	 }
	 /**
	  * Get variable method
	  * @return entered Integer for errorCode 
	  */
	 public int getErrorCode() {
	  return errorCode;
	 }
	 /**
	  * Get variable method
	  * @return entered String for message 
	  */
	 public String getMessage() {
		 return message;
	 }
}
