package processor.Output.Action.Action1;

import dataStore.*;

public class StorePricesImpl2 extends StorePrices {
    public StorePricesImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void storePrices() {
        DataStore2 ds2 = (DataStore2) this.ds;
        ds2.Rprice = ds2.temp_a;
        ds2.Pprice = ds2.temp_b;
        ds2.Dprice = ds2.temp_c;
        System.out.println("[System] Gas Prices have updated.");
    }
}
