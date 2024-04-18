package processor.Output.Action.Action6;

import dataStore.*;

public class SetPriceImpl2 extends SetPrice {
    public SetPriceImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void setPrice(int g) {
        DataStore2 ds2 = (DataStore2) this.ds;
        if (g == 0){
            ds2.price = ds2.Rprice;
            System.out.print("[Info] Selected gas type = REGULAR");
        }
        else if (g == 1) {
            ds2.price = ds2.Pprice;
            System.out.print("[Info] Selected gas type = PREMIUM");
        }
        else {
            ds2.price = ds2.Dprice;
            System.out.print("[Info] Selected gas type = DIESEL");
        }
        System.out.printf(", Selected gas price = $%f / gallon\n", ds2.price);
    }
}
