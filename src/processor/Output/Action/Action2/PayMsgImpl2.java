package processor.Output.Action.Action2;

import dataStore.DataStore;

public class PayMsgImpl2 extends PayMsg {
    public PayMsgImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void payMsg() {
        System.out.println("[System] Please insert cash to process.");
    }
}
