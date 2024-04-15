package processor.Output.Action.Action7;

import dataStore.*;

public class SetInitialValuesImpl2 extends SetInitialValues {
    public SetInitialValuesImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void setInitialValues() {
        DataStore2 ds2 = (DataStore2) this.ds;
        ds2.gallon = 0;
        ds2.total = 0;
        System.out.println("[System] Initialization Successful!");
        System.out.printf("[Info] Current amount of pumped gas: %d gallon\n", ds2.gallon);
        System.out.printf("[Info] Current amount of payment: $%f \n", ds2.total);
    }
}
