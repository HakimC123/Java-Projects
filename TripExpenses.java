/*
 * Hakim Chughtai
 * IDE: Eclipse
 */

import java.util.*; //Imports all of the classes in the utilities package
import java.text.*; //Imports all of the classes in the text package

public class TripExpenses {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Makes use of the scanner class
		NumberFormat fmt = NumberFormat.getCurrencyInstance(); //Makes use of the NumberFormat class to get a dollar sign
		NumberFormat fmt1 = NumberFormat.getPercentInstance(); //Makes use of the NumberFormat class to get a percent sign
		
		String enterLastName; //Variable initialization of last name to be inputted
		
		System.out.println("Enter your last name: "); //Asks the user to input his/her last name
		enterLastName = scan.nextLine(); //Reads the user input of his/her last name
		
	    double airlineFare; //Variable initialization of airline fare 
		System.out.println("Enter airline fare: "); //Asks the user to enter the airline fare
		airlineFare = scan.nextDouble(); //Reads the airline fare the user inputs
		
		int nights; //Variable initialization of the number of nights at the hotel
		System.out.println("Enter number of nights: "); //Asks the user to input the number of nights they will stay at the hotel
		nights = scan.nextInt(); //Reads the number of nights at the hotel the user inputs
		
		double hotel = nights*256.10; //Calculates the total hotel cost given the nightly costs and  
		
		double amtConv; //Variable initialization of the amount of dollars to convert to cuban currency
		
		double cuc = 0.10; //Variable initialization of CUC penalty charges
		double convRate = 0.03; //Variable initialization of conversion rate
		double penalty = cuc + convRate; //Sums up the CUC penalty charges and the conversion rate to get the total penalty charges for conversion
		
		System.out.println("Enter dollars to convert: "); //Asks the user to enter the amount of dollars to convert to cuban currency
		amtConv = scan.nextDouble(); //Reads the amount of money the user inputs
		double convertedAmt = amtConv - amtConv*penalty;
		
		System.out.println(); //Creates a space break under the expense input in order for the report to show
		
		String lastName = enterLastName.substring(0, 1).toUpperCase() + enterLastName.substring(1).toLowerCase(); //Set it so that the last name of which were converted so that only the first letter of the last name is capatilized and the rest lowercased no matter how thee user types his/her last name 
		
		System.out.println(lastName +"'s Expense Report"); //Prints out the title of this expense report with the inputted last name
		System.out.println(); //Creates a space break under the title of the expense report
		
		System.out.println("Airline Fare       = "+fmt.format(airlineFare)); //Prints out the airline fare in the expense report
		System.out.println("Hotel              = "+fmt.format(hotel)); //Prints out the total hotel cost depending on the number of nights the user wishes to say
		
		System.out.println(); //Creates a space break under the total hotel cost
		
		double total = airlineFare + hotel; //Sums up the total costs needed to be paid in order to travel to Cuba
		System.out.println("Total              = "+fmt.format(total)); //Prints out the total costs needed to be paid in order to travel to Cuba
		
		System.out.println(); //Creates a space break under the total cost of traveling to Cuba
		
		System.out.println(fmt.format(amtConv)+" Dollars    = "+fmt.format(convertedAmt)+" Cubans"); //Prints out total converted amounts of the cuban currency
		System.out.println("CUC Penalty        = "+fmt1.format(cuc)); //Prints out the CUC Penalty rate
		System.out.println("Conversion Rate    = "+fmt1.format(convRate)); //Prints out the conversion rate 
	}

}
