package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		/*
		 * Create ArrayList
		 */
		List<String> arrayList = new ArrayList<>();
		/// Add some element
		arrayList.add("Arif");
		arrayList.add("Islam");
		arrayList.add("Rajib");
		
		/*
		 * ArrayList to Array with toArray method
		 */
		String[] array = arrayList.toArray(new String[arrayList.size()]);
		System.out.println("ArrayList to Array conversion: "+Arrays.toString(array));
		
		
		/*
		 * Convert ArrayList to array through loop
		 */
		String[] array2 = new String[3];
		for(int i=0; i<arrayList.size(); i++) {
			array2[i] = arrayList.get(i);
		}
		System.out.println("ArrayList to Array conversion: "+Arrays.toString(array2));
	}

}
