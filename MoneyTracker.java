import java.util.Scanner;
import java.io.*;

//demo using User and Item class
public class MoneyTracker {
 public static void main (String[] args){
  //declare variables
  String userName, password, filename;
  int choice;
 Scanner keyboard = new Scanner(System.in);
 System.out.print("Enter your user name: ");
 userName = keyboard.nextLine();
 System.out.print("Enter your password: ");
 password = keyboard.nextLine();
 System.out.print("Would you like to add data to (1) a new file or (2) an existing file ? ");
 choice = keyboard.nextInt();
 keyboard.nextLine();
 if (choice == 1){
  System.out.print("Enter the new filename: ");
  filename = keyboard.nextLine();
}
else {
System.out.print("Enter the existing filename: ");
filename = keyboard.nextLine();
}

User user1 = new User (userName, password, filename);
System.out.println(user1.getName());
System.out.println(user1.getPassword());
System.out.println(user1.getFilename());

  }
}
