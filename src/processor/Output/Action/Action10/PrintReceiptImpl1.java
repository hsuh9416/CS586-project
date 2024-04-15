package processor.Output.Action.Action10;

import dataStore.*;

public class PrintReceiptImpl1 extends PrintReceipt {
    public PrintReceiptImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public void printReceipt() {
        DataStore1 ds1 = (DataStore1) this.ds;
        System.out.printf("[Info] Total pumped liters: %d liters, Total price: $ %d", ds1.liter, ds1.total);
        if(ds1.w == 0){
            int remain = ds1.cash - ds1.total;
            System.out.printf(", Cash return: $ %d", remain);
        }
        System.out.println();
        System.out.println("[System] Successfully printed receipt! Remember to take your receipt before you leave!");
    }
}
