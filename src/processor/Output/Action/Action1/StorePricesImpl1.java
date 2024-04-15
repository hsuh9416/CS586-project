package processor.Output.Action.Action1;

import dataStore.*;

public class StorePricesImpl1 extends StorePrices {

    public StorePricesImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void storePrices() {
        DataStore1 ds1 = (DataStore1) this.ds;
        ds1.price = ds1.temp_a;
        System.out.println("[System] Gas Price has updated.");
    }
}
