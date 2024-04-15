package processor.Output.Action.Action3;

import dataStore.*;

public class StoreCashImpl1 extends StoreCash {
    public StoreCashImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void storeCash() {
        DataStore1 ds1 = (DataStore1) this.ds;
        ds1.cash = ds1.temp_c;
        System.out.println("[System] Cash received.");
    }
}
