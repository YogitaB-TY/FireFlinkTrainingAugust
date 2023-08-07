package testngBasics;

import java.util.Scanner;

public class LearningTwoDArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row size");
		int row_size=sc.nextInt();
		System.out.println("Enter Column size");
		int col_size=sc.nextInt();
		int[][] data=new int[row_size][col_size];
		for(int i=0;i<row_size;i++) {
			for(int j=0;j<col_size;j++) {
				data[i][j]= j;
			}
		}
		
		for(int i=0;i<row_size;i++) {
			for(int j=0;j<col_size;j++) {
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}

}
