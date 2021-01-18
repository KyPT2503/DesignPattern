package designPattern.structural.DI;

import designPattern.structural.DI.MessageService;

public class MailMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent to your Mail: " + message);
    }
}
