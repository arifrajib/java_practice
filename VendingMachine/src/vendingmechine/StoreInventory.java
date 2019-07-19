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
	 */

	void stockCandy(int candy) {
		this.candy += candy;
	}
	
	/**
	 * 
	 * @return
	 */
	int getCandy() {
		return this.candy;
	}
	
	/**
	 * 
	 * @param candy
	 * @return
	 */
	float sellCandy(int candy) {
		if(this.candy < candy) {
			System.out.println("Not enough candy");
			return 0;
		}
		else {
			this.candy -= candy;
			return (float) this.candyPerUnit*candy;
		}
	}
	
	/**
	 * Stock snacks
	 * @param snack
	 */
	void stockSnack(int snack) {
		this.snack += snack;
	}
	
	/**
	 * 
	 * @return
	 */
	int getSnack() {
		return this.snack;
	}
	
	/**
	 * 
	 * @param snack
	 * @return
	 */
	float sellSnack(int snack) {
		if(this.snack < snack) {
			System.out.println("Not enough snack");
			return 0;
		}
		else {
			this.snack -= snack;
			return (float) this.snackPerUnit*snack;
		}
	}
	
	/**
	 * 
	 * @param nut
	 */
	void stockNut(int nut) {
		this.nuts += nut;
	}
	
	/**
	 * 
	 * @return
	 */
	int getNuts() {
		return this.nuts;
	}
	
	/**
	 * 
	 * @param nuts
	 * @return
	 */
	float sellNuts(int nuts) {
		if(this.nuts < nuts) {
			System.out.println("Not enough nuts");
			return 0;
		}
		else {
			this.nuts -= nuts;
			return (float) this.nutsPerUnit*nuts;
		}
	}
	
	/**
	 * 
	 * @param coke
	 */
	void stockCoke(int coke) {
		this.coke += coke;
	}
	
	/**
	 * 
	 * @return
	 */
	int getCoke() {
		return this.coke;
	}
	
	/**
	 * 
	 * @param coke
	 * @return
	 */
	float sellCoke(int coke) {
		if(this.coke < coke) {
			System.out.println("Not enough coke");
			return 0;
		}
		else {
			this.coke -= coke;
			return (float) this.cokePerUnit*coke;
		}
	}
	
	/**
	 * 
	 * @param pepsi
	 */
	void stockPepsi(int pepsi) {
		this.pepsi += pepsi;
	}
	
	/**
	 * 
	 * @return
	 */
	int getPepsi() {
		return this.pepsi;
	}
	
	/**
	 * 
	 * @param pepsi
	 * @return
	 */
	float sellPepsi(int pepsi) {
		if(this.pepsi < pepsi) {
			System.out.println("Not enough pepsi");
			return 0;
		}
		else {
			this.pepsi -= pepsi;
			return (float) this.pepsiPerUnit*pepsi;
		}
	}

	/**
	 * 
	 * @param soda
	 */
	void stockSoda(int soda) {
		this.soda += soda;
	} 
	
	/**
	 * 
	 * @return
	 */
	int getSoda() {
		return this.soda;
	}
	
	/**
	 * 
	 * @param soda
	 * @return
	 */
	float sellSoda(int soda) {
		if(this.soda < soda) {
			System.out.println("Not enough soda");
			return 0;
		}
		else {
			this.soda -= soda;
			return (float) this.sodaPerUnit*soda;
		}
	}

}
