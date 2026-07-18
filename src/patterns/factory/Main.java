package patterns.factory;

public class Main {
    public static void main(String[] args) {

        /*
          Before Factory:
          Client creates the concrete object.

          EmailNotification notification = new EmailNotification();
          notification.send();
         */

        /*
          After Factory:
          Client asks the factory for a Notification.
          The factory decides which implementation to create.
         */
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification("EMAIL");
        notification.send();
    }
}