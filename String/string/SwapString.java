package string;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * Swap two String without help of third variable
		 * 
		 * "First String"+"Second String"
		 */
		String one = "First String";
		String two = "Second String";
		System.out.println("One: |"+one+"| "+"Two: |"+two+"|");
		
		one = one.concat(two);
		two = one.substring(0, one.length()-two.length());
		one = one.substring(two.length());
		
		System.out.println("One: |"+one+"| "+"Two: |"+two+"|");

	}	

}
