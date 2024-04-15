package processor.Output;

import abstractFactory.GasPumpFactory;

public class Output {
    GasPumpFactory gpf;

    public Output(GasPumpFactory gpf){
        this.gpf = gpf;
    }

    public void storePrices(){      // Meta-Action 1
        this.gpf.createStorePrices().storePrices();
    }
    public void payMsg(){
        this.gpf.createPayMsg().payMsg();
    }
    public void storeCash(){
        this.gpf.createStoreCash().storeCash();
    }
    public void displayMenu(){
        this.gpf.createDisplayMenu().displayMenu();
    }
    public void rejectMsg(){
        this.gpf.createRejectMsg().rejectMsg();
    }
    public void setPrice(int g){
        this.gpf.createSetPrice().setPrice(g);
    }
    public void setInitialValues(){
        this.gpf.createSetInitialValues().setInitialValues();
    }
    public void pumpGasUnit(){
        this.gpf.createPumpGasUnit().pumpGasUnit();
    }
    public void gasPumpedMsg(){
        this.gpf.createGasPumpedMsg().gasPumpedMsg();
    }
    public void printReceipt(){
        this.gpf.createPrintReceipt().printReceipt();
    }
    public void cancelMsg(){
        this.gpf.createCancelMsg().cancelMsg();
    }
    public void returnCash(){
        this.gpf.createReturnCash().returnCash();
    }
    public void setPayType(int t){
        this.gpf.createSetPayType().setPayType(t);
    }
    public void ejectCard(){
        this.gpf.createEjectCard().ejectCard();
    }
}
