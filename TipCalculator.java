public class TipCalculator {

    public static void main(String[] args) {
        double meal = 50.03;
        int tip = 20;
        boolean splitCheck = false;
        int people = 1;
        String serverName = "Johannes";

        double tipAmount = meal * ((double)tip/(double)100);
        double mealTotal = meal + tipAmount;

        System.out.println("You are tipping " + tip + "% for a tip total of $" + tipAmount);
        System.out.println("Your meal total is: $" + mealTotal);

        if (splitCheck == true) {
            
        }
    }
}
