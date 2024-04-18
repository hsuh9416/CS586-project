package processor.Output.Action.Action11;

import dataStore.DataStore;

public class CancelMsgImpl1 extends CancelMsg {
    public CancelMsgImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void cancelMsg() {
        System.out.println("[SYSTEM] Transaction cancelled. Please re-start!");
    }
}
