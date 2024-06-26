package state;

import model.MDA_EFSM;
import processor.Output.Output;

public class SInit extends State {

    public SInit(MDA_EFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void Activate() {
        this.m.changeState(0);
        this.op.StorePrices();
    }

    // Below functions are placeholders.

    @Override
    public void Start() {
        System.out.println("[Error] Not activated yet!");
    }

    @Override
    public void PayType(int t) {
        System.out.println("[Error] Not activated yet!");
    }

    @Override
    public void Reject() {
        System.out.println("[Error] Not activated yet!");
    }

    @Override
    public void Cancel() {
        System.out.println("[Error] Not activated yet!");
    }

    @Override
    public void Approved() {
        System.out.println("[Error] Not activated yet!");
    }

    @Override
    public void StartPump() {
        System.out.println("[Error] Not activated yet!");
    }

    @Override
    public void Pump() {
        System.out.println("[Error] Not activated yet!");
    }

    @Override
    public void StopPump() {
        System.out.println("[Error] Not activated yet!");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("[Error] Not activated yet!");
    }

    @Override
    public void Receipt() {
        System.out.println("[Error] Not activated yet!");
    }

    @Override
    public void NoReceipt() {
        System.out.println("[Error] Not activated yet!");
    }

    @Override
    public void Continue() {
        System.out.println("[Error] Not activated yet!");
    }
}
