package processor.Output.Action.Action14;

import dataStore.DataStore;

public class EjectCardImpl extends EjectCard {
    public EjectCardImpl(DataStore ds) {
        super(ds);
    }

    @Override
    public void ejectCard() {
        System.out.println("[System] Card has ejected. Please remember to take your card.");
    }
}
