package state;

import model.MDA_EFSM;
import processor.Output.Output;

public class S0 extends State {
    public S0(MDA_EFSM m, Output op) {
        super(m, op);
    }

    @Override
    public void Start() {
        this.m.changeState(1);
        System.out.println("[System] Welcome to CS586 gas station!");
        this.op.PayMsg();
    }

    // Below functions are placeholders.

    @Override
    public void Activate() {
        System.out.println("[Error] It's already activated!");
    }

    @Override
    public void PayType(int t) {
        System.out.println("[Error] Start the program first!");
    }

    @Override
    public void Reject() {
        System.out.println("[Error] Start the program first!");
    }

    @Override
    public void Cancel() {
        System.out.println("[Error] Start the program first!");
    }

    @Override
    public void Approved() {
        System.out.println("[Error] Start the program first!");
    }

    @Override
    public void StartPump() {
        System.out.println("[Error] Start the program first!");
    }

    @Override
    public void Pump() {
        System.out.println("[Error] Start the program first!");
    }

    @Override
    public void StopPump() {
        System.out.println("[Error] Start the program first!");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("[Error] Start the program first!");
    }

    @Override
    public void Receipt() {
        System.out.println("[Error] Start the program first!");
    }

    @Override
    public void NoReceipt() {
        System.out.println("[Error] Start the program first!");
    }

    @Override
    public void Continue() {
        System.out.println("[Error] Start the program first!");
    }
}
