package processor.Output.Action.Action8;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class PumpGasUnit extends Action {
    public PumpGasUnit(DataStore ds) {
        super(ds);
    }

    abstract public void pumpGasUnit();
}
