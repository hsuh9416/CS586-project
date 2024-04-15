package processor.Output.Action.Action4;

import dataStore.*;

public class DisplayMenuImpl1 extends DisplayMenu {
    public DisplayMenuImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void displayMenu() {
        DataStore1 ds1 = (DataStore1) this.ds;
        System.out.println("[System] Thank you for choosing our service!");
        if(ds1.w == 0){
            System.out.println("[Info] Your selected payment: CASH");
            System.out.printf("[Info] Cash inserted: $ %d\n", ds1.cash);
        }
        else System.out.println("[Info] Your selected payment: CREDIT");
        System.out.printf("[Info] Gas price: $ %d / liter\n", ds1.price);
        System.out.println("[System] Please select 'StartPump' to process and 'Cancel' to cancel!");
    }
}
