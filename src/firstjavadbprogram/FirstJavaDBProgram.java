package firstjavadbprogram;

import java.sql.*;
import java.util.Scanner;

public class FirstJavaDBProgram {
    static final String url = "jdbc:mysql://localhost:3306/secureBanking";
    static final String databaseusername = "samrat";
    static final String databasepassword = "passw0rd";
    static final String fetchLoginInfo = "SELECT * FROM loginInfo WHERE"
            + " username=";
  
    public static void main(String[] args) {
        System.out.println("Initializing...");
        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, databaseusername, databasepassword)) {
            System.out.println("Database connected!");
            System.out.println("\nStarting Secure Banking... ");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
        
        
        Scanner input = new Scanner(System.in);
        int input1 = welcome(input);
        int input2 = 0;
        
        if(input1 == 2){ // if Log In
            input2 = logIn(input);
        }
        
        else {
            createAccount();
        }
        
        if (input2 == 1) { // if customer Log In
            customerLogIn(input);
        }
        else { // if clerk Log In
            clerkLogIn();
        }
    }
    
    static int welcome(Scanner input) {
        System.out.println("**********************************************************");
        System.out.println("\n\n******** Welcome to Secure Banking **********");
        System.out.println("Please choose an option from below to start.");
        System.out.println("\t1.Create a New Account [Currently Unavailable]");
        System.out.println("\t2.Log In");
        System.out.print("\t=>");
        int input1 = input.nextInt();
        return input1;
    }
    
    static void createAccount(){
        System.out.println("\n\t*** CREATE ACCOUNT ***");
        Scanner input = new Scanner (System.in);
        
        
    }
    
    static int logIn(Scanner input){
        System.out.println("\n\t*** LOG IN ***");
        System.out.println("Please Select from the option below: ");
        System.out.println("\t1.Customer Log In");
        System.out.println("\t2.Clerk Log In");
        System.out.print("\t=>");
        int input2 = input.nextInt();
        return input2;
    }
    
    static void customerLogIn(Scanner input){
        Scanner input1= new Scanner(System.in);
        String userName, password;
        System.out.println("\n\t*** CUSTOMER LOG IN ***");
        System.out.print("Username: ");
        userName = input1.nextLine();
        System.out.print("Password:");
        password = input1.nextLine();
        String SSN = "";
        try (Connection connection = DriverManager.getConnection(url, databaseusername, databasepassword)) {
            Statement myStmt = connection.createStatement();
            System.out.println("Here"+fetchLoginInfo+"'"+userName+"'");
            ResultSet fetchedInfo = myStmt.executeQuery(fetchLoginInfo+"'"+userName+"'");
            while(fetchedInfo.next()){
                if((fetchedInfo.getString("password")).equals(password) ){ 
                    System.out.println("Log In Successful!");
                    SSN = fetchedInfo.getString("SSN");
                }
            }
            bankingSystem(SSN);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to the database!", e);
        }
        
    }
    
    static void bankingSystem(String SSN){
        Scanner input = new Scanner(System.in);
        System.out.println("\n*** Home ***");
        System.out.println("\t");
        System.out.println("\t");
        System.out.println("\t");
        System.out.println("\t");
        System.out.println("\t");
        System.out.println("\t");
        System.out.println("\t");
    }
    
    static void clerkLogIn() {
        System.out.println("\n\t*** CLERK LOG IN ***");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
