package processor.Output.Action.Action5;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class RejectMsg extends Action {
    public RejectMsg(DataStore ds) {
        super(ds);
    }

    abstract public void rejectMsg();
}
