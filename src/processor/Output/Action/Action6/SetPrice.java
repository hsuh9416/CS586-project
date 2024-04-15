package processor.Output.Action.Action6;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class SetPrice extends Action {
    public SetPrice(DataStore ds) {
        super(ds);
    }

    abstract public void setPrice(int g);
}
