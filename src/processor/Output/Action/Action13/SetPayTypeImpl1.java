package processor.Output.Action.Action13;

import dataStore.*;

public class SetPayTypeImpl1 extends SetPayType {
    public SetPayTypeImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void setPayType(int t) {
        DataStore1 ds1 = (DataStore1) this.ds;
        ds1.w = t;
        System.out.printf("[System] Your payment type has successfully set as: %s", (t == 0) ? "Cash": "Credit");
    }
}
