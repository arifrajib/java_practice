package vendingmechine;

class StoreInventory {
	// inventory
	private int candy, snack, nuts, coke, pepsi, soda;
	
	// price per unit
	private float candyPerUnit, snackPerUnit, nutsPerUnit, cokePerUnit, pepsiPerUnit, sodaPerUnit;
	
	/**
	 * Constructor 
	 */
	StoreInventory() {
		// set initial inventory
		this.candy = 10;
		this.snack = 10;
		this.nuts = 10;
		this.coke = 10;
		this.pepsi = 10;
		this.soda =10;
		
		// set peice per unit
		//CANDY(10), SNACK(50), NUTS(90), Coke(25), Pepsi(35), Soda(45)
		this.candyPerUnit = 0.10f;
		this.snackPerUnit = 0.50f;
		this.nutsPerUnit = 0.90f;
		this.cokePerUnit = 0.25f;
		this.pepsiPerUnit = 0.35f;
		this.sodaPerUnit = 0.45f;
	}
	
	/**
	 * Stock Candy
	 * @param candy
	 * @return
	 */
	int stockCandy(int candy) {
		return this.candy += candy;
	}
	
	/**
	 * 
	 * @return
	 */
	int getCandyStock() {
		return this.candy;
	}
	
	/**
	 * Stock snacks
	 * @param snack
	 * @return
	 */
	int stockSnack(int snack) {
		return this.snack += snack;
	}

}
