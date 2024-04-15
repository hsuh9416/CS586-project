package processor.Output.Action.Action4;

import dataStore.*;

public class DisplayMenuImpl2 extends DisplayMenu {
    public DisplayMenuImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void displayMenu() {
        DataStore2 ds2 = (DataStore2) this.ds;
        System.out.println("[System] Thank you for choosing our service!");
        System.out.printf("[Info] Cash inserted: $ %d\n", ds2.cash);
        System.out.println("[System] Please select GAS TYPE to process and 'Cancel' to cancel!");
        System.out.println("[Info] Current available services:");
        System.out.printf("\tRegular: $ %f / gallon, Premium: $ %f / gallon, Diesel: $ %f / gallon\n",
                ds2.Rprice, ds2.Pprice, ds2.Dprice);
    }
}
