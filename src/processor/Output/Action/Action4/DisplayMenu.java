package processor.Output.Action.Action4;

import dataStore.DataStore;
import processor.Output.Action.Action;

public abstract class DisplayMenu extends Action {
    public DisplayMenu(DataStore ds) {
        super(ds);
    }

    abstract public void displayMenu();
}
