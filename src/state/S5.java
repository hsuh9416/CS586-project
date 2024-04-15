package state;

import abstractFactory.GasPumpFactory;
import model.MDA_EFSM;

public class S5 extends State {
    public S5(MDA_EFSM m) {
        super(m);
    }

    @Override
    public void Receipt() {
        this.m.op.printReceipt();
        this.m.op.returnCash();
        this.m.changeState(0);
    }

    @Override
    public void NoReceipt() {
        this.m.op.returnCash();
        this.m.changeState(0);
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
        System.out.println("[System] The service has already terminated.");
    }

    @Override
    public void Reject() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void Cancel() {
        System.out.println("[System] The service has already terminated.");
    }

    @Override
    public void Approved() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void StartPump() {
        System.out.println("[System] The service has already terminated.");
    }

    @Override
    public void Pump() {
        System.out.println("[System] The service has already terminated.");
    }

    @Override
    public void StopPump() {
        System.out.println("[System] The service has already terminated.");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("[System] The service has already terminated.");
    }
}
