package array;


/**
 * 
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
*/


public class DifferenceBetweenLargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bigDiff(new int[] {10, 3, 5, 6}));
		System.out.println(bigDiff(new int[] {7, 2, 10, 9}));
		System.out.println(bigDiff(new int[] {2, 10, 7, 2}));
	}
	
	private static int bigDiff(int[] nums) {
		int largest = 0;
		int smallest = nums[0];
		for(int i : nums) {
			largest = Math.max(largest, i);
			smallest = Math.min(smallest, i);
		}
		
		return largest - smallest;
	}

}
