package lab2;

public class ProgressivePenaltyCalculator implements PenaltyCalculator{
    public double fine;

    public ProgressivePenaltyCalculator(double fine) {
        this.fine = fine;
    }

    @Override
    public double calculateFines(int overdue) {
        if(overdue > 0){
            return fine * overdue;
        } else {
            return 0.0;
        }
    }
}
