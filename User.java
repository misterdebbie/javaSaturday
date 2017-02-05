//User class for savings tracker

public class User {
//declare fields
  private String name;
  private String password;
  private String filename;
  //private String filenameOld;

//constructor
//@param userName for user name
//@param userPword for user password
//@param fname for a new filename
//@param fnameOld for an existing filename

  public User (String name, String password, String filename){
   this.name = name;
   this.password = password;
   this.filename = filename;
   //filenameOld = fnameOld;
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
  //set the existing filename
  /*public void setfilenameOld(String fnameOld){
    filenameOld = fnameOld;
  }*/
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
    //get the existing filename
    /*public String getfilenameOld(){
      return filenameOld;
    }*/

}
