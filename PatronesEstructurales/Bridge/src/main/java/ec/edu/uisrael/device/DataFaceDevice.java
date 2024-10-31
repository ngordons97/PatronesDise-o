package ec.edu.uisrael.device;

import ec.edu.uisrael.channel.IChannel;

public class DataFaceDevice extends GenericDevice {
    public DataFaceDevice(IChannel channel) {
        super(channel);
    }
    public boolean sendPayment(String cardNumber,Double amount){
        double balance = this.getBalace(cardNumber);
        if(balance < amount){
            return false;
        }
        this.setBalace(cardNumber,balance-amount);

    }
}
