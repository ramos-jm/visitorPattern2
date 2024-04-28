package SoftEng2.visitorPattern2;

public class Furniture implements ShippingCalculator{
    private String furniture;
    private double cost;
    private double distance;


    public Furniture(String furniture, double money, double distance){
        this.furniture = furniture;
        this.cost = money;
        this.distance = distance;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public double accept(LightweightCalculator lightweightCalculator, double money) {
        this.cost = money;
        return lightweightCalculator.lightweightComputation(furniture, money);
    }

    @Override
    public double accept(HeavyweightCalculator heavyweightCalculator, double money, double distance) {
        this.cost = money;
        return heavyweightCalculator.heavyweightComputation(furniture, money, distance);
    }
}
