package ec.edu.uisrael.device;

import ec.edu.uisrael.channel.IChannel;

public class GenericDevice {
    protected IChannel channel;
    public GenericDevice(IChannel channel) {
        this.channel = channel;
    }
    public Double getBalace(String cardNumber){
        return channel.getBalance(cardNumber);
    }
    public Boolean setBalace(String cardNumber,Double amount){
        return channel.setBalance(cardNumber,amount);
    }
    public Double getCard(String cardNumber){
        return channel.getCardByNumber(cardNumber);
    }
}
