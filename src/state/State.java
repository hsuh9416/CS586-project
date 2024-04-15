package state;

import model.MDA_EFSM;

public abstract class State {
    MDA_EFSM m;

    public State(MDA_EFSM m){
        this.m = m;
    }

    abstract public void Activate();
    abstract public void Start();
    abstract public void PayType(int t);   // cash: t=0; credit: t=1;
    abstract public void Reject();
    abstract public void Cancel();
    abstract public void Approved();
    abstract public void StartPump();
    abstract public void Pump();
    abstract public void StopPump();
    abstract public void SelectGas(int g);  // Regular: g=0; Premium: g=1; Diesel: g=2;
    abstract public void Receipt();
    abstract public void NoReceipt();
}
