package state;

import model.MDA_EFSM;
import processor.Output.Output;

public class S5 extends State {
    public S5(MDA_EFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void Pump() {
        this.op.PumpGasUnit();
        this.op.GasPumpedMsg();
    }

    @Override
    public void StopPump() {
        this.m.changeState(6);
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
        System.out.println("[Error] The service is already in progress!");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("[Error] The service is already in progress. No modification available!");
    }

    @Override
    public void Receipt() {
        System.out.println("[Error] The service is currently in progress!");
    }

    @Override
    public void NoReceipt() {
        System.out.println("[Error] The service is currently in progress!");
    }

    @Override
    public void Continue() {
        System.out.println("[Error] The service is already in progress!");
    }
}
