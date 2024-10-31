package ec.edu.uisrael.data;

import java.security.PrivateKey;
import java.util.HashMap;
import java.util.List;

public class MockBalance {
    private static MockBalance instance;
    private HashMap<String, Balance> balance;
    public static MockBalance getInstance() {
        if (instance == null) {
            instance = new MockBalance();
            instance.buildMockBalance();
        }
        return instance;
    }
    private void buildMockBalance(){
        balance = new HashMap<>();
        balance.put("BLUE_BANK" ,new Balance("0000012345",345));
        balance.put("ORANGE_BANK" ,new Balance("0000067890",1000));
        balance.put("YELLOW_BANK" ,new Balance("0000054321",678));
    }

    public HashMap<String, Balance> getBalance() {
        return balance;
    }

    public Balance getBalanceByKey(String key) {
        return balance.get(key);
    }
}
