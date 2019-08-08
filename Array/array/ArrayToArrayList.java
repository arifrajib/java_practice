package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayToArrayList {

	public static void main(String[] args) {
		
		/*
		 * Conversion with Arrays.asList
		 */
		String[] stringArray = {"Arif", "Islam", "Rajib"};
		List<String> listAsList = Arrays.asList(stringArray);
		listAsList.forEach(System.out::println);
		/*
		 * Change array element after conversion
		 */
		System.out.println("Change array element after conversion");
		stringArray[1] = "changed";
		listAsList.forEach(System.out::println);
		
		
		/*
		 * Converting with Collection.addAll
		 */
		List<String> listAddAll = new ArrayList<>(); 
		Collections.addAll(listAddAll, stringArray);
		System.out.println("Collection.addAll conversion");
		listAddAll.forEach(System.out::println);
		System.out.println("Change array element after conversion");
		stringArray[1] = "Islam";
		listAddAll.forEach(System.out::println);
		
		
		/*
		 * Converting through loop
		 */
		List<String> loopList = new ArrayList<String>();
		for(String str : stringArray) {
			loopList.add(str);
		}
		System.out.println("Conversion throught loop");
		loopList.forEach(System.out::println);
	}

}
