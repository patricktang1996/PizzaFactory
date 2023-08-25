public class BaconPizza extends Pizza{
    private int baconWeight;

    public BaconPizza(String name, int price, int size, int baconWeight) {
        super(name, price, size);
        this.baconWeight = baconWeight;
    }

    public BaconPizza() {
    }

    public int getBaconWeight() {
        return baconWeight;
    }

    public void setBaconWeight(int baconWeight) {
        this.baconWeight = baconWeight;
    }

    @Override
    public String showPizza() {
        return super.showPizza()+"\nWeight of the bacon："+baconWeight+"g\n";
    }
}
