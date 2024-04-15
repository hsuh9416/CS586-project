package processor.Output.Action.Action14;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class EjectCard extends Action {
    public EjectCard(DataStore ds) {
        super(ds);
    }

    abstract public void ejectCard();
}
