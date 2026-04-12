package designPatterns.adapter;

import designPatterns.adapter.thirdparty.icicibank.IciciBankAPI;

public class ICICIBankAPIAdpter implements BankAPIAdapter{

    private IciciBankAPI iciciBankAP = new IciciBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
