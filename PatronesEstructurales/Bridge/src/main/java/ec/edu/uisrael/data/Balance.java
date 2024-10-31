package ec.edu.uisrael.data;

import lombok.Data;

@Data
public class Balance {
    private String carNumber;
    private double balance;
    public Balance(String carNumber, double balance) {
        this.carNumber = carNumber;
        this.balance = balance;
    }
}
