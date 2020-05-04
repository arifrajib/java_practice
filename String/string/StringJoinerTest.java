package string;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stringArray = {"One", "Two", "Three", "Four", "Five"};
		StringJoiner join = new StringJoiner(", ", "\"", "\"");
		
		for(String str : stringArray) {
			join.add(str);
		}
		String arrayToStr = join.toString();
		
		System.out.println(arrayToStr);
				
	}
}
