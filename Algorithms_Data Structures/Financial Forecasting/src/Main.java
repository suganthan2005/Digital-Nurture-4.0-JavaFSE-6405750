public class Main {

    public static double forecastFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return forecastFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
        }
    }

    public static void main(String[] args) {
        double presentValue = 10000;
        double annualGrowthRate = 0.08;
        int years = 5;

        double futureValue = forecastFutureValue(presentValue, annualGrowthRate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}