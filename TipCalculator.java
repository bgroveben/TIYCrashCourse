public class TipCalculator {

    public static void main(String[] args) {
        double meal = 50.03;
        int tip = 20;
        boolean splitCheck = true;
        int people = 1;
        String serverName = "Johannes";

        double tipAmount = meal * ((double)tip/(double)100);
        double mealTotal = meal + tipAmount;

        System.out.println("You are tipping " + tip + "% for a tip total of $" + tipAmount);
        System.out.println("Your meal total is: $" + mealTotal);

        if (splitCheck == true && people > 1) {
            double each = mealTotal / people;
            System.out.println("Each person owes: $" + each);
        }
        else if (people == 0) {
            System.out.println("Are you sure there is nobody in your party?");
        }
        else {
            System.out.println("Have a nice day.");
        }
    }
}
