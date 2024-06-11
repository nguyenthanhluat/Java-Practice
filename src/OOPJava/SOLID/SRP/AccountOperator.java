package OOPJava.SOLID.SRP;

public class AccountOperator {
    public static void add(Account account,int amount){
        account.setBalance(account.getBalance() + amount);
    }

    public static void sub(Account account, int amount){
        account.setBalance(account.getBalance() - amount);
    }
}
