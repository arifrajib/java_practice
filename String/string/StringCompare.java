package string;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringOne = "String";
		String stringTwo = new String("String");
		if(stringOne != stringTwo) {
			System.out.println("String litaral and object are not equal");
		}
		
		if(stringOne.equals(stringTwo)) {
			System.out.println("String.equals method compare with value not the reference");
		}
		
		stringTwo = stringTwo.intern();
		if(stringOne == stringTwo) {
			System.out.println("String intern save the string to the String pool");
		}		
	}

}
