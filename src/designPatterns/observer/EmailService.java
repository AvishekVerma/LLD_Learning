package designPatterns.observer;

public class EmailService implements OrderPlacedSubscriber{

    public EmailService(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("Updating email");
        return null;
    }

    public void sendEmail(){
        System.out.println("Sending Email");
    }
}
