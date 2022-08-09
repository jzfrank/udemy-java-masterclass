public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = Math.max(0, cost);
    }

    public double getCost() {
        return cost;
    }
}
