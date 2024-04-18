package processor.Output.Action.Action5;

import dataStore.DataStore;

public class RejectMsgImpl2 extends RejectMsg {
    public RejectMsgImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void rejectMsg() {
        // Now used in GasPump2
    }
}
