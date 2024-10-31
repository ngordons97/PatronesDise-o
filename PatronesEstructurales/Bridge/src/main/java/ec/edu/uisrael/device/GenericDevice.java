package ec.edu.uisrael.device;

import ec.edu.uisrael.channel.IChannel;

public class GenericDevice {
    protected IChannel channel;
    public GenericDevice(){}
    public GenericDevice(IChannel channel) {
        this.channel = channel;
    }
    public void setChannel(IChannel channel) {
        this.channel = channel;
    }

    public Double getBalance(String cardNumber){
        return channel.getBalance(cardNumber);
    }
    public Boolean setBalance(String cardNumber,Double amount){
        return channel.setBalance(cardNumber,amount);
    }
    public Boolean getCard(String cardNumber){
        return channel.getCardByNumber(cardNumber);
    }
}
