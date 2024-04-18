import processor.Input.*;

import java.util.Scanner;

public class GasPumpDriver {
    Scanner sc;
    GasPump1 gp1;
    GasPump2 gp2;

    public GasPumpDriver(){
        this.sc = new Scanner(System.in);
    }

    public void runGasPump1(){
        int sel;
        this.gp1 = new GasPump1();
        while(true){
            System.out.println("[System] Please select the operations from below.");
            System.out.println("---------------------------------------------------------------------");
            System.out.printf(" 0: %-10s 1: %-10s 2: %-10s 3: %-10s 4: %-10s\n",
                    "Activate","Start","PayCredit","Reject","Cancel");
            System.out.printf(" 5: %-10s 6: %-10s 7: %-10s 8: %-10s 9: %-10s\n",
                    "Approved","PayCash","StartPump","Pump","StopPump");
            System.out.println("99: Quit");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("[System] Enter the number of the option: ");
            sel = sc.nextInt();

            if (sel == 99) break; // exit immediately

            switch(sel){
                case 0:
                    System.out.println("\tOperation: Activate(int a)");
                    System.out.print("[System] Enter the value of price a: ");
                    int a = sc.nextInt();
                    gp1.Activate(a);
                    break;
                case 1:
                    System.out.println("\tOperation: Start()");
                    gp1.Start();
                    break;
                case 2:
                    System.out.println("\tOperation: PayCredit()");
                    gp1.PayCredit();
                    break;
                case 3:
                    System.out.println("\tOperation: Reject()");
                    gp1.Reject();
                    break;
                case 4:
                    System.out.println("\tOperation: Cancel()");
                    gp1.Cancel();
                    break;
                case 5:
                    System.out.println("\tOperation: Approved()");
                    gp1.Approved();
                    break;
                case 6:
                    System.out.println("\tOperation: PayCash(int c)");
                    System.out.print("[System] Enter the value of payment c: ");
                    int c = sc.nextInt();
                    gp1.PayCash(c);
                    break;
                case 7:
                    System.out.println("\tOperation: StartPump()");
                    gp1.StartPump();
                    break;
                case 8:
                    System.out.println("\tOperation: Pump()");
                    gp1.Pump();
                    break;
                case 9:
                    System.out.println("\tOperation: StopPump()");
                    gp1.StopPump();
                    break;
                default:
                    System.out.println("[Error] Invalid selection. please select again!");
            }
            System.out.println();
        }
        System.out.println("[System] Thank you for using our service. Good bye!");
        System.out.println("======================================================================");
        System.out.println();
    }

    public void runGasPump2(){
        this.gp2 = new GasPump2();
        int sel;
        while(true){
            System.out.println("[System] Please select the operations from below.");
            System.out.println("---------------------------------------------------------------------");
            System.out.printf(" 0: %-10s 1: %-10s 2: %-10s 3: %-10s 4: %-10s\n",
                    "Activate","Start","PayCash","Cancel","Premium");
            System.out.printf(" 5: %-10s 6: %-10s 7: %-10s 8: %-10s 9: %-10s\n",
                    "Regular","Diesel","StartPump","PumpGallon","Stop");
            System.out.printf("10: %-10s11: %-10s\n", "Receipt","NoReceipt");
            System.out.println("99: Quit");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("[System] Enter the number of the option: ");
            sel = sc.nextInt();

            if (sel == 99) break;
        switch(sel){
            case 0:
                System.out.println("\tOperation: Activate(float a, float b, float c)");
                System.out.print("[System] Enter the value of price a: ");
                float a = sc.nextFloat();
                System.out.print("[System] Enter the value of price b: ");
                float b = sc.nextFloat();
                System.out.print("[System] Enter the value of price c: ");
                float c = sc.nextFloat();
                gp2.Activate(a, b, c);
                break;
            case 1:
                System.out.println("\tOperation: Start()");
                gp2.Start();
                break;
            case 2:
                System.out.println("\tOperation: PayCash(c)");
                System.out.print("[System] Enter the value of cash payment c: ");
                int cash = sc.nextInt();
                gp2.PayCash(cash);
                break;
            case 3:
                System.out.println("\tOperation: Cancel()");
                gp2.Cancel();
                break;
            case 4:
                System.out.println("\tOperation: Premium()");
                gp2.Premium();
                break;
            case 5:
                System.out.println("\tOperation: Regular()");
                gp2.Regular();
                break;
            case 6:
                System.out.println("\tOperation: Diesel()");
                gp2.Diesel();
                break;
            case 7:
                System.out.println("\tOperation: StartPump()");
                gp2.StartPump();
                break;
            case 8:
                System.out.println("\tOperation: PumpGallon()");
                gp2.PumpGallon();
                break;
            case 9:
                System.out.println("\tOperation: Stop()");
                gp2.Stop();
                break;
            case 10:
                System.out.println("\tOperation: Receipt()");
                gp2.Receipt();
                break;
            case 11:
                System.out.println("\tOperation: NoReceipt()");
                gp2.NoReceipt();
                break;
            default:
                System.out.println("[Error] Invalid selection. please select again!");
        }
            System.out.println();
        }

        System.out.println("[System] Thank you for using our service. Good bye!");
        System.out.println("======================================================================");
        System.out.println();

    }

    public void run(){
        int picked = -1;
        while(picked !=0 && picked != 1){
            System.out.println("==================== [CS856] Final Project============================");
            System.out.println("[System] Please select the GP component to execute");
            System.out.println("---------------------------------------------------------------------");
            System.out.printf(" 0: %-10s 1: %-10s 99: %-10s\n", "GasPump1","GasPump2", "Exit");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("[System] Enter the number of the option: ");
            picked = sc.nextInt();
            System.out.println("======================================================================\n");
            if(picked == 99) return;
        }

        System.out.printf("============================== %s ==============================\n",
                (picked == 0) ? "GasPump1": "GarPump2");
        System.out.println("[Menu of Operations]");
        System.out.printf("\t0. %s\n", (picked == 0) ? "Activate(int)": "Activate(float, float, float)");
        System.out.println("\t1. Start()");
        System.out.printf("\t2. %s\n", (picked == 0) ? "PayCredit()": "PayCash(int)");
        System.out.printf("\t3. %s\n", (picked == 0) ? "Reject()": "Cancel()");
        System.out.printf("\t4. %s\n", (picked == 0) ? "Cancel()": "Premium()");
        System.out.printf("\t5. %s\n", (picked == 0) ? "Approved()": "Regular()");
        System.out.printf("\t6. %s\n", (picked == 0) ? "PayCash(int)": "Diesel()");
        System.out.println("\t7. StartPump()");
        System.out.printf("\t8. %s\n", (picked == 0) ? "Pump()": "PumpGallon()");
        System.out.printf("\t9. %s\n", (picked == 0) ? "StopPump()": "Stop()");
        if(picked == 1){
            System.out.println("\t10. Receipt()");
            System.out.println("\t11. NoReceipt()");
        }
        System.out.println("\t99. Quit the program");
        System.out.println();
        System.out.println("*** Please make a note of these operations ***");
        System.out.println();

        System.out.printf("[%s Execution]\n", (picked == 0) ? "GasPump1": "GarPump2");
        System.out.println();

        if(picked == 0) runGasPump1();
        else runGasPump2();
    }

    public static void main(String[] args) {
        new GasPumpDriver().run();
    }
}
