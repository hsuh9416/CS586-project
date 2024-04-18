package processor.Output.Action.Action11;

import dataStore.DataStore;

public class CancelMsgImpl2 extends CancelMsg {
    public CancelMsgImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void cancelMsg() {
        System.out.println("[SYSTEM] Transaction cancelled. Please re-start!");
    }
}
