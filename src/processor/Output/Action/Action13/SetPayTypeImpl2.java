package processor.Output.Action.Action13;

import dataStore.DataStore;

public class SetPayTypeImpl2 extends SetPayType {
    public SetPayTypeImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void setPayType(int t) {
       // No further transaction for GasPump2
    }
}
