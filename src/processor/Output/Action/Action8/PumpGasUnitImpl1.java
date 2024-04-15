package processor.Output.Action.Action8;

import dataStore.*;

public class PumpGasUnitImpl1 extends PumpGasUnit {
    public PumpGasUnitImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void pumpGasUnit() {
        DataStore1 ds1 = (DataStore1) this.ds;
        ds1.liter++;
        ds1.total += ds1.price;
    }
}
