import java.util.Scanner;

public class Questions {

 
	// did everything in one class? that a good idea? Instructor feedback would be appreciated
	
	public String firstName;
	public String lastName;
	
	public int age;
	public String ageStr; //for quit option. convert to int after validation
	public boolean ageIsEven;
	public int ageConversionToRetirement; //for output
	
	public int birthMonth;
	public String birthMonthStr; //for quit option. convert to int after validation
	public int birthMonthConversionToBank; //for output
	
	public String favoriteColor;
	public String favoriteColorConversionToCar; //for output
	
	public int numberOfSiblings;
	public String numberOfSiblingsStr; //for quit option. convert to int after validation
	public String numberOfSiblingsConversionToLocation;
	

	Scanner input = new Scanner(System.in);
	
	// get the first name
	public void firstNameQuestion() {
		System.out.println("What is your first name? ");
		firstName = input.nextLine();
		
		if(firstName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter");
			System.exit(0);
		}
		
		
	}
	
	// get the last name
	public void lastNameQuestion() {
		System.out.println("What is your last name?");
		lastName = input.nextLine();
		
		if(lastName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter");
			System.exit(0);
		}
		
	}
	
	// age to be used for retirement even or odd
	public void ageQuestion() { 
		System.out.println("What is your age? ");
		ageStr = input.nextLine();
		
		if(ageStr.equalsIgnoreCase("quit")) { 
			System.out.println("Nobody likes a quitter");
			System.exit(0);
		}
		age = Integer.parseInt(ageStr); // as string so that quit works
		
		if (age % 2 == 0) {
			ageIsEven = true;
			
		}
		
		if (ageIsEven == true) {
			ageConversionToRetirement = 14;
			
		} else {
			ageConversionToRetirement = 15;
		}
	}
	
	//will determine bank balance at retirement
	public void birthMonthQuestion() { 
		System.out.println("What is your birth month? ");
		birthMonthStr = input.nextLine();

		if(birthMonthStr.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter");
			System.exit(0);
		}
		 birthMonth = Integer.parseInt(birthMonthStr);
		if(birthMonth > 12) {
			System.out.println("That's too high of a number. Let's try that again. ");
			birthMonthQuestion();
		}
		
		if (birthMonth < 5) {
			birthMonthConversionToBank = 736000;
		} else if (birthMonth < 9) {
			birthMonthConversionToBank = 230000;
		}else if (birthMonth < 13){
			birthMonthConversionToBank = 180000;
		} else {
			birthMonthConversionToBank = 0;
		}
	}
	
	// favorite color to determine vehicle output
	public void favoriteColorQuestion() { 
		System.out.println("What is your favorite color? ROYGBIV?");
		favoriteColor = input.nextLine();
	
	if(favoriteColor.equalsIgnoreCase("help")) { // help question to show color entry options
		System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
		favoriteColorQuestion();
		}
	
	if(favoriteColor.equalsIgnoreCase("quit")) {
		System.out.println("Nobody likes a quitter");
		System.exit(0);
	}
	
	if (favoriteColor.equalsIgnoreCase("red")) {
		favoriteColorConversionToCar = "Tesla";
	}else if (favoriteColor.equalsIgnoreCase("orange")) {
		favoriteColorConversionToCar = "Ford";
	}else if (favoriteColor.equalsIgnoreCase("yellow")) {
		favoriteColorConversionToCar = "taxi";
	}else if (favoriteColor.equalsIgnoreCase("green")) {
		favoriteColorConversionToCar = "Toyota";
	}else if (favoriteColor.equalsIgnoreCase("blue")) {
		favoriteColorConversionToCar = "Vespa";
	}else if (favoriteColor.equalsIgnoreCase("indigo")) {
		favoriteColorConversionToCar = "VW";
	}else if (favoriteColor.equalsIgnoreCase("violet")) {
		favoriteColorConversionToCar = "Dodge";
	}else {
		favoriteColorConversionToCar = "Dirtbike";
	}
	
	}
	
	// number of siblings to determine location output
	public void numberOfSiblingsQuestion() {
		System.out.println("How many siblings do you have? ");
		numberOfSiblingsStr = input.nextLine();
		
		if(numberOfSiblingsStr.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter");
			System.exit(0);
		}
		
		numberOfSiblings = Integer.parseInt(numberOfSiblingsStr);
		
		if (numberOfSiblings == 0) {
			numberOfSiblingsConversionToLocation = "New York, NY";
		} else if(numberOfSiblings == 1) {
			numberOfSiblingsConversionToLocation = "San Francisco, CA";
		} else if(numberOfSiblings == 2) {
			numberOfSiblingsConversionToLocation = "Hoboken, NJ";
		} else if(numberOfSiblings == 3) {
			numberOfSiblingsConversionToLocation = "Hartville, OH";
		} else if(numberOfSiblings > 3) {
			numberOfSiblingsConversionToLocation = "Akron, OH";
		}else {
			numberOfSiblingsConversionToLocation = "Cleveland, OH";
		}
	}
	
	// final output
	public void FortuneOutput() {
		System.out.println(firstName + " " + lastName + " will retire in " + ageConversionToRetirement + " years with $" + birthMonthConversionToBank + ", a vacation home in " + numberOfSiblingsConversionToLocation + ", and travel by " + favoriteColorConversionToCar + ".");
	}
	
	
	
	
	
	
	
	
	
}