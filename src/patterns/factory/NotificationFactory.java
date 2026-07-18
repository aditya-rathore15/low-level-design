package patterns.factory;

/*
Factory works because of polymorphism.

The factory returns the interface, while the actual object can be any implementation.

Compile Time            Runtime
----------------------------------------
Notification   ----->   EmailNotification
Notification   ----->   SmsNotification
Notification   ----->   PushNotification

Since the client only depends on the interface, new implementations can be added without changing the client.
 */

public class NotificationFactory {

    public Notification createNotification(String type) {
        if(type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        }

        if(type.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        }

        throw new IllegalArgumentException("Illegal Notification Type");
    }
}
