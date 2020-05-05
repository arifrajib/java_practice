package string;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder();

		///// initial Capacity
		System.out.println("String Builder Capacity "+str.capacity()+" and length: "+str.length());
		
		/////// append 
		str.append("mutable ").append("sequence ").append("of characters");
		str.insert(0, "A ");
		System.out.println("String Builder new Capacity "+str.capacity()+" and length: "+str.length());
		
		///// Print the String 
		System.out.println(str);
		
		///// Delete some 
		System.out.println("Delete First 10 Character {"+str.delete(0, 10)+"}");
		System.out.println(str);
		
		//// Substring
		System.out.println("SubString {"+str.substring(8)+"}");
		System.out.println(str);
		
		//// Reverse
		str.reverse();
		System.out.println(str);

	}
	
}
