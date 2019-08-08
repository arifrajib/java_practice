package array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		/*
		 * Source Array
		 */
		char[] copyFrom = {'A', 'r', 'i', 'f', 'I', 's', 'l', 'a', 'm', 'R', 'a', 'j', 'i', 'b'};

		/*
		 * copy array using System.arraycopy method
		 */
		char[] arrayCopy = new char[5];
		System.arraycopy(copyFrom, 4, arrayCopy, 0, 5);
		System.out.println("Array copy using System.arraycopy: "+ new String(arrayCopy));
		
		/*
		 * copy array using Object.clone
		 */
		char[] objectClone = new char[15];
		objectClone = copyFrom.clone();
		System.out.println("Array copy using Object.clone: "+ new String(objectClone));
		
		/*
		 * copy array using Array.copyOf
		 */
		char[] copyOfExmpl = new char[4];
		copyOfExmpl = Arrays.copyOf(copyFrom, 4);
		System.out.println("Array copy using Arrays.copyOf: "+ new String(copyOfExmpl));
		
		/*
		 * copy array using Array.copyOfRange
		 */
		char[] copyOfRangeExmpl = new char[5];
		copyOfRangeExmpl = Arrays.copyOfRange(copyFrom, 9, copyFrom.length);
		System.out.println("Array copy using Arrays.copyOfRange: "+ new String(copyOfRangeExmpl));
		
	}
	
}
