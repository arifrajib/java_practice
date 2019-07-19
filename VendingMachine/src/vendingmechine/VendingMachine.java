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
		stockingMenu:
		while(true) {
			/**
			 * Show available Stocking menu
			 */
			System.out.println("Please Select from Stocking options");
			System.out.println("1). Press 1 for add CANDY");
			System.out.println("2). Press 2 for add SNACK");
			System.out.println("3). Press 3 for add NUTS");
			System.out.println("4). Press 4 for add Coke");
			System.out.println("5). Press 5 for add Pepsi");
			System.out.println("6). Press 6 for add Soda");
			System.out.println("........................");
			System.out.println("0). Press 0 for Return Main menu");
	
			/**
			 * take the decision based on menu choice
			 */
			switch(this.scanner.nextInt()){
				case 0:
					break stockingMenu;
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
			System.out.println("........................");
			System.out.println("0). Press 0 for Return Main menu");

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
