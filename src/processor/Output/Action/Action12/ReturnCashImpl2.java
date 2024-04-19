package processor.Output.Action.Action12;

import dataStore.*;

public class ReturnCashImpl2 extends ReturnCash {
    public ReturnCashImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void returnCash() {
        DataStore2 ds2 = (DataStore2) this.ds;
        float rCash = (ds2.cash > 0) ? ds2.cash : ds2.temp_cash;
        float remain = ds2.cash - ds2.total;
        System.out.println("[System] Remainder has been returned. Please remember to take your cash!");
        System.out.printf("[Info] Cash returned: $ %f\n", remain);
    }
}
