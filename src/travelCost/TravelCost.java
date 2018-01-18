/*
 * This program uses total distance of the trip, 
 * the mpg of vehicle, and the current price of 
 * gas to calculate the total cost of the trip.
 */
package travelCost;
import java.util.Scanner;
/**
 * 
 * @author Omar Jasso
 *
 */
public class TravelCost {
	
	public static void main(String[ ] args) {
		double distance, mpg, pricePerGallon, totalCost;
		String vehicleType, vehicleType1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the total distance in miles: ");
		distance = in.nextDouble();
		System.out.println("Enter the mpg for the vehicle: ");
		mpg = in.nextDouble();
		System.out.println("Enter the price of one gallon of gas: ");
		pricePerGallon = in.nextDouble();
		System.out.println("What type of vehicle is it? ");
		vehicleType1 = in.next();
		vehicleType = in.next();
		
		totalCost = (distance/mpg)*pricePerGallon;
		System.out.printf("The trip is going to cost $%5.2f since you are driving " + "a " + vehicleType1 + " " + vehicleType, totalCost);
		System.out.println();
		in.close();
	}

}
