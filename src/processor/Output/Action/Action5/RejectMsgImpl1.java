package processor.Output.Action.Action5;

import dataStore.DataStore;

public class RejectMsgImpl1 extends RejectMsg {
    public RejectMsgImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void rejectMsg() {
        System.out.println("[System] The payment has rejected. Please try another method!");
    }
}
