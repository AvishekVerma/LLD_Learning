package designPatterns.adapter;

public class PhonePe {

    private BankAPIAdapter bankAPI;

    public PhonePe(BankAPIAdapter bankAPI){
        this.bankAPI = bankAPI;
    }

    double doSomething() throws InterruptedException{
        double currentBanlance = bankAPI.getBalance("accountNumber");
        Thread.sleep(25*24*60*60*1000);
        return currentBanlance*2;
    }
}
