import java.util.Scanner;
import java.io.*;

//demo using User and Item class
public class MoneyTracker {
 public static void main (String[] args){
  //declare variables
  String userName, password, filename;
  int choice;

  filename = createNewFile();
  userName = getUsername();
  password = getPassword();

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
  public static String getUsername (){
  String uName;
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Enter your username: ");
  uName = keyboard.nextLine();
  return uName;
  }
  public static String getPassword (){
  String pWord;
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Enter your password: ");
  pWord = keyboard.nextLine();
  return pWord;
  }
}
