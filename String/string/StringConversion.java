package string;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * String to integer conversion
		 */
		System.out.println("String to Integet conversion: "+Integer.parseInt("12345"));
		System.out.println("Integer to String conversion: "+Integer.toString(12345));
		
		
		/**
		 * String to float conversion
		 */
		System.out.println("String to Float conversion: "+Float.parseFloat("1234.567"));
		System.out.println("Float to String conversion: "+Float.toString(1234.567f));
		
		
		/**
		 * String to double conversion
		 */
		System.out.println("String to Double conversion: "+Double.parseDouble("54321.6789"));
		System.out.println("Double to String conversion: "+Double.toString(54321.6789d));
		
		
		/**
		 * String to long conversion
		 */
		System.out.println("String to Long conversion: "+Long.parseLong("9876543210"));
		System.out.println("Long to String conversion: "+Long.toString(9876543210l));
		
	}

}
