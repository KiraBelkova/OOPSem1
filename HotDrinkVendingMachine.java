//Создаем класс ГорячихНапитковАвтомат, реализующий интерфейс ТорговыйАвтомат:

public class HotDrinkVendingMachine implements VendingMachine {

    @Override
    public HotDrink getProduct(String name, int volume) {
        return new HotDrink(name, volume);
    }

    @Override
    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        return new HotDrinkWithTemperature(name, volume, temperature);
    }
}

