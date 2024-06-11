package OOPJava.SOLID.SRP;

public class SRPPractice {
    public static void testSRP(){
        Account account = new Account("Nam", 1000);
        NotifySystem.notify(account, NotifyType.SMS);

        AccountOperator.add(account, 500);
        NotifySystem.notify(account, NotifyType.SMS);

        AccountOperator.sub(account, 300);
        NotifySystem.notify(account, NotifyType.EMAIL);
    }
}
