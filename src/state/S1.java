package state;

import model.MDA_EFSM;
import processor.Output.Output;

public class S1 extends State {
    public S1(MDA_EFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void PayType(int t) {
        if (t == 0){ // Payment: cash
            this.m.changeState(3);
            this.op.StoreCash();
            this.op.DisplayMenu();
            this.op.SetPayType(0);

        }
        else if(t == 1){
            this.m.changeState(2);
            System.out.println("[System] Card inserted!");
            System.out.println("[System] Please wait. We are verifying your payment.");
        }
        else{
            System.out.println("[Error] Invalid selection. please select again!");
        }
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
    public void Reject() {
        System.out.println("[Error] Select the payment type first!");
    }

    @Override
    public void Cancel() {
        System.out.println("[Error] Select the payment type first!");
    }

    @Override
    public void Approved() {
        System.out.println("[Error] Select the payment type first!");
    }

    @Override
    public void StartPump() {
        System.out.println("[Error] Select the payment type first!");
    }

    @Override
    public void Pump() {
        System.out.println("[Error] Select the payment type first!");
    }

    @Override
    public void StopPump() {
        System.out.println("[Error] Select the payment type first!");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("[Error] Select the payment type first!");
    }

    @Override
    public void Receipt() {
        System.out.println("[Error] Select the payment type first!");
    }

    @Override
    public void NoReceipt() {
        System.out.println("[Error] Select the payment type first!");
    }

    @Override
    public void Continue() {
        System.out.println("[Error] Select the payment type first!");
    }
}
