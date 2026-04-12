package designPatterns.observer;

public class AnalyticsSender implements OrderPlacedSubscriber, OrderCancelledSubscriber{

    public AnalyticsSender(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("Updating analytics");
        return null;
    }

    @Override
    public void announceOrderCancelled() {

    }
}
