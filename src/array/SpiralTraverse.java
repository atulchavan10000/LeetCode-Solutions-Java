package array;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3, 4}, {10, 11, 12, 5}, {9, 8, 7, 6}};
		
		
		int startRow = 0, endRow = matrix.length - 1;
		int startCol = 0, endCol = matrix[0].length - 1;
		List<Integer> answer = new ArrayList<Integer>();
		
		
		while(startRow <= endRow && startCol <= endCol) {
			// Top Row
			for(int col = startCol; col <= endCol; col++) {
				answer.add(matrix[startRow][col]);
			}
			
			// Right Column
			for(int row = startRow+1; row <=endRow; row++) {
				answer.add(matrix[row][endCol]);
			}
			
			// Bottom Row
			for(int col = endCol-1; col >= startCol; col--) {
				if(startRow == endRow) break;
				answer.add(matrix[endRow][col]);
			}
			
			// Left Column
			for(int row = endRow-1; row > startRow; row--) {
				if(startCol == endCol) break;
				answer.add(matrix[row][startCol]);
			}
				
			startRow++;
			endRow--;
			startCol++;
			endCol--;
		}
		
		System.out.println(answer);
		
	}
}
