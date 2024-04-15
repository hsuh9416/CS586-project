package processor.Output.Action.Action9;

import dataStore.*;

public class GasPumpedMsgImpl2 extends GasPumpedMsg {
    public GasPumpedMsgImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void gasPumpedMsg() {
        DataStore2 ds2 = (DataStore2) this.ds;
        System.out.printf("[Info] Gas Pumped: %d gallons\n", ds2.gallon);
    }
}
