package state;

import model.MDA_EFSM;

public class S3 extends State {
    public S3(MDA_EFSM m) {
        super(m);
    }

    @Override
    public void Cancel() {
        this.m.changeState(0);
        this.m.op.CancelMsg();
    }

    @Override
    public void SelectGas(int g) {
        this.m.op.SetPrice(g);
    }

    @Override
    public void Continue() {
        this.m.changeState(4);
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
        System.out.println("[Error] Your payment type has already been set!");
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
        System.out.println("[Error] Gas pump is not ready!");
    }

    @Override
    public void Pump() {
        System.out.println("[Error] Gas pump is not ready!");
    }

    @Override
    public void StopPump() {
        System.out.println("[Error] Gas pump is not ready!");
    }

    @Override
    public void Receipt() {
        System.out.println("[Error]Gas pump is not ready!");
    }

    @Override
    public void NoReceipt() {
        System.out.println("[Error] Gas pump is not ready!");
    }
}
