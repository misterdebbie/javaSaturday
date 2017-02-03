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
  boolean openSesame = false;

  do {
  choice = fileChoice();
  if (choice == 1){
    userName = setUsername();
    password = setPassword();
    filename = createNewFile();
    day = setDay();
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
    openSesame = addData();
  }
  else{
    userName = setUsername();
    password = setPassword();
    filename = openFile();
    day = setDay();
    //create User
    User user1 = new User (userName, password, filename);
    itemname = setItem();
    originalPrice = setItemCost();
    discount = setDiscount();
    //create Item
    Item item1 = new Item(itemname, originalPrice, discount);
    finalPrice = item1.getFinalCost();
    totalDisco = item1.getTotalDiscount();
    addToFile(user1, day, item1);
    System.out.println(finalPrice);
    openSesame = addData();
  }
  }while(openSesame);

  System.out.println("Thanks for using Yang's Money Tracker!");
  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  }//close main
  public static int fileChoice(){
   int input;
   //create a Scanner object to read input
   Scanner keyboard = new Scanner (System.in);
   System.out.print("Would you like to (1) create a new file or (2) add to an existing file? ");
   input = keyboard.nextInt();
   keyboard.nextLine();
   return input;
 }
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
 public static String openFile () throws IOException{
  String fName;
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Enter the filename: ");
  fName = keyboard.nextLine();
  FileWriter fwriter = new FileWriter(fName, true);
  PrintWriter outputFile = new PrintWriter(fwriter);
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
 public static String setDay (){
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
public static boolean addData (){
  Scanner keyboard = new Scanner (System.in);
  String input;
  boolean oneMoreTime;
  char again;
  System.out.println("Would you like to enter another purchase?");
  System.out.print("Enter (Y)yes or (N)no: ");
  input = keyboard.nextLine();
  again = input.charAt(0);
  if (again == 'Y' || again == 'y'){
    oneMoreTime = true;
  }
  else {
    oneMoreTime = false;
  }
  return oneMoreTime;
}
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
public static void addToFile(User testUser, String day, Item testItem) throws IOException{
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
