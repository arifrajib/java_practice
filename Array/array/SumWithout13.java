package array;

/**
 * 
Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 2, 2, 1, 13]) → 6
sum13([1, 2, 2, 1, 13, 12]) → 6
 */

public class SumWithout13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumArrays(new int[] {1, 2, 2, 1}));
		System.out.println(sumArrays(new int[] {1, 2, 2, 1, 13}));
		System.out.println(sumArrays(new int[] {1, 2, 2, 1, 13, 12}));
	}
	
	private static int sumArrays (int[] nums) {
		int sum = 0;
		boolean after = false;
		for(int i : nums) {
			if(i == 13 || after) {
				if(i == 13) {
					after = true;
				}
				else {
					after = false;
				}
				continue;
			}
			sum += i;
		}   
		return sum;
	}

}
