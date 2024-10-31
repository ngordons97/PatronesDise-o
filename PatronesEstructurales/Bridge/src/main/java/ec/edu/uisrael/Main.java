package ec.edu.uisrael;

import ec.edu.uisrael.channel.BlueChannel;
import ec.edu.uisrael.channel.OrangeChannel;
import ec.edu.uisrael.channel.YellowChannel;
import ec.edu.uisrael.data.Balance;
import ec.edu.uisrael.data.MockBalance;
import ec.edu.uisrael.device.DataFaceDevice;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Boolean success;
        /*Inicializamosnuestra base  */
        MockBalance mockBalance = MockBalance.getInstance();
        printBalance(mockBalance.getBalance());
        System.out.println("\n\n");
        YellowChannel yellowChannel = new YellowChannel();
        BlueChannel blueChannel = new BlueChannel();
        OrangeChannel orangeChannel = new OrangeChannel();
        DataFaceDevice dataFace = new DataFaceDevice();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----------DÉBITO COMPRA MOCHILLA $50 BLUE_BANK------------------");
        dataFace.setChannel(blueChannel);
        success = dataFace.sendPayment("0000012345", 50.0);
        System.out.println("CARD NUMBER : 0000012345");
        System.out.println(success? "PAGO REALIZADO CON ÉXITO":"PAGO RECHAZADO");
        System.out.println("-----------Débito compra ropa $200 YELLOW_BANK------------------");
        dataFace.setChannel(yellowChannel);
        success = dataFace.sendPayment("0000012345", 200.0);
        System.out.println("CARD NUMBER : 0000012345");
        System.out.println(success? "PAGO REALIZADO CON ÉXITO":"PAGO RECHAZADO");
        System.out.println("-----------Débito compra ropa $200 ORANGE_BANK------------------");
        dataFace.setChannel(orangeChannel);
        success = dataFace.sendPayment("0000054321", 200.0);
        System.out.println("CARD NUMBER : 0000054321");
        System.out.println(success? "PAGO REALIZADO CON ÉXITO":"PAGO RECHAZADO");
        System.out.println("----------------------------------------------------------------\n\n");

        printBalance(mockBalance.getBalance());
    }
    private static void printBalance(HashMap<String,Balance> listBalance) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------- BALANCE MOCK -------------------------------");
        int last=listBalance.size();
        int it=1;
        listBalance.forEach((key, item)->{
            System.out.println("BANK        :" + key);
            System.out.println("CARD NUMBER :" + item.getCarNumber());
            System.out.println("CARD BALANCE:" + item.getBalance());
            if(!key.equals(listBalance.keySet().toArray()[last-1]))
                System.out.println("");
        });
        System.out.println("----------------------------------------------------------------");
    }
}