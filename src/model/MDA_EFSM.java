package model;
import abstractFactory.GasPumpFactory;
import state.*;
import processor.Output.Output;

public class MDA_EFSM {
    State s;
    State[] sl;

    public MDA_EFSM(GasPumpFactory gpf) {
        Output op = new Output(gpf);
        sl = new State[8];
        this.sl[0] = new S0(this, op);
        this.sl[1] = new S1(this, op);
        this.sl[2] = new S2(this, op);
        this.sl[3] = new S3(this, op);
        this.sl[4] = new S4(this, op);
        this.sl[5] = new S5(this, op);
        this.sl[6] = new S6(this, op);
        this.sl[7] = new SInit(this, op);
        this.s = this.sl[7]; // set initial state as SInit.
    }

    public void changeState(int state){
        this.s = this.sl[state];
    }

    public void Activate() {
        this.s.Activate();
    }

    public void Start() {
        this.s.Start();
    }

    public void PayType(int t) {
        this.s.PayType(t);
    }

    public void Reject() {
        this.s.Reject();
    }

    public void Cancel() {
        this.s.Cancel();
    }

    public void Approved() {
        this.s.Approved();
    }

    public void StartPump() {
        this.s.StartPump();
    }

    public void Pump() {
        this.s.Pump();
    }

    public void StopPump() {
        this.s.StopPump();
    }

    public void SelectGas(int g) {
        this.s.SelectGas(g);
    }

    public void Receipt() {
        this.s.Receipt();
    }

    public void NoReceipt() {
        this.s.NoReceipt();
    }

    public void Continue(){this.s.Continue();}
}
