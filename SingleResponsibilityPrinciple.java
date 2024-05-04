/**
 * The EmailService class has a single responsibility: sending emails. It
 * contains a method sendEmail that takes parameters for the recipient's email
 * address, the subject, and the body of the email, and then sends the email.
 * There are no other responsibilities, such as formatting the email content or
 * managing email addresses, within this class. This adheres to the Single
 * Responsibility Principle (SRP), as the class has only one reason to change:
 * if there are changes related to sending emails.
 * 
 * @author wasif
 * @version 1.0
 * @since 04/05/2024
 */

// Class representing an EmailService responsible for sending emails
class EmailService {

    // Method to send an email with the given recipient, subject, and body
    public void sendEmail(String recipient, String subject, String body) {
        // Code to send email...
        System.out.println("Email sent to " + recipient + " with subject: " + subject);
        System.out.println("Body: " + body);
    }

    // Other email-related methods can go here...

}

public class SingleResponsibilityPrinciple {
    // Main method to test the EmailService class
    public static void main(String[] args) {
        // Create an instance of EmailService
        EmailService emailService = new EmailService();

        // Call the sendEmail method to send a test email
        emailService.sendEmail("example@example.com", "Hello", "This is a test email.");
    }

}