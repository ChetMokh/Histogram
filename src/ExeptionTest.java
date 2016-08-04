import java.util.Scanner;


public class ExeptionTest {

	public static void main(String[] args) {
		int number = 0;
		boolean repeat = true;
		
		do {
			
			System.out.println("ENTER A WHOLE NUMBER: ");
			try {
				@SuppressWarnings("resource")
				Scanner myScan = new Scanner(System.in);
				number = myScan.nextInt();
				repeat = false;
			} catch (Exception e) {
				System.out.println("NOT AN ACCEPTABLE NUMBER!!!");
				System.out.println("TRY AGAIN");
				repeat = true;
			}
			
		} while (repeat==true);
			System.out.println("Correct form.");
			System.out.println("You entered  " + number);
		
	}

}
