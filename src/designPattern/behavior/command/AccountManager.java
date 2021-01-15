package designPattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }
}
