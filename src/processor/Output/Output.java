package processor.Output;

import abstractFactory.GasPumpFactory;

public class Output {
    GasPumpFactory gpf;

    public Output(GasPumpFactory gpf){
        this.gpf = gpf;
    }

    public void StorePrices(){      // Meta-Action 1
        this.gpf.createStorePrices().storePrices();
    }
    public void PayMsg(){
        this.gpf.createPayMsg().payMsg();
    }
    public void StoreCash(){
        this.gpf.createStoreCash().storeCash();
    }
    public void DisplayMenu(){
        this.gpf.createDisplayMenu().displayMenu();
    }
    public void RejectMsg(){
        this.gpf.createRejectMsg().rejectMsg();
    }
    public void SetPrice(int g){
        this.gpf.createSetPrice().setPrice(g);
    }
    public void SetInitialValues(){
        this.gpf.createSetInitialValues().setInitialValues();
    }
    public void PumpGasUnit(){
        this.gpf.createPumpGasUnit().pumpGasUnit();
    }
    public void GasPumpedMsg(){
        this.gpf.createGasPumpedMsg().gasPumpedMsg();
    }
    public void PrintReceipt(){
        this.gpf.createPrintReceipt().printReceipt();
    }
    public void CancelMsg(){
        this.gpf.createCancelMsg().cancelMsg();
    }
    public void ReturnCash(){
        this.gpf.createReturnCash().returnCash();
    }
    public void SetPayType(int t){
        this.gpf.createSetPayType().setPayType(t);
    }
    public void EjectCard(){
        this.gpf.createEjectCard().ejectCard();
    }
}
