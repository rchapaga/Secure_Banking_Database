package firstjavadbprogram;

/**
 *
 * @author archanbhattarai
 */
public class UserAccount {
    private String userName;
    private String password;
    private double savingsBalance;
    private double checkingBalance = 0;
    private double creditBalance = 500; 
    private String firstName;
    private String lastName; 
    private String dateOfBirth;
    private String SSN;
    
    public UserAccount(double balance, String firstName, String lastName,
            String dateOfBirth, String SSN) {
        this.savingsBalance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.SSN = SSN;
    }
 
    //Accessors
    public String getUserName() {
        return this.userName;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public String getSocialSN() {
        return this.SSN;
    }
    
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getCreditBalance() {
        return this.creditBalance;
    }
    
    //Mutators
    public void setIdint (String newUsername) {
        this.userName = newUsername;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setSocialSN(String SSN) {
        this.SSN = SSN ;
    }
    
    public void setSavingsBalance (double newBalance) {
        this.savingsBalance = newBalance;
    }
     
    public void depositSavings (double amount) {
        this.savingsBalance +=amount; 
    }

    public void depositChecking (double amount) {
        this.checkingBalance +=amount; 
    }

    public void transferToChecking (double amount) {
        this.savingsBalance -= amount;
        this.checkingBalance += amount;
    }

    public void transferToSavings (double amount) {
        this.savingsBalance += amount;
        this.checkingBalance -= amount;
    }

    public void creditPaymentSavings(double amount) {
        this.savingsBalance -= amount;
        this.creditBalance -= amount;
    }

    public void creditPaymentChecking(double amount) {
        this.checkingBalance -= amount;
        this.creditBalance -= amount;
    }
    
}
