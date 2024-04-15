package processor.Output.Action.Action12;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class ReturnCash extends Action {
    public ReturnCash(DataStore ds) {
        super(ds);
    }

    abstract public void returnCash();
}
