package state;

import model.MDA_EFSM;
import processor.Output.Output;

public class S6 extends State {
    public S6(MDA_EFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void Receipt() {
        this.m.changeState(0);
        this.op.PrintReceipt();
        this.op.ReturnCash();
    }

    @Override
    public void NoReceipt() {
        this.m.changeState(0);
        this.op.ReturnCash();
    }

    // Below functions are placeholders.

    @Override
    public void Activate() {
        System.out.println("[Error] It's already activated!");
    }

    @Override
    public void Start() {
        System.out.println("[Error] It's already started!");
    }

    @Override
    public void PayType(int t) {
        System.out.println("[Error] Your payment type has already been set. No modification available!");
    }

    @Override
    public void Cancel() {
        System.out.println("[Error] The service is already in progress. No modification available!");
    }

    @Override
    public void Reject() {
        System.out.println("[Error] Your payment type has already been verified!");
    }

    @Override
    public void Approved() {
        System.out.println("[Error] Your payment type has already been verified!");
    }

    @Override
    public void StartPump() {
        System.out.println("[Error] The service has already been terminated!");
    }

    @Override
    public void Pump() {
        System.out.println("[Error] The service has already been terminated!");
    }

    @Override
    public void StopPump() {
        System.out.println("[Error] The service has already been terminated!");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("[Error] The service has already been terminated!");
    }

    @Override
    public void Continue() {
        System.out.println("[Error] The service has already been terminated!");
    }
}
