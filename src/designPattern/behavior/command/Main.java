package designPattern.behavior.command;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        AddAccount addAccount = new AddAccount(accountManager);
        RemoveAccount removeAccount=new RemoveAccount(accountManager);

        Account james = new Account().withName("James");
        Account henry = new Account().withName("Henry");
        Account lira = new Account().withName("Lira");
        addAccount.execute(james);
        addAccount.execute(henry);
        addAccount.execute(lira);
        System.out.println(accountManager.getAccounts());

        removeAccount.execute(james);
        System.out.println(accountManager.getAccounts());
    }
}
