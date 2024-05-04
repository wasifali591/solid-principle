/**
 * Here we have an interface NotificationService that defines the behavior of a
 * notification service. We have two implementations of the NotificationService
 * interface: EmailNotificationService and SMSNotificationService. The
 * NotificationManager class is a high-level module that depends on the
 * NotificationService abstraction. It has a constructor that injects an
 * instance of NotificationService, and it uses this service to send
 * notifications.
 * In the main method, we create instances of NotificationService
 * implementations (EmailNotificationService and SMSNotificationService), and we
 * create instances of NotificationManager with these services. This way, the
 * NotificationManager class depends on abstractions (NotificationService), and
 * the details of the notification service implementations are decoupled from
 * the NotificationManager. This adheres to the Dependency Inversion Principle
 * (DIP).
 * 
 * @author wasif
 * @version 1.0
 * @since 04/05/2024
 */

// Interface defining the behavior of a notification service
interface NotificationService {
    void sendNotification(String message);
}

// Implementation of email notification service
class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

// Implementation of SMS notification service
class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

// High-level module that depends on NotificationService abstraction
class NotificationManager {
    private NotificationService notificationService;

    // Constructor injection to set the notification service
    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // Method to send notification using the injected notification service
    public void sendNotification(String message) {
        notificationService.sendNotification(message);
    }
}

// Main class containing the entry point of the program
public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        // Create instances of notification services
        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SMSNotificationService();

        // Create NotificationManager instances with different notification services
        NotificationManager emailManager = new NotificationManager(emailService);
        NotificationManager smsManager = new NotificationManager(smsService);

        // Use NotificationManagers to send notifications
        emailManager.sendNotification("Hello! This is an email notification.");
        smsManager.sendNotification("Hello! This is an SMS notification.");
    }
}