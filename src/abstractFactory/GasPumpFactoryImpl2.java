package abstractFactory;

import dataStore.DataStore;
import processor.Output.Action.Action1.*;
import processor.Output.Action.Action10.*;
import processor.Output.Action.Action11.*;
import processor.Output.Action.Action12.*;
import processor.Output.Action.Action13.*;
import processor.Output.Action.Action14.*;
import processor.Output.Action.Action2.*;
import processor.Output.Action.Action3.*;
import processor.Output.Action.Action4.*;
import processor.Output.Action.Action5.*;
import processor.Output.Action.Action6.*;
import processor.Output.Action.Action7.*;
import processor.Output.Action.Action8.*;
import processor.Output.Action.Action9.*;

public class GasPumpFactoryImpl2 extends GasPumpFactory {
    public GasPumpFactoryImpl2(DataStore ds){
        super(ds);
    }

    @Override
    public StorePrices createStorePrices() {
        return new StorePricesImpl2(ds);
    }

    @Override
    public PayMsg createPayMsg() {
        return new PayMsgImpl2(ds);
    }

    @Override
    public StoreCash createStoreCash() {
        return new StoreCashImpl2(ds);
    }

    @Override
    public DisplayMenu createDisplayMenu() {
        return new DisplayMenuImpl2(ds);
    }

    @Override
    public RejectMsg createRejectMsg() { // Not used in GasPump2
        return new RejectMsgImpl2(ds);
    }

    @Override
    public SetPrice createSetPrice() {
        return new SetPriceImpl2(ds);
    }

    @Override
    public SetInitialValues createSetInitialValues() {
        return new SetInitialValuesImpl2(ds);
    }

    @Override
    public PumpGasUnit createPumpGasUnit() {
        return new PumpGasUnitImpl2(ds);
    }

    @Override
    public GasPumpedMsg createGasPumpedMsg() {
        return new GasPumpedMsgImpl2(ds);
    }

    @Override
    public PrintReceipt createPrintReceipt() {
        return new PrintReceiptImpl2(ds);
    }

    @Override
    public CancelMsg createCancelMsg() {
        return new CancelMsgImpl2(ds);
    }

    @Override
    public ReturnCash createReturnCash() {
        return new ReturnCashImpl2(ds);
    }

    @Override
    public SetPayType createSetPayType() { // Not used in GasPump2
        return new SetPayTypeImpl2(ds);
    }

    @Override
    public EjectCard createEjectCard() {  // Not used in GasPump2
        return new EjectCardImpl2(ds);
    }
}
