package processor.Output.Action.Action10;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class PrintReceipt extends Action {
    public PrintReceipt(DataStore ds) {
        super(ds);
    }

    abstract public void printReceipt();
}
