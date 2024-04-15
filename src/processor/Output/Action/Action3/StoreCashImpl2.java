package processor.Output.Action.Action3;

import dataStore.*;

public class StoreCashImpl2 extends StoreCash {
    public StoreCashImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void storeCash() {
        DataStore2 ds2 = (DataStore2) this.ds;
        ds2.cash = ds2.temp_cash;
        System.out.println("[System] Cash received.");
    }
}
