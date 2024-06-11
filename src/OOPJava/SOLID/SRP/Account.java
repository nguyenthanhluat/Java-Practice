package OOPJava.SOLID.SRP;

public class Account {
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    private String name;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
        System.out.println("Created a account with balance is " + balance);
    }

    public void printBalance(){
        System.out.println("Name: " + name + " Account balance: " + balance);
    }
}
