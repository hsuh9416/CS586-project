package processor.Output.Action.Action5;

import dataStore.DataStore;

public class RejectMsgImpl extends RejectMsg {
    public RejectMsgImpl(DataStore ds) {
        super(ds);
    }

    @Override
    public void rejectMsg() {
        System.out.println("[System] The payment has rejected. Please try another method!");
    }
}
