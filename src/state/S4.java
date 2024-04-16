package state;

import model.MDA_EFSM;

public class S4 extends State {
    public S4(MDA_EFSM m) {
        super(m);
    }

    @Override
    public void StartPump() {
        this.m.op.setInitialValues();
        System.out.println("[System] Now start gas pump...");
        this.m.changeState(5);
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
        System.out.println("[Error] Your payment type has already been set.");
        System.out.println("[Error] Please restart if you want to use another payment type!");
    }

    @Override
    public void Reject() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void Cancel() {
        System.out.println("[Error] The service is already in progress. No modification available.");
    }

    @Override
    public void Approved() {
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

    public void SelectGas(int g) {
        System.out.println("[Error] The service is already in progress. No modification available.");
    }

    @Override
    public void Receipt() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void NoReceipt() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void Continue() {
        System.out.println("It's already started!");
    }
}
