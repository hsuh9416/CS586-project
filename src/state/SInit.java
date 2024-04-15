package state;

import abstractFactory.GasPumpFactory;
import model.MDA_EFSM;

public class SInit extends State {

    public SInit(MDA_EFSM m, GasPumpFactory gpf) {
        super(m, gpf);
    }

    @Override
    public void Activate() {
        this.m.changeState(0);
        this.op.storePrices();
    }

    // Below functions are placeholders.

    @Override
    public void Start() {
        System.out.println("[Error] Not activated!");
    }

    @Override
    public void PayType(int t) {
        System.out.println("[Error] Not activated!");
    }

    @Override
    public void Reject() {
        System.out.println("[Error] Not activated!");
    }

    @Override
    public void Cancel() {
        System.out.println("[Error] Not activated!");
    }

    @Override
    public void Approved() {
        System.out.println("[Error] Not activated!");
    }

    @Override
    public void StartPump() {
        System.out.println("[Error] Not activated!");
    }

    @Override
    public void Pump() {
        System.out.println("[Error] Not activated!");
    }

    @Override
    public void StopPump() {
        System.out.println("[Error] Not activated!");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("[Error] Not activated!");
    }

    @Override
    public void Receipt() {
        System.out.println("[Error] Not activated!");
    }

    @Override
    public void NoReceipt() {
        System.out.println("[Error] Not activated!");
    }
}
