/**
 * Title: SortedString.java
 * Abstract: This program sorts the input text file and prints it into the output file. (Homework 1.1)
 * Author: Arash Aria
 * ID: 4210
 * Date: 02/06/16
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedString {

	public static void main(String[] args) throws FileNotFoundException {
		
		String inputPath = null;
		
		String outputPath = null;
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter input file path: ");
		
		inputPath = myScan.nextLine();
			
		System.out.println("Enter output file path: ");
	
		outputPath = myScan.nextLine();
		
		myScan.close();
		
		Scanner myFileScan = null;
		try {
			myFileScan = new Scanner(new File(inputPath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("FILE DOES NOT EXISTS!");
		} finally {
		
			ArrayList<String> myList = new ArrayList<String>();
			
			while (myFileScan.hasNext()){
			    myList.add(myFileScan.nextLine());
			}
			
			myFileScan.close();
	
			System.out.println("Done.");	
			
			Collections.sort(myList);
			
			PrintWriter writer = new PrintWriter(new File(outputPath));
			
			for (int i = 0; i < myList.size(); i++)
			{
				writer.println(myList.get(i));
			}
			
			writer.close();
		
		}
		
	}

}
