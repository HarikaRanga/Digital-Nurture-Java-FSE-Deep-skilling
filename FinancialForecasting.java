public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double forecast(double currentValue, double growthRate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return forecast(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 10000; // Initial amount
        double growthRate = 0.10;    // 10% annual growth
        int years = 5;

        double futureValue = forecast(currentValue, growthRate, years);

        System.out.println("Current Value: ₹" + currentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.printf("Forecasted Value after %d years: ₹%.2f%n",
                years, futureValue);
    }
}