package designPattern.behavior.command;

public class Account {
    private String name;

    public Account() {
    }
    public Account withName(String name){
        this.name=name;
        return this;
    }

    @Override
    public String toString() {
        return "Account: " +
                "name='" + name + '\'' +
                '.';
    }
}
