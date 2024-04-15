package processor.Output.Action.Action1;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class StorePrices extends Action {
    public StorePrices(DataStore ds) {
        super(ds);
    }

    abstract public void storePrices();
}
