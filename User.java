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

  public User (String userName, String userPword, String fname){
   name = userName;
   password = userPword;
   filename = fname;
   //filenameOld = fnameOld;
  }
//set the user name
  public void setName(String userName){
    name = userName;
  }
  //set the user password
  public void setPassword(String userPword){
    password = userPword;
  }
  //set the  new filename
  public void setFilename(String fname){
    filename = fname;
  }
  //set the existing filename
  /*public void setfilenameOld(String fnameOld){
    filenameOld = fnameOld;
  }*/
  //get the user name
    public String getName(){
      return name;
    }
    //get the user password
    public String getPassword(){
      return password;
    }
    //get the new filename
    public String getFilename(){
      return filename;
    }
    //get the existing filename
    /*public String getfilenameOld(){
      return filenameOld;
    }*/

}
