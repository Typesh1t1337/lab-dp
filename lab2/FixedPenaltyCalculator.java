package lab2;

public class FixedPenaltyCalculator implements PenaltyCalculator{
    public double fixedFine;

    public FixedPenaltyCalculator(double fixedFine) {
        this.fixedFine = fixedFine;
    }

    @Override
    public double calculateFines(int overdue) {
        if(overdue > 0){
            return fixedFine;
        }else {
            return 0.0;
        }
    }
}
