public class TipCalculator {
    private double total;
    private double tips;
    private int people;
    private double getTotalTip;
    private double getTotalTipRounded;
    private double getGrandTotal;
    private double getGrandTotalRounded;
    private double getIndividualTip;
    private double getIndividualTipRounded;
    private double getIndividualTotal;
    private double getIndividualTotalRounded;


    public TipCalculator(double billNoTip, double tipPercent, int peoplesPresent) {
        total = billNoTip;
        tips = tipPercent;
        people = peoplesPresent;
        getTotalTip = billNoTip * tipPercent;
        getTotalTipRounded = Math.round(getTotalTip * 100.0) / 100.0;
        getGrandTotal = billNoTip + getTotalTip;
        getGrandTotalRounded = Math.round(getGrandTotal * 100.0) / 100.0;
        getIndividualTip = getTotalTip + peoplesPresent;
        getIndividualTipRounded = Math.round(getIndividualTip * 100.0) / 100.0;
        getIndividualTotal = getGrandTotal/peoplesPresent;
        getIndividualTotalRounded = Math.round(getIndividualTotal * 100.0) / 100.0;
    }

    public void printTipCalculatorInfo() {
        System.out.println("The total tip amount is: $" + getTotalTipRounded + " in tips.");
        System.out.println("The total bill including tip is: $" + getGrandTotalRounded);
        System.out.println("Each person in your group should pay: $" + getIndividualTipRounded + " in tips.");
        System.out.println("Each person in your group should pay a total of: $" + getIndividualTotalRounded);
    }
}

