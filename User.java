//User class for savings tracker

public class User {
//declare instance fields
  private String name;
  private String password;
  private String filename;

//constructor
//@param name for user name
//@param password for user password
//@param filename for a new filename

  public User (String name, String password, String filename){
   this.name = name;
   this.password = password;
   this.filename = filename;
  }
  //constructor without arguments
  public User (){
   name = " ";
   password = " ";
   filename = " ";
  }
//set the user name
  public void setName(String name){
    this.name = name;
  }
  //set the user password
  public void setPassword(String password){
    this.password = password;
  }
  //set the  new filename
  public void setFilename(String filename){
    this.filename = filename;
  }
  //get the user name
    public String getName(){
      return this.name;
    }
    //get the user password
    public String getPassword(){
      return this.password;
    }
    //get the new filename
    public String getFilename(){
      return this.filename;
    }
}
