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

public class GasPumpFactoryImpl1 extends GasPumpFactory {
    public GasPumpFactoryImpl1(DataStore ds) {
        super(ds);
    }

    @Override
    public StorePrices createStorePrices() {
        return new StorePricesImpl1(ds);
    }

    @Override
    public PayMsg createPayMsg() {
        return new PayMsgImpl1(ds);
    }

    @Override
    public StoreCash createStoreCash() {
        return new StoreCashImpl1(ds);
    }

    @Override
    public DisplayMenu createDisplayMenu() {
        return new DisplayMenuImpl1(ds);
    }

    @Override
    public RejectMsg createRejectMsg() {
        return new RejectMsgImpl(ds);
    }

    @Override
    public SetPrice createSetPrice() { // Not used in GasPump1
        return null;
    }

    @Override
    public SetInitialValues createSetInitialValues() {
        return new SetInitialValuesImpl1(ds);
    }

    @Override
    public PumpGasUnit createPumpGasUnit() {
        return new PumpGasUnitImpl1(ds);
    }

    @Override
    public GasPumpedMsg createGasPumpedMsg() {
        return new GasPumpedMsgImpl1(ds);
    }

    @Override
    public PrintReceipt createPrintReceipt() {
        return new PrintReceiptImpl1(ds);
    }

    @Override
    public CancelMsgImpl createCancelMsg() {
        return new CancelMsgImpl(ds);
    }

    @Override
    public ReturnCash createReturnCash() {
        return new ReturnCashImpl1(ds);
    }

    @Override
    public SetPayType createSetPayType() {
        return new SetPayTypeImpl1(ds);
    }

    @Override
    public EjectCard createEjectCard() {
        return new EjectCardImpl(ds);
    }
}
