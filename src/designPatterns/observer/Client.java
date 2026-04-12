package designPatterns.observer;

public class Client {

    public static void main(String[] args) {

        Flipkart flipkart = Flipkart.getInstance();
        EmailService emailService = new EmailService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        AnalyticsSender analyticsSender = new AnalyticsSender();

        flipkart.orderPlaced();
    }
}
