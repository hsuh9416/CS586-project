package processor.Output.Action.Action3;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class StoreCash extends Action {
    public StoreCash(DataStore ds) {
        super(ds);
    }

    abstract public void storeCash();
}
