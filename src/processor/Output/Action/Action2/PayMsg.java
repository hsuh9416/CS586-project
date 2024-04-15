package processor.Output.Action.Action2;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class PayMsg extends Action {

    public PayMsg(DataStore ds) {
        super(ds);
    }

    abstract public void payMsg();
}
