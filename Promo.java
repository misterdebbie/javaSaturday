import java.util.Scanner;
//Demo app for calculating savings

public class Promo {
 public static void main (String[] args) {
  //declare variables
  String username, day, itemname, repeat;
  char again;
  boolean dayCheck = false;
  boolean openSesame = false;
  double originalPrice, promo, salePrice, discount, totalSavings = 10.00;
  final double perCheck = .1;
  final int check = 0;

  //create a Scanner object to read input
  Scanner keyboard = new Scanner (System.in);
  //Get user name
  do {
  System.out.print("Enter your username: ");
  username = keyboard.nextLine();
  //Get the day to track
  System.out.print("Enter the day of the week: ");
  day = keyboard.nextLine();
  switch (day){
    case "Monday":
    case "monday":
    dayCheck = true;
    break;
    case "Tuesday":
    case "tuesday":
    dayCheck = true;
    break;
    case "Wednesday":
    case "wednesday":
    dayCheck = true;
    break;
    case "Thursday":
    case "thursday":
    dayCheck = true;
    break;
    case "Friday":
    case "friday":
    dayCheck = true;
    break;
    case "Saturday":
    case "saturday":
    dayCheck = true;
    break;
    case "Sunday":
    case "sunday":
    dayCheck = true;
    break;
    default:
    dayCheck = false;
    }
    while (!dayCheck){
      System.out.print("Invalid input. Enter day of the week again: ");
      day = keyboard.nextLine();
}
  //Get the item purchased
  System.out.print("Enter the purchase item name: ");
  itemname = keyboard.nextLine();
  //Get the original price of item
  System.out.print("Enter the original item price: ");
  originalPrice = keyboard.nextDouble();
  while (originalPrice <= check){
    System.out.println("Entered value cannot be less than $0.00");
    System.out.print("Enter the item price again: ");
    originalPrice = keyboard.nextDouble();
}
  //Get the promotional discount to be applied
  System.out.print("Enter the discount: ");
  promo = keyboard.nextDouble();
  while (promo <= check){
    System.out.println("Entered value cannot be less than $0.00");
    System.out.print("Enter the item discount again: ");
    promo = keyboard.nextDouble();
}
  //calculate the promotional discount
  discount = originalPrice * promo;
  //calculate the final cost
  salePrice = originalPrice - discount;
  System.out.printf("Username: %s, Day: %s, Item: %s\n", username, day, itemname);
  System.out.printf("You saved $%,.2f\n", discount);
  System.out.printf("Your final cost is $%,.2f\n", salePrice);
  if (totalSavings <= discount){
  System.out.println("Way to go!");
}
System.out.println("Would you like to enter another purchase?");
keyboard.nextLine();
System.out.print("Enter (Y)yes or (N)no: ");
repeat = keyboard.nextLine();
again = repeat.charAt(0);
if (again == 'Y' || again == 'y'){
  openSesame = true;
}
else {
  openSesame = false;
}

}while (openSesame);
System.out.println("Thanks for using Yang's Money Tracker!");
System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
}
}
