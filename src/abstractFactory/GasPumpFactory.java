package abstractFactory;

import dataStore.DataStore;
import processor.Output.Action.Action1.StorePrices;
import processor.Output.Action.Action10.PrintReceipt;
import processor.Output.Action.Action11.CancelMsg;
import processor.Output.Action.Action12.ReturnCash;
import processor.Output.Action.Action13.SetPayType;
import processor.Output.Action.Action14.EjectCard;
import processor.Output.Action.Action2.PayMsg;
import processor.Output.Action.Action3.StoreCash;
import processor.Output.Action.Action4.DisplayMenu;
import processor.Output.Action.Action5.RejectMsg;
import processor.Output.Action.Action6.SetPrice;
import processor.Output.Action.Action7.SetInitialValues;
import processor.Output.Action.Action8.PumpGasUnit;
import processor.Output.Action.Action9.GasPumpedMsg;

public abstract class GasPumpFactory {
    DataStore ds;

    public GasPumpFactory(DataStore ds){
        this.ds = ds;
    }
    public abstract StorePrices createStorePrices();            // Action1
    public abstract PayMsg createPayMsg();                      // Action2
    public abstract StoreCash createStoreCash();                // Action3
    public abstract DisplayMenu createDisplayMenu();            // Action4
    public abstract RejectMsg createRejectMsg();                // Action5
    public abstract SetPrice createSetPrice();                  // Action6
    public abstract SetInitialValues createSetInitialValues();  // Action7
    public abstract PumpGasUnit createPumpGasUnit();            // Action8
    public abstract GasPumpedMsg createGasPumpedMsg();          // Action9
    public abstract PrintReceipt createPrintReceipt();          // Action10
    public abstract CancelMsg createCancelMsg();                // Action11
    public abstract ReturnCash createReturnCash();              // Action12
    public abstract SetPayType createSetPayType();              // Action13
    public abstract EjectCard createEjectCard();                // Action14
}
