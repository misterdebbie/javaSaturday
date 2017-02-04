import java.util.Scanner;
//class definition for validating user input

public class ErrorCheck{
 private String textInput;
 private double decimalInput;
 private int intInput;

 public ErrorCheck(){
  textInput = " ";
  decimalInput = 0.0;
  intInput = 0;
 }

 private void setText(String textTest){
 textInput = textTest;
 }
 private void setDecimal(double decimalTest){
 decimalInput = decimalTest;
 }
 private void setInt(int intTest){
 intInput = intTest;
 }
 private String checkDay(String textTest){
 boolean check = false;
 Scanner keyboard =  new Scanner (System.in);
 switch (textTest){
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
    return textTest;
 }

}
