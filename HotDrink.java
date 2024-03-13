public class HotDrink {
    protected String name;
    protected int volume;
    
    
    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
    }