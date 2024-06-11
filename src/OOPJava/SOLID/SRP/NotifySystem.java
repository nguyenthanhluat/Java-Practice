package OOPJava.SOLID.SRP;

public class NotifySystem {
    public static void notify(Account account, NotifyType notifyType){
        switch (notifyType){
            case EMAIL:
                System.out.println("Notify via email: " + account.getName() + " balance is " + account.getBalance());
                break;
            case SMS:
                System.out.println("Notify via sms: " + account.getName() + " balance is " + account.getBalance());
                break;
        }
    }
}
