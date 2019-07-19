package vendingmechine;

import java.util.Scanner;

public class VendingMachine {
	
	private Scanner scanner;
	private StoreInventory inventory;
	private CashBox cash;
	
	public VendingMachine() {
		// create object for Inventory
		// initial inventory set in StoreInventory constructor
		this.inventory = new StoreInventory();
		
		// create object for cash
		// initial cash set in CashBox constructor
		this.cash = new CashBox();
		
		// scanner object
		this.scanner = new Scanner(System.in);
	}
	
	/**
	 * primary Options
	 */
	public void showMainMenu() {
		breakMainMenu:
		while(true) {
			/**
			 * show available menu
			 */
			System.out.println("Please Select from below options");
			System.out.println("1). Press 1 for inventory update");
			System.out.println("2). Press 2 for operational");
			System.out.println("........................");
			System.out.println("0). Press 0 for exit");
			
			/**
			 * take the decision based on menu choice
			 */
			switch(this.scanner.nextInt()){
				case 0:
					break breakMainMenu;
				case 1:
					this.showStockingMenu();
					break;
				case 2:
					this.showSalesManu();
				default: 
			}
		}
	}
	
	/**
	 * 
	 */
	private void showStockingMenu() {
		/**
		* Show available Stocking Options
		*/
		// add candy to inventory
		System.out.println("Current Candy Inventory "+this.inventory.getCandy());
		System.out.println("How many Candy you want to add?");
		int candy = (int) this.scanner.nextInt();
		this.inventory.stockCandy(candy);
		System.out.println("New Candy Inventory "+this.inventory.getCandy());
			
		// add Snacks to inventory
		System.out.println("Current Snacks Inventory "+this.inventory.getSnack());
		System.out.println("How many Snacks you want to add?");
		int snacks = (int) this.scanner.nextInt();
		this.inventory.stockSnack(snacks);
		System.out.println("New Snacks Inventory "+this.inventory.getSnack());

		// add Nuts to inventory
		System.out.println("Current Nuts Inventory "+this.inventory.getNuts());
		System.out.println("How many Nuts you want to add?");
		int nuts = (int) this.scanner.nextInt();
		this.inventory.stockNut(nuts);
		System.out.println("New Nuts Inventory "+this.inventory.getNuts());

		// add Coke to inventory
		System.out.println("Current Coke Inventory "+this.inventory.getCoke());
		System.out.println("How many Coke you want to add?");
		int coke = (int) this.scanner.nextInt();
		this.inventory.stockCoke(coke);
		System.out.println("New Coke Inventory "+this.inventory.getCoke());
			
		// add Pepsi to inventory
		System.out.println("Current Pepsi Inventory "+this.inventory.getPepsi());
		System.out.println("How many Pepsi you want to add?");
		int pepsi = (int) this.scanner.nextInt();
		this.inventory.stockPepsi(pepsi);
		System.out.println("New Pepsi Inventory "+this.inventory.getPepsi());

		// add Soda to inventory
		System.out.println("Current Soda Inventory "+this.inventory.getSoda());
		System.out.println("How many Soda you want to add?");
		int soda = (int) this.scanner.nextInt();
		this.inventory.stockSoda(soda);
		System.out.println("New Soda Inventory "+this.inventory.getSoda());
	}
	
	private void showSalesManu() {
		salesMenu:
		while(true) {
			/**
			 * Show available Sales menu
			 */
			System.out.println("Please Select from following options");
			System.out.println("1). Press 1 for buy CANDY(10c)");
			System.out.println("2). Press 2 for buy SNACK(50c)");
			System.out.println("3). Press 3 for buy NUTS(90c)");
			System.out.println("4). Press 4 for buy Coke(25c)");
			System.out.println("5). Press 5 for buy Pepsi(35c)");
			System.out.println("6). Press 6 for buy Soda(45c)");
			//System.out.println("9). Press 9 for pay");
			System.out.println("........................");
			System.out.println("0). Press 0 for pay");

			/**
			 * take the decision based on menu choice
			 */
			switch(this.scanner.nextInt()){
				case 0:
					break salesMenu;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				default: 
			}
		}
	}
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VendingMachine vm = new VendingMachine();
		vm.showMainMenu();
		System.out.println("Vending Machine is now going to shutdown....");
	}

}
