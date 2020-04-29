
public class ReturnTypeJava {
    public static void main(String[] args) {
        double groupTotalPriceMealPrice = calculateTotalMealPrice(100, .2, .08);
        System.out.println("Your total meal price is: " + groupTotalPriceMealPrice);
        double individualMealPrice = groupTotalPriceMealPrice / 5;
        System.out.println(individualMealPrice);
    }

    public static double calculateTotalMealPrice(double listedMealPrice, 
                                                double tipRate, 
                                                double taxRate) {
        double tip = listedMealPrice * tipRate;
        double tax = listedMealPrice * taxRate;
        double result = tip + tax + listedMealPrice;

        return result;
    }
}