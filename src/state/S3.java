package state;

import abstractFactory.GasPumpFactory;
import model.MDA_EFSM;

public class S3 extends State {
    public S3(MDA_EFSM m, GasPumpFactory gpf) {
        super(m, gpf);
    }

    @Override
    public void Cancel() {
        this.op.cancelMsg();
        this.m.changeState(0);
    }

    @Override
    public void SelectGas(int g) {
        if (g < 0 || g > 2){
            System.out.println("[Error] Invalid selection. please select again!");
        }
        else{
            this.op.setPrice(g);
        }
    }

    @Override
    public void StartPump() {
        this.op.setInitialValues();
        System.out.println("[System] Now start gas pump...");
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
        System.out.println("[Error] Your payment type has already been set.");
        System.out.println("[Error] Please restart if you want to use another payment type!");
    }

    @Override
    public void Reject() {
        System.out.println("[Error] Wrong Assessment!");
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

    @Override
    public void Receipt() {
        System.out.println("[Error] Wrong Assessment!");
    }

    @Override
    public void NoReceipt() {
        System.out.println("[Error] Wrong Assessment!");
    }
}
