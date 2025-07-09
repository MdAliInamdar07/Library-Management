import java .util.*;

public class UserLogin {
    public static void main(String [] args){
        String username = "Ali inamdar";
        String pass = "ali#1823";
        String inuser = "" ;
        String inpass = "";
        Scanner sc = new Scanner(System.in);
        LibraryManager ob = new LibraryManager();

            while (true) {
                System.out.println("Enter the user name");
                inuser = sc.nextLine();
                if(inuser.equalsIgnoreCase(username)){
                    System.out.println("Please enter the password.(Enter \"exit\" to exit)");
                    break;
                }
                else{
                    System.out.println("Username not found. Try again");
                }
            }
            while(true){
                inpass = sc.nextLine();
                if(inpass.equals(pass)){
                    System.out.println("Logged In successfully");
                    ob.libMenu();
                }
                else if (inpass.equalsIgnoreCase("exit")) {
                    System.exit(0);

                } else{
                    System.out.println("Wrong password. Enter again...");
                }
            }
    }
}