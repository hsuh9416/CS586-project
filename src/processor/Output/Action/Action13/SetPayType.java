package processor.Output.Action.Action13;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class SetPayType extends Action {
    public SetPayType(DataStore ds) {
        super(ds);
    }

    abstract public void setPayType(int t);
}
