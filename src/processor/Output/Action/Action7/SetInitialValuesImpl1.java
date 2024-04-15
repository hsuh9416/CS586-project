package processor.Output.Action.Action7;

import dataStore.*;

public class SetInitialValuesImpl1 extends SetInitialValues {
    public SetInitialValuesImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void setInitialValues() {
        DataStore1 ds1 = (DataStore1) this.ds;
        ds1.liter = 0;
        ds1.total = 0;
        System.out.println("[System] Initialization Successful!");
        System.out.printf("[Info] Current amount of pumped gas: %d liter\n", ds1.liter);
        System.out.printf("[Info] Current amount of payment: $ %d \n", ds1.total);
    }
}
