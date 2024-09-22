package data;

public class User {
    public String firstName;
    public String lastName;
    public String bankAccountNumber;
    public int check;

    public User(String firstName, String lastName, String bankAccountNumber, int check){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankAccountNumber = bankAccountNumber;
        this.check = check;
    }
}
