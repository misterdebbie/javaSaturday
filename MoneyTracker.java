import java.util.Scanner;
import java.io.*;

//demo using User and Item class
public class MoneyTracker {
 public static void main (String[] args)throws IOException{
  //declare variables
  String userName, password, filename, itemname;
  int choice;
  double originalPrice, discount, finalPrice;

  //ProfileSetup user1 = new ProfileSetup();
  filename = createNewFile();
  userName = setUsername();
  password = setPassword();
  //create User
  User user1 = new User (userName, password, filename);
  itemname = setItem();
  originalPrice = setItemCost();
  discount = setDiscount();
  //create Item
  Item item1 = new Item(itemname, originalPrice, discount);
  finalPrice = item1.getFinalCost();
System.out.println(user1.getName());
System.out.println(user1.getPassword());
System.out.println(user1.getFilename());
System.out.println("Final cost of " + item1.getName() + ": $"+  finalPrice);
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
public static double getFinalPrice (double original, double promo){

  double discount, finalCost;
  discount = original * promo;
  finalCost = original - discount;
  return finalCost;
}
}
