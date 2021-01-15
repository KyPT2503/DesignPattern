package designPattern.behavior.command;

public interface Command<E> {
    void execute(E account);
}
