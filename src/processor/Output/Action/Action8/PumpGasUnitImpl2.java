package processor.Output.Action.Action8;

import dataStore.*;

public class PumpGasUnitImpl2 extends PumpGasUnit {
    public PumpGasUnitImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void pumpGasUnit() {
        DataStore2 ds2 = (DataStore2) this.ds;
        ds2.gallon++;
        ds2.total += ds2.price;
    }
}
