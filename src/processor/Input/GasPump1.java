package processor.Input;

import abstractFactory.GasPumpFactory;
import abstractFactory.GasPumpFactoryImpl1;
import dataStore.*;
import model.MDA_EFSM;

public class GasPump1 {

    MDA_EFSM m;
    DataStore ds;

    public GasPump1() {
        this.ds = new DataStore1();
        GasPumpFactory gpf =new GasPumpFactoryImpl1(this.ds);
        this.m = new MDA_EFSM(gpf);
    }

    public void Activate(int a){
        if(a>0){
            DataStore1 ds1 = (DataStore1) this.ds;
            ds1.temp_a = a;
            this.m.Activate();
        }
    }

    public void Start(){
        this.m.Start();
    }

    public void PayCredit(){
        this.m.PayType(1);
    }

    public void Reject(){
        this.m.Reject();
    }

    public void Cancel(){
        this.m.Cancel();
    }

    public void Approved(){
        this.m.Approved();
    }

    public void PayCash(int c){
        if(c>0){
            DataStore1 ds1 = (DataStore1) this.ds;
            ds1.temp_c = c;
            this.m.PayType(0);
        }
    }

    public void StartPump(){
        this.m.Continue();
        this.m.StartPump();
    }

    public void Pump(){
        DataStore1 ds1 = (DataStore1) this.ds;
        if((ds1.w == 0)&&(ds1.cash < ds1.price * (ds1.liter + 1))){
            this.m.StopPump();
            this.m.Receipt();
        }
        else this.m.Pump();
    }

    public void StopPump(){
        this.m.StopPump();
        this.m.Receipt();
    }
}
