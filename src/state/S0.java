package state;

import abstractFactory.GasPumpFactory;
import model.MDA_EFSM;

public class S0 extends State {
    public S0(MDA_EFSM m) {
        super(m);
    }

    @Override
    public void Start() {
        this.m.changeState(1);
        System.out.println("[System] Welcome to CS586 gas station!");
        this.m.op.payMsg();
    }

    // Below functions are placeholders.

    @Override
    public void Activate() {
        System.out.println("[Error] It's already activated!");
    }

    @Override
    public void PayType(int t) {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void Reject() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void Cancel() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void Approved() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void StartPump() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void Pump() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void StopPump() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void Receipt() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void NoReceipt() {
        System.out.println("[Error] Wrong Assessment!");
    }
}
