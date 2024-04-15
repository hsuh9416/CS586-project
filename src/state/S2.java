package state;

import abstractFactory.GasPumpFactory;
import model.MDA_EFSM;

public class S2 extends State {
    public S2(MDA_EFSM m) {
        super(m);
    }

    @Override
    public void Reject() {
        this.m.op.rejectMsg();
        this.m.op.ejectCard();
        this.m.changeState(0);
    }

    @Override
    public void Approved() {
        System.out.println("[System] Verification successful!");
        this.m.op.setPayType(1);
        this.m.op.ejectCard();
        this.m.op.displayMenu();
        this.m.changeState(3);
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
        System.out.println("[Error] Payment verification is currently processing!");
    }

    @Override
    public void Cancel() {
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
