package processor.Input;

import abstractFactory.GasPumpFactory;
import abstractFactory.GasPumpFactoryImpl2;
import dataStore.*;
import model.MDA_EFSM;

public class GasPump2 {
    MDA_EFSM m;
    DataStore ds;

    public GasPump2() {
        this.ds = new DataStore2();
        GasPumpFactory gpf = new GasPumpFactoryImpl2(this.ds);
        this.m = new MDA_EFSM(gpf);
    }

    public void Activate(float a, float b, float c){
        if((a>0)&&(b>0)&&(c>0)){
            DataStore2 ds2 = (DataStore2) this.ds;
            ds2.temp_a = a;
            ds2.temp_b = b;
            ds2.temp_c = c;
            this.m.Activate();
        }
    }

    public void Start(){
        m.Start();
    }

    public void PayCash(int c){
        if(c>0){
            DataStore2 ds2 = (DataStore2) this.ds;
            ds2.temp_cash = c;
            this.m.PayType(0);
        }
    }

    public void Cancel(){
        this.m.Cancel();
    }

    public void Regular(){
        this.m.SelectGas(0);
        this.m.Continue();
    }

    public void Premium(){
        this.m.SelectGas(1);
        this.m.Continue();
    }

    public void Diesel(){
        this.m.SelectGas(2);
        this.m.Continue();
    }

    public void StartPump(){
        this.m.StartPump();
    }

    public void PumpGallon(){
        DataStore2 ds2 = (DataStore2) this.ds;
        if(ds2.cash < ds2.price*(ds2.gallon + 1)){
            this.m.StopPump();
        }
        else this.m.Pump();
    }

    public void Stop(){
        this.m.StopPump();
    }

    public void Receipt(){
        this.m.Receipt();
    }

    public void NoReceipt(){
        this.m.NoReceipt();
    }
}
