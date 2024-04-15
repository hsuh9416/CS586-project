package processor.Output.Action.Action11;

import dataStore.DataStore;

public class CancelMsgImpl extends CancelMsg {
    public CancelMsgImpl(DataStore ds) {
        super(ds);
    }

    @Override
    public void cancelMsg() {
        System.out.println("[SYSTEM] Transaction cancelled. Please re-start!");
    }
}
