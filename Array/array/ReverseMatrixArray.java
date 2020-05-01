package array;

import java.util.Arrays;

public class ReverseMatrixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] matrix1 = {
				{"One", "Two", "Three", "Four"},
				{"Five", "Six", "Seven", "Eight"},
				{"Nine", "Ten", "Eleven", "Twelve"}
		};
		printMatrix(matrix1);
		reverseMatrix(matrix1);
		printMatrix(matrix1);
		
	}
	
	private static void reverseMatrix (Object[][] input) {
	
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<input[i].length/2; j++) {
				Object temp = input[i][j];
				input[i][j] = input[i][input[i].length - 1 - j];
				input[i][input[i].length - 1 - j] = temp;
			}
		}
	}
	
	private static void printMatrix (Object[][] input) {
		System.out.println(Arrays.deepToString(input));
	}

}
