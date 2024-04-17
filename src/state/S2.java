package state;

import model.MDA_EFSM;

public class S2 extends State {
    public S2(MDA_EFSM m) {
        super(m);
    }

    @Override
    public void Reject() {
        this.m.changeState(0);
        this.m.op.RejectMsg();
        this.m.op.EjectCard();
    }

    @Override
    public void Approved() {
        this.m.changeState(3);
        System.out.println("[System] Verification successful!");
        this.m.op.SetPayType(1);
        this.m.op.EjectCard();
        this.m.op.DisplayMenu();

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
        System.out.println("[Error] Payment type is already set!");
    }

    @Override
    public void Cancel() {
        System.out.println("[Error] Please wait for the payment verification!");
    }

    @Override
    public void StartPump() {
        System.out.println("[Error] Please wait for the payment verification!");
    }

    @Override
    public void Pump() {
        System.out.println("[Error] Please wait for the payment verification!");
    }

    @Override
    public void StopPump() {
        System.out.println("[Error] Please wait for the payment verification!");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("[Error] Please wait for the payment verification!");
    }

    @Override
    public void Receipt() {
        System.out.println("[Error] Please wait for the payment verification!");
    }

    @Override
    public void NoReceipt() {
        System.out.println("[Error] Please wait for the payment verification!");
    }

    @Override
    public void Continue() {
        System.out.println("[Error] Please wait for the payment verification!");
    }
}
