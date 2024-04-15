package processor.Output.Action.Action10;

import dataStore.*;

public class PrintReceiptImpl2 extends PrintReceipt {
    public PrintReceiptImpl2(DataStore ds) {
        super(ds);
    }

    @Override
    public void printReceipt() {
        DataStore2 ds2 = (DataStore2) this.ds;
        float remain = ds2.cash - ds2.total;
        System.out.printf("[Info] Total pumped liters: %d gallons, Total price: $ %f, Cash return: $ %f\n",
                ds2.gallon, ds2.total, remain);
        System.out.println("[System] Successfully printed receipt! Remember to take your receipt before you leave!");
    }
}
