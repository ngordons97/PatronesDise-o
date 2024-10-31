package ec.edu.uisrael.device;

import ec.edu.uisrael.channel.IChannel;

public class DataFaceDevice extends GenericDevice {
    public DataFaceDevice(){
        super();
    }

    public DataFaceDevice(IChannel channel) {
        super(channel);
    }
    public boolean sendPayment(String cardNumber,Double amount){
        Double balance = this.getBalance(cardNumber);
        if(balance==null || balance < amount){
            return false;
        }
        return this.setBalance(cardNumber,balance-amount);
    }
}
