package designPattern.behavior.command;

public class RemoveAccount implements Command<Account> {
    private AccountManager accountManager;

    public RemoveAccount(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public void execute(Account account) {
        accountManager.removeAccount(account);
    }
}
