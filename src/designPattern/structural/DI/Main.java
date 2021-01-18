package designPattern.structural.DI;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        MessageService phoneMessageService=new PhoneMessageService();
        MessageService mailMessageService=new MailMessageService();
        user.addMessageService(phoneMessageService);
        user.addMessageService(mailMessageService);
        user.addMessageService(new AppMessageService());
        user.sendMessage("Hi, this is a message");
    }
}
