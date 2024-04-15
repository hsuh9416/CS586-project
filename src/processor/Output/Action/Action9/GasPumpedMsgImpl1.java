package processor.Output.Action.Action9;

import dataStore.*;

public class GasPumpedMsgImpl1 extends GasPumpedMsg {
    public GasPumpedMsgImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void gasPumpedMsg() {
        DataStore1 ds1 = (DataStore1) this.ds;
        System.out.printf("[Info] Gas Pumped: %d liters\n", ds1.liter);
    }
}
