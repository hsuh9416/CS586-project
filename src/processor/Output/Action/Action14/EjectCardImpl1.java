package processor.Output.Action.Action14;

import dataStore.DataStore;

public class EjectCardImpl1 extends EjectCard {
    public EjectCardImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void ejectCard() {
        System.out.println("[System] Card has ejected. Please remember to take your card.");
    }
}
