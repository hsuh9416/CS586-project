package processor.Output.Action.Action9;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class GasPumpedMsg extends Action {
    public GasPumpedMsg(DataStore ds) {
        super(ds);
    }

    abstract public void gasPumpedMsg();
}
