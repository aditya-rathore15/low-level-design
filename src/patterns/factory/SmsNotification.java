package patterns.factory;

public class SmsNotification implements Notification {

    @Override
    public void send() {
        System.out.println("SMS Notification");
    }
}
