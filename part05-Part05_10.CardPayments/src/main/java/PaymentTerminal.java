
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double affordableMealCost = 2.50;
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        if (payment >= affordableMealCost) {
            this.money += affordableMealCost;
            this.affordableMeals++;
            return payment - affordableMealCost;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        double affordableMealCost = 2.50;
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        if (card.balance() >= affordableMealCost) {
            card.takeMoney(affordableMealCost);
            this.affordableMeals++;
            return true;
        }
        return false;

    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        double heartyMealCost = 4.30;
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        if (payment >= heartyMealCost) {
            this.money += heartyMealCost;
            this.heartyMeals++;
            return payment - heartyMealCost;
        }
        return payment;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        double heartyMealCost = 4.30;

        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= heartyMealCost) {
            card.takeMoney(heartyMealCost);
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {

        if (sum < 0) {
            return;
        }
        this.money += sum;
        card.addMoney(sum);
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
