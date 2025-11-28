package Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String username1;
        String password1;

        String username2 = "Rezwan";
        String password2 = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username: ");
        username1 = sc.next();

        System.out.println("Enter password: ");
        password1 = sc.next();

        Details ob = new Details(username1, password1);

        // Check both
        if(ob.userName.equals(username2) && ob.password.equals(password2)){
            System.out.println("Login Successful.");
        }
        else {
            if(!ob.userName.equals(username2)){
                System.out.println("Incorrect username");
            }
            if(!ob.password.equals(password2)){
                System.out.println("Incorrect password");
            }
        }
    }
}
