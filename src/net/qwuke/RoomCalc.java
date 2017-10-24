package net.qwuke;

import java.util.Scanner;

public class RoomCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valid = "y";
		do {
			double len;
			double wid;
			System.out.println("Welcome to Grand Circus' Room Detail Generator");
			System.out.println("");
			System.out.println("Enter length: ");
			while (!sc.hasNextDouble()) {        
			    sc.next(); // Handles the non int then waits for the next input, stopping an infinite angry messages/hang and exception simultaneously
			    System.out.println("That wasn't a double! Try entering another length: ");
			}
			System.out.println("Enter width: ");
			len = sc.nextDouble();
			while (!sc.hasNextDouble()) {        
			    sc.next(); // Handles the non int then waits for the next input, stopping an infinite angry messages/hang and exception simultaneously
			    System.out.println("That wasn't a double! Try entering another width: ");
			}
			wid = sc.nextDouble();
			double area = len * wid;
			double perimeter = 2 * (len + wid);
			//where we print outputs
		    System.out.println(area);
		    System.out.println(perimeter);
		    sc.nextLine();
			System.out.println("Continue? Type y to continue or n to end the program");
			
			valid = sc.nextLine();
			while(!(valid.equals("y")||valid.equals("Y")||valid.equals("n")||valid.equals("N"))) {
				System.out.println("That wasn't a valid input! Type y to continue or n to stop");
				valid = sc.nextLine();
			}
				
		}while(valid.equals("y")||valid.equals("Y"));
		

	}

}
