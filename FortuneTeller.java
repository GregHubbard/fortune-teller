import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//intro
		System.out.println("Welcome to the Fortune Teller. May the odds ever be in your favor...\nEnter \"Quit\" at any time to stop.\n");
		
		//firstName
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		if (firstName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		
		//lastName
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		if (lastName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		
		//age
		System.out.println("How old are you?");
		String ageString = input.nextLine();
		if (ageString.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int age = Integer.parseInt(ageString);
		
		//birthMonth
		System.out.println("What month were you born? (Enter as number.)");
		String birthMonthString = input.nextLine();
		if (birthMonthString.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int birthMonth = Integer.parseInt(birthMonthString);
		
		//numberOfSiblings
		System.out.println("How many siblings do you have?");
		String numberOfSiblingsString = input.nextLine();
		if (numberOfSiblingsString.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int numberOfSiblings = Integer.parseInt(numberOfSiblingsString);
		
		//favoriteColor
		System.out.println("What is your favorite ROYGBIV color? Enter \"Help\" to get a list of ROYGBIV colors.");
		String favoriteColor = input.nextLine();
		
		//"help" for ROYGBIV
		while (favoriteColor.equalsIgnoreCase("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet. What is your favorite?");
			favoriteColor = input.nextLine();
		}
		
		//"quit" for ROYGBIV
		if (favoriteColor.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		
		//years until retirement based on odd or even age
		String retirementYears = "0";
		if (age % 2 == 0) {
			retirementYears = "35";
		} 
		else {
			retirementYears = "7";
		}
		
		//vacation home location based on number of siblings
		String vacationHome = " ";
		if (numberOfSiblings < 0) {
			vacationHome = "the Sahara Desert";
		}
		else if (numberOfSiblings == 0) {
			vacationHome = "Timbuktu";
		}
		else if (numberOfSiblings == 1) {
			vacationHome = "Barcelona";
		}
		else if (numberOfSiblings == 2) {
			vacationHome = "Tahiti";
		}
		else if (numberOfSiblings == 3) {
			vacationHome = "Kansas City, Missouri";
		}
		else if (numberOfSiblings > 3) {
			vacationHome = "Paris";
		}
		else {
			vacationHome = "Anarctica";
		}
		
		//mode of transportation based on favorite color
		String transportation = "Nothing";
		switch (favoriteColor) {
		case "red":
			transportation = "School Bus";
			break;
		case "orange":
			transportation = "Ferarri";
			break;
		case "yellow":
			transportation = "Paddle Boat";
			break;
		case "green":
			transportation = "Toyota Prius";
			break;
		case "blue":
			transportation = "Tesla";
			break;
		case "indigo":
			transportation = "Jetpack";
			break;
		case "violet":
			transportation = "Private Jet";
			break;
		default:
			transportation = "Submarine";;
			break;
		}
		
		//bank balance based on birth month
		String bankBalance = "0";
		if (birthMonth >= 1 && birthMonth <= 4) {
			bankBalance = "$56,987,123.35";
		} 
		else if (birthMonth >= 5 && birthMonth <= 8) {
			bankBalance = "$221,456.30";
		} 
		else if (birthMonth >= 9 && birthMonth <= 12) {
			bankBalance = "45,678.90";
		}
		else {
			bankBalance = "$12.00";
		}
		
		//fortune
		System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " years with " + bankBalance + " in the bank,"
+ " a vacation home in " + vacationHome + ", and travel by " + transportation + ".");
	}

}
