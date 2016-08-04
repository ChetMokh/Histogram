/**
 * Title: Histogram.java
 * Abstract: This program draws the vertical histogram of input numbers. (Homework 1.2)
 * Author: Arash Aria
 * ID: 4210
 * Date: 02/06/16
 */
import java.util.Scanner;


public class Histogram {

	public static void main(String[] args) {
	
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("How many inputs?  (up to 30)");
		
		int inputs = myScan.nextInt();
			
		System.out.println("Enter "+ inputs +" numbers: (0 to 9)");
	
		int[] numbers = new int[inputs];
		
		int[] histNums = new int[10]; 

		for (int i = 0; i < inputs; i++)
		{
			
			int temp;
			temp = myScan.nextInt();
			if (temp >= 0 && temp <=9) 
			{
				numbers[i] = temp;
			} else {
				System.out.println("Number should be between 0 and 9");
				i--;
			}
		
		}
		
		for (int i = 0; i < 10; i++)
		{
			histNums[i] = 0;
		}
		
		for (int i = 0; i < numbers.length; i++)
		{
			histNums[numbers[i]] ++;
		}
		
		int highest = 0;
		for (int i = 0; i < 10; i++)
		{
			if (histNums[i] > highest)
			{
				highest = histNums[i];
			}
		}
		
		myScan.close();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Number  ---  Occurrence");
		
		
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print("   "+i);
			System.out.print("    ---    ");
			System.out.print(histNums[i]);
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println(" =========== Vertical Bar ============");
		
		boolean[][] matrix = new boolean[highest][10];
		
		int max = highest;
		
		for (; max > 0; max--)
		{
			for (int i = 0; i < 10; i++)
			{
				if (histNums[i] >= max)
				{
					matrix[max-1][i] = true;
				} else {
					matrix[max-1][i] = false;
				}
			}
		}
		
		int max2 = highest;
		
		for (; max2 > 0; max2--)
		{
			System.out.print(" | "+ max2 +" | ");
			for (int j = 0; j < 10; j++)
			{
				if (matrix[max2-1][j]==true)
				{
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println(" =====================================");
		System.out.print(" | NO| ");
		for (int i = 0; i < 10; i++)
		{
			System.out.print(" "+ i +"|");
		}
		System.out.println();
		System.out.println(" =====================================");
	
	}
	
}






