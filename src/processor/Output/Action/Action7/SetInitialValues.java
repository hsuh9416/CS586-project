package processor.Output.Action.Action7;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class SetInitialValues extends Action {
    public SetInitialValues(DataStore ds) {
        super(ds);
    }

    abstract public void setInitialValues();
}
