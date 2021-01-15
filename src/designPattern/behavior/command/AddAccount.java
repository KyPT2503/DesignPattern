package designPattern.behavior.command;

public class AddAccount implements Command<Account> {
    private AccountManager accountManager;

    public AddAccount(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public void execute(Account account) {
        accountManager.addAccount(account);
    }
}
