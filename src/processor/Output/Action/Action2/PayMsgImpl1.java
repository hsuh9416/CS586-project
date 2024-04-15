package processor.Output.Action.Action2;

import dataStore.DataStore;

public class PayMsgImpl1 extends PayMsg {
    public PayMsgImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void payMsg() {
        System.out.println("[System] Please insert cash or credit card to process.");
    }
}
