
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//a. Item Price
double oilChangePrice = 39.70;
System.out.println("An oil change typically costs $" + oilChangePrice + " per visit.");
double appleWatchPrice = 267.40;
System.out.println("I bought an Apple Watch for $" + appleWatchPrice + ".");

//b. Amount of Money in Wallet
double amountInMyWalletBeforeMall = 109.50;
System.out.println("Before I went to the mall, I had $" + amountInMyWalletBeforeMall + " in my wallet.");
double amountInWalletAfterMall = 22.50;
System.out.println("After I went to the mall, I had $" + amountInWalletAfterMall + " in my wallet.");

//c. Number of Friends
int myFriends = 40;
System.out.println("I'm a little shy, so I have " + myFriends + " friends in total.");
int randallsFriends = 300;
System.out.println("My husband is very outgoing, so he has about " + randallsFriends + " friends in the neighborhood.");

//d. Age in Years
int myAge = 28;
System.out.println("I am " + myAge + " years old.");
int myMothersAge = 50;
System.out.println("In February my mother turned " + myMothersAge + " years old.");

//e. First Name
String firstName = "Jessica";
System.out.println("My mother named me " + firstName + ".");
String daughtersFirstName = "Holland";
System.out.println("I named my first daughter " + daughtersFirstName + ".");

//f. Last Name
String lastName = "Raban";
System.out.println("After I got married, my last name became " + lastName + ".");
String myDadsLastName = "Jacobsen";
System.out.println("Before I got married, my last name was " + myDadsLastName + ".");

//g. Middle Initial
char myMiddleInitial = 'M';
System.out.println("My middle name begins with the letter " + myMiddleInitial + ".");
char mySonsMiddleInitial = 'U';
System.out.println("My son's middle name is Ulrik, and Ulrik begins with the letter " + mySonsMiddleInitial + ".");

//4. 
// a. New Amount of Money of Money in Wallet After Purchase
double moneySpent = amountInMyWalletBeforeMall - amountInWalletAfterMall;
System.out.println("I had spent $" + moneySpent + " at the mall today.");

// b. Number of Friends Per Year (Age)
int age = 28;
int myNumberOfFriends = 40;
System.out.println("I have made on average " + myNumberOfFriends / age + " friend per year.");

//c. Full Name
String fullName = firstName + myMiddleInitial + lastName;
System.out.println("My full name is " + fullName + ".");



	}
	






}
