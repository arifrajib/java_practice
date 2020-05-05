package string;

import java.util.StringJoiner;

public class StringJoinerMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stringArray = {"One", "Two", "Three", "Four", "Five"};
		StringJoiner join = new StringJoiner(", ", "\"", "\"");
		
		for(String str : stringArray) {
			join.add(str);
		}
		
		System.out.println("Join String Length: "+join.length());
		
		String arrayToStr = join.toString();
		
		System.out.println("Join String: "+arrayToStr);	
		
		
		////// Try with Numbers
		StringJoiner ids = new StringJoiner(",", "{", "}");
	
		for(int i=0; i<10; i++) {
			ids.add(String.valueOf(i));
		}
		System.out.println("Ids "+ids.toString());
		
	}
}
