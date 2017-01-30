import java.util.Scanner;
import java.io.*;

//Demo app for calculating savings

public class Promo {
 public static void main (String[] args) throws IOException {
  //declare variables
  String filename, username, day, itemname, repeat;
  int choice;
  char again;
  boolean dayCheck = false;
  boolean openSesame = false;
  double originalPrice, promo, salePrice, discount, totalSavings = 0;
  final double perCheck = .1;
  final int check = 0;
  //choice = fileChoice();
  choice = fileChoice();
  if (choice == 1){
    creatNewFile();
    username = getUsername();
    day = getDay();
    itemname = getItem();
    originalPrice = getItemCost();
    discount = getDiscount();
    finalPrice = getFinalPrice(originalPrice, discount);
    System.out.println(finalPrice);

  }
  else{
    openFile();
    username = getUsername();
    day = getDay();
    itemname = getItem();
    originalPrice = getItemCost();
    discount = getDiscount();
    finalPrice = getFinalPrice(originalPrice, discount);
    System.out.println(finalPrice);

  }
  }//close main
  public static int fileChoice(){
  int input;
  //create a Scanner object to read input
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Would you like to (1) create a new file or (2) add to an existing file?");
  input = keyboard.nextInt();
  keyboard.nextLine();
  return input;
  }
  public static void creatNewFile() throws IOException{
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
  public static String getUsername (){
  String uName;
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Enter your username: ");
  uName = keyboard.nextLine();
  return uName;
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
  public static String getItem (){
  String userItem;
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Enter the item name: ");
  userItem = keyboard.nextLine();
  return userItem;
  }
  public static double getItemCost (){

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
  public static double getDiscount (){

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
  //create a Scanner object to read input
  /*Scanner keyboard = new Scanner (System.in);
  do {
    //Get filename
    System.out.print("Would you like to (1) create a new file or (2) add to an existing file?");
    choice = keyboard.nextInt();
    keyboard.nextLine();
    if (choice == 1){
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();
      File file = new File (filename);
      if (file.exists()){
        System.out.println("The file " + filename + " already exists");
        System.out.print("Enter a new filename: ");
        filename = keyboard.nextLine();
      }
      else {
        PrintWriter outputFile = new PrintWriter(filename);
        //Get user name
        System.out.print("Enter your username: ");
        username = keyboard.nextLine();
        //Get the day to track
        //Validate user input
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
            dayCheck = true;
        //need to reset flag, ouuuuuuuu???????

        //Get the item purchased
        System.out.print("Enter the purchase item name: ");
        itemname = keyboard.nextLine();
        //Get the original price of item
        //Validate user input
        System.out.print("Enter the original item price: ");
        originalPrice = keyboard.nextDouble();
        while (originalPrice <= check){
          System.out.println("Entered value cannot be less than $0.00");
          System.out.print("Enter the item price again: ");
          originalPrice = keyboard.nextDouble();
      }
        //Get the promotional discount to be applied
        //Validate user input
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
        //track total savings
        totalSavings += discount;
        //accumulated savings is tracking all test data!
        System.out.printf("Username: %s, Day: %s, Item: %s\n", username, day, itemname);
        System.out.printf("You saved $%,.2f\n", discount);
        System.out.printf("Your final cost is $%,.2f\n", salePrice);
        System.out.printf("Accumulated savings of $%,.2f\n", totalSavings);
        outputFile.printf("Username: %s, Day: %s, Item: %s\n", username, day, itemname);
        outputFile.printf("You saved $%,.2f\n", discount);
        outputFile.printf("Your final cost is $%,.2f\n", salePrice);
        outputFile.printf("Accumulated savings of $%,.2f\n", totalSavings);
        //close the file
        outputFile.close();
        System.out.println("Data written to the file.");
        /*if (totalSavings <= discount){
        System.out.println("Way to go!");
      }*/
      /*System.out.println("Would you like to enter another purchase?");
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
      }
}
else{
    System.out.print("Enter the filename: ");
    filename = keyboard.nextLine();
    FileWriter fwriter = new FileWriter(filename, true);
    PrintWriter outputFile = new PrintWriter(fwriter);
    //Get user name
    System.out.print("Enter your username: ");
    username = keyboard.nextLine();
    //Get the day to track
    //Validate user input
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
        dayCheck = true;
    //need to reset flag, ouuuuuuuu???????

    //Get the item purchased
    System.out.print("Enter the purchase item name: ");
    itemname = keyboard.nextLine();
    //Get the original price of item
    //Validate user input
    System.out.print("Enter the original item price: ");
    originalPrice = keyboard.nextDouble();
    while (originalPrice <= check){
      System.out.println("Entered value cannot be less than $0.00");
      System.out.print("Enter the item price again: ");
      originalPrice = keyboard.nextDouble();
  }
    //Get the promotional discount to be applied
    //Validate user input
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
    //track total savings
    totalSavings += discount;
    //accumulated savings is tracking all test data!
    System.out.printf("Username: %s, Day: %s, Item: %s\n", username, day, itemname);
    System.out.printf("You saved $%,.2f\n", discount);
    System.out.printf("Your final cost is $%,.2f\n", salePrice);
    System.out.printf("Accumulated savings of $%,.2f\n", totalSavings);
    outputFile.printf("Username: %s, Day: %s, Item: %s\n", username, day, itemname);
    outputFile.printf("You saved $%,.2f\n", discount);
    outputFile.printf("Your final cost is $%,.2f\n", salePrice);
    outputFile.printf("Accumulated savings of $%,.2f\n", totalSavings);
    //close the file
    outputFile.close();
    System.out.println("Data written to the file.");
    /*if (totalSavings <= discount){
    System.out.println("Way to go!");
  }*/
  /*System.out.println("Would you like to enter another purchase?");
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
  }
  //Get user name
  /*System.out.print("Enter your username: ");
  username = keyboard.nextLine();
  //Get the day to track
  //Validate user input
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
      dayCheck = true;
  //need to reset flag, ouuuuuuuu???????

  //Get the item purchased
  System.out.print("Enter the purchase item name: ");
  itemname = keyboard.nextLine();
  //Get the original price of item
  //Validate user input
  System.out.print("Enter the original item price: ");
  originalPrice = keyboard.nextDouble();
  while (originalPrice <= check){
    System.out.println("Entered value cannot be less than $0.00");
    System.out.print("Enter the item price again: ");
    originalPrice = keyboard.nextDouble();
}
  //Get the promotional discount to be applied
  //Validate user input
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
  //track total savings
  totalSavings += discount;
  //accumulated savings is tracking all test data!
  System.out.printf("Username: %s, Day: %s, Item: %s\n", username, day, itemname);
  System.out.printf("You saved $%,.2f\n", discount);
  System.out.printf("Your final cost is $%,.2f\n", salePrice);
  System.out.printf("Accumulated savings of $%,.2f\n", totalSavings);
  outputFile.printf("Username: %s, Day: %s, Item: %s\n", username, day, itemname);
  outputFile.printf("You saved $%,.2f\n", discount);
  outputFile.printf("Your final cost is $%,.2f\n", salePrice);
  outputFile.printf("Accumulated savings of $%,.2f\n", totalSavings);
  //close the file
  outputFile.close();
  System.out.println("Data written to the file.");
  /*if (totalSavings <= discount){
  System.out.println("Way to go!");
}*/
/*System.out.println("Would you like to enter another purchase?");
keyboard.nextLine();
System.out.print("Enter (Y)yes or (N)no: ");
repeat = keyboard.nextLine();
again = repeat.charAt(0);
if (again == 'Y' || again == 'y'){
  openSesame = true;
}
else {
  openSesame = false;
}*/

/*}while (openSesame);
System.out.println("Thanks for using Yang's Money Tracker!");
System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

}*/
}
