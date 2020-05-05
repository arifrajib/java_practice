package string;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///// Character At
		//charAt();
		
		//// Compare to
		//compareTo();
		
		//// Contains
		//contains();
		
		///// endswith 
		//endsWith();
		
		///// Equals
		//equal();
		
		///// Index of 
		//indexOf();
		
		///// blank or empty
		//blankOrEmpty();
		
		///// Repeat
		//repeat();
		
		///// Replace 
		//replace();
		
		///// Split
		//split();
		
		//Sub String 
		subString();

	}
	
	
	/**
	 * CharacterAt
	 */
	private static void charAt() {
		
		String str = "Returns the char value at the specified index.";
		
		System.out.println("Printing the String using charAt");
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println("\nReverse printing the String using charAt");
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}
	
	/**
	 * String Compare using compareTo
	 */
	private static void compareTo() {
		
		String one = "Vue is bigger";
		String two = "Two";
		
		int outcome = one.compareTo(two);
		System.out.println("Compare Value "+outcome);
		
		if(outcome < 0) {
			System.out.println("First string is smaller");
		}
		else if (outcome == 0) {
			System.out.println("Strings are equla");
		}
		else if(outcome > 0) {
			System.out.println("First String is bigger");
		}
	}
	
	/**
	 * substring contains in String
	 */
	private static void contains () {
		String str = "Returns true if and only if this string contains the specified sequence of char values.";
		String subStr = "sequence";
		//String subStr = "not found";
		
		if(str.contains(subStr)) {
			System.out.println("Found at "+str.indexOf(subStr));
		}
		else {
			System.out.println("Not Found");
		}
	}
	
	/**
	 * Sub String ends with
	 */
	private static void endsWith() {
		String str = "Returns true if and only if this string contains the specified sequence of char values.";
		String subStr = "values.";
		
		if(str.endsWith(subStr)) {
			System.out.println("String ends with "+subStr);
		}
		else {
			System.out.println("Ends with not match");
		}
	}
	
	/**
	 * Equal 
	 */
	private static void equal() {
		String strOne = "String Value";
		String strTwo = "String value";
		
		if (strOne.equals(strTwo)) {
			System.out.println("Strings are Equals");
		}
		else {
			System.out.println("String are not Equals");
		}
		
		
		if(strOne.equalsIgnoreCase(strTwo)) {
			System.out.println("Two Strings are equal on ignore case");
		}
		else {
			System.out.println("Two Strings are not equal at all");
		}
	}
	
	
	/**
	 *  Index of
	 */
	private static void indexOf() {
		String str = "Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.";
		String subStr = "index";
		
		int index = str.indexOf(subStr);
		System.out.println("Found at "+index);
		
		index = str.lastIndexOf(subStr);
		System.out.println("Found from last "+index);
		
		index = str.indexOf("not found");
		System.out.println("If substring is not found "+index);
	}
	
	/**
	 * Test Blank or empty
	 */
	private static void blankOrEmpty() {
		
		String nullVal = null;
		String blank = "    ";
		String empty = "";
		String string = "String";
		
		System.out.println("String |"+blank+"| isBlank "+blank.isBlank());
		
		System.out.println("String |"+blank+"| isEmpty "+blank.isEmpty());
		
		System.out.println("String |"+empty+"| isBlank "+empty.isBlank());
		
		System.out.println("String |"+empty+"| isEmpty "+empty.isEmpty());
		
		System.out.println("String |"+string+"| isBlank "+string.isBlank());
		
		System.out.println("String |"+string+"| isEmpty "+string.isEmpty());
		
		
		try {
			System.out.println("String |"+nullVal+"| isBlank "+nullVal.isBlank());	
		}
		catch(NullPointerException exception) {
			System.out.println("Null pointer Exception");
		}
		
	}
	
	
	/**
	 * Repeat
	 */
	private static void repeat() {
		String str = "repeat";
		
		System.out.println("The String repeat 3 times: "+str.repeat(3));
	}
	
	/**
	 * Replace 
	 */
	private static void replace() {
		String str = "Returns a string replacing all string with new";
		
		System.out.println("Orginal: "+str);
		System.out.println("Replace first: "+str.replaceFirst("string", "CharacterSeq"));
		System.out.println("Replace: "+str.replace("string", "CharacterSeq"));
		System.out.println("Replace All: "+str.replaceAll("string", "CharacterSeq"));
	}
	
	/**
	 * Split methods 
	 */
	private static void split () {
		String str = "One Two Three Four";
		
		String[] strArray = str.split(" ");
		System.out.println("Array: "+Arrays.toString(strArray));
		
		System.out.println("String: "+String.join(" ", strArray));
		
	}
	
	
	/**
	 * SubString 
	 */
	private static void subString () {
		String str = "Returns a string that is a substring of this string.";
		String subStr = "substring";
		
		if(str.contains(subStr)) {
			int start = str.indexOf("sub");
			int end = start + subStr.length();
			System.out.println(str.substring(start, end)); 
		}
		
	}
	
}

































