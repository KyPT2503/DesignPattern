package designPattern.structural.DI;

public class AppMessageService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent to your App: "+message);
    }
}
