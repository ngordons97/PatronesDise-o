package ec.edu.uisrael.channel;

import ec.edu.uisrael.data.Balance;
import ec.edu.uisrael.data.MockBalance;

public class YellowChannel implements IChannel {
    Balance balance;
    public YellowChannel() {
        this.balance = MockBalance.getInstance().getBalanceByKey("YELLOW_BANK");
    }
    @Override
    public Boolean getCardByNumber(String cardNumber) {
        return balance.getCarNumber().equals(cardNumber);
    }

    @Override
    public Double getBalance(String cardNumber) {
        if (balance.getCarNumber().equals(cardNumber)) {
            return balance.getBalance();
        }
        return null;
    }

    @Override
    public Boolean setBalance(String cardNumber, Double newBaDouble) {
        if (balance.getCarNumber().equals(cardNumber)) {
            balance.setBalance(newBaDouble);
            return true;
        }
        return false;
    }
}
