package vendingmechine;

class CashBox {
	// main account balance
	private float accountBalance;
	
	/**
	 * set initial account balance 20$
	 */
	CashBox(){
		this.accountBalance = 20.00f;
	}
	
	/**
	 * return the account balance
	 * @return
	 */
	float getBalance() {
		return this.accountBalance;
	}
	
	

}
