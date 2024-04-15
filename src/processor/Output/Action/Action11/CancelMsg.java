package processor.Output.Action.Action11;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class CancelMsg extends Action {
    public CancelMsg(DataStore ds) {
        super(ds);
    }

    abstract public void cancelMsg();
}
