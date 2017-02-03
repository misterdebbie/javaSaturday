import java.util.Scanner;
import java.io.*;

//demo using User and Item class
public class MoneyTracker {
 public static void main (String[] args)throws IOException{
  //declare variables
  String userName, password, filename, itemname, day;
  int choice;
  double originalPrice, discount, finalPrice, totalDisco;
  boolean dayCheck = false;


  userName = setUsername();
  password = setPassword();
  filename = createNewFile();
  day = getDay();
  //create User
  User user1 = new User (userName, password, filename);
  itemname = setItem();
  originalPrice = setItemCost();
  discount = setDiscount();
  //create Item
  Item item1 = new Item(itemname, originalPrice, discount);
  finalPrice = item1.getFinalCost();
  totalDisco = item1.getTotalDiscount();
  writeToNewFile(user1, day, item1);

/*System.out.println(user1.getName());
System.out.println(user1.getPassword());
System.out.println(user1.getFilename());
System.out.println("Final cost of " + item1.getName() + ": $"+  finalPrice);*/
}//close main method

  public static String createNewFile() throws IOException{
  String fName;
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Enter the filename: ");
  fName = keyboard.nextLine();
  File file = new File (fName);
  while (file.exists()){
    System.out.println("The file " + fName + " already exists");
    System.out.print("Enter a new filename: ");
    fName = keyboard.nextLine();
  }
  return fName;
}
  public static String setUsername (){
  String uName;
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Enter your username: ");
  uName = keyboard.nextLine();
  return uName;
  }
  public static String setPassword (){
  String pWord;
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Enter your password: ");
  pWord = keyboard.nextLine();
  return pWord;
}
public static String getDay (){
String userDay;
boolean check = false;
Scanner keyboard = new Scanner (System.in);
System.out.print("Enter the day: ");
userDay = keyboard.nextLine();
switch (userDay){
  case "Monday":
  case "monday":
  check = true;
  break;
  case "Tuesday":
  case "tuesday":
  check = true;
  break;
  case "Wednesday":
  case "wednesday":
  check = true;
  break;
  case "Thursday":
  case "thursday":
  check = true;
  break;
  case "Friday":
  case "friday":
  check = true;
  break;
  case "Saturday":
  case "saturday":
  check = true;
  break;
  case "Sunday":
  case "sunday":
  check = true;
  break;
  default:
  check = false;
  }
  while (!check){
    System.out.print("Invalid input. Enter day of the week again: ");
    userDay = keyboard.nextLine();
    check = true;
}
//need to reset flag, ouuuuuuuu???????
return userDay;
}
public static String setItem (){
String userItem;
Scanner keyboard = new Scanner (System.in);
System.out.print("Enter the item name: ");
userItem = keyboard.nextLine();
return userItem;
}
public static double setItemCost (){

  double itemCost, check = 0;
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Enter the original item price: ");
  itemCost = keyboard.nextDouble();
  while (itemCost <= check){
    System.out.println("Entered value cannot be less than $0.00");
    System.out.print("Enter the item price again: ");
    itemCost= keyboard.nextDouble();
}
  return itemCost;
}
public static double setDiscount (){

  double promo, check = 0;
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Enter the discount: ");
  promo = keyboard.nextDouble();
  while (promo <= check){
    System.out.println("Entered value cannot be less than 0");
    System.out.print("Enter the item discount again: ");
    promo = keyboard.nextDouble();
}
  return promo;
}
/*public static void writeToNewFile(String fName, String uName, String userItem, String day, double originalCost, double disco, double finalCost) throws IOException{
PrintWriter outputFile = new PrintWriter (fName);
outputFile.printf("Username: %s, Day: %s, Item: %s\n", uName, day, userItem);
outputFile.printf("You saved $%,.2f\n", disco);
outputFile.printf("Your final cost is $%,.2f\n", finalCost);
//outputFile.printf("Accumulated savings of $%,.2f\n", totalSavings);
//close the file
outputFile.close();
System.out.println("Data written to the file.");
}*/
public static void writeToNewFile(User testUser, String day, Item testItem) throws IOException{
PrintWriter outputFile = new PrintWriter (testUser.getFilename());
outputFile.printf("Username: %s, Day: %s, Item: %s\n", testUser.getName(), day, testItem.getName());
outputFile.printf("You saved $%,.2f\n", testItem.getTotalDiscount());
outputFile.printf("Your final cost is $%,.2f\n", testItem.getFinalCost());
//outputFile.printf("Accumulated savings of $%,.2f\n", totalSavings);
//close the file
outputFile.close();
System.out.println("Data written to the file.");
}
}
