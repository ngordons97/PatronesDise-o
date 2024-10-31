package ec.edu.uisrael.channel;

public class YellowChannel implements IChannel {
    @Override
    public Double getCardByNumber(String cardNumber) {
        return 0.0;
    }

    @Override
    public Double getBalance(String cardNumber) {
        return 0.0;
    }

    @Override
    public Boolean setBalance(String cardNumber, Double amount) {
        return true;
    }
}
