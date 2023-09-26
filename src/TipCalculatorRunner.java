import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input your bill before tip: ");
        String placeholder = s.nextLine();
        double billNoTip = Double.parseDouble(placeholder); //billNoTip is the bill before tip
        System.out.println("Please input the amount you want to tip(40%=0.4): ");
        String placeholder2 = s.nextLine();
        double tipPercent = Double.parseDouble(placeholder2); //tipPercent is the amount user wants to tip
        System.out.println("Including you, how many people are present?: ");
        String placeholder3 = s.nextLine();
        int peoplesPresent = Integer.parseInt(placeholder3); //peoplesPresent is the amount of people present
        TipCalculator tip = new TipCalculator(billNoTip, tipPercent, peoplesPresent);
        tip.printTipCalculatorInfo();
    }
}
