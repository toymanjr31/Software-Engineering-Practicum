package pastpaperbank;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class User {
    int userID;
    String userName;
    public User(int newID, String newName){
        this.userID = newID;
        this.userName = newName;
    }
    public int getID(){
        return userID;
    }
    public String getName(){
        return userName;
    }
    public static void uploadFile(){
      try {
        File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                 System.out.println("File created: " + myObj.getName());
            } 
            else {
                System.out.println("File already exists.");
            }
        } 
      catch (IOException e) {
        System.out.println("An error occurred.");
        }
      
    }
    
}
