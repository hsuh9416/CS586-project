package processor.Output.Action;

import dataStore.DataStore;

public abstract class Action {
    public DataStore ds;

    public Action(DataStore ds){
        this.ds = ds;
    }
}
