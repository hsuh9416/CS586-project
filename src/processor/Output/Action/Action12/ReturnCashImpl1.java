package processor.Output.Action.Action12;

import dataStore.*;

public class ReturnCashImpl1 extends ReturnCash {
    public ReturnCashImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void returnCash() {
        DataStore1 ds1 = (DataStore1) this.ds;
        if(ds1.w != 1){ // Only if not credit!
            int rCash = (ds1.cash > 0) ? ds1.cash : ds1.temp_c;
            int remain = rCash - ds1.total;
            System.out.println("[System] Remainder has been returned. Please remember to take your cash!");
            System.out.printf("[Info] Cash returned: $ %d\n", remain);
        }
    }
}
