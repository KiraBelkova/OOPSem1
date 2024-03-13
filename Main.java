public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();

        HotDrink drink1 = vendingMachine.getProduct("Tea", 250);
        HotDrinkWithTemperature drink2 = vendingMachine.getProduct("Coffee", 350, 85);

        System.out.println(drink1);
        System.out.println(drink2);
    }
}

    