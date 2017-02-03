import java.util.Scanner;
import java.io.*;

//demo using User and Item class
public class MoneyTracker {
 public static void main (String[] args)throws IOException{
  //declare variables
  String userName, password, filename;
  int choice;

  //ProfileSetup user1 = new ProfileSetup();
  filename = createNewFile();
  userName = setUsername();
  password = setPassword();

//create user
User user1 = new User (userName, password, filename);
System.out.println(user1.getName());
System.out.println(user1.getPassword());
System.out.println(user1.getFilename());
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
}
