## Patron de diseño BRIDGE

El objetivo de este pratron es poder simular canales de pago para diferentes entidades financieras desde un dispositivo Datafece que hereda un funcionamiento de un dispositivo generico.

**Ejecución consumo canales de pago**
```bash
$ java -jar target/uisrael-bridge.jar 
----------------------------------------------------------------
----------- BALANCE MOCK -------------------------------
BANK        :YELLOW_BANK
CARD NUMBER :0000054321
CARD BALANCE:678.0

BANK        :BLUE_BANK
CARD NUMBER :0000012345
CARD BALANCE:345.0

BANK        :ORANGE_BANK
CARD NUMBER :0000067890
CARD BALANCE:1000.0
----------------------------------------------------------------



-----------------------------------------------------------------
-----------DÉBITO COMPRA MOCHILLA $50 BLUE_BANK------------------
CARD NUMBER : 0000012345
PAGO REALIZADO CON ÉXITO
-----------Débito compra ropa $200 YELLOW_BANK------------------
CARD NUMBER : 0000012345
PAGO RECHAZADO
-----------Débito compra ropa $200 ORANGE_BANK------------------
CARD NUMBER : 0000054321
PAGO RECHAZADO
----------------------------------------------------------------


----------------------------------------------------------------
----------- BALANCE MOCK -------------------------------
BANK        :YELLOW_BANK
CARD NUMBER :0000054321
CARD BALANCE:678.0

BANK        :BLUE_BANK
CARD NUMBER :0000012345
CARD BALANCE:295.0

BANK        :ORANGE_BANK
CARD NUMBER :0000067890
CARD BALANCE:1000.0
----------------------------------------------------------------


```