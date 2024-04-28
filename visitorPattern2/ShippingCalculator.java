package SoftEng2.visitorPattern2;

public interface ShippingCalculator {
    public double accept(LightweightCalculator lightweightCalculator, double money);
    public double accept(HeavyweightCalculator heavyweightCalculator, double money, double distance);
}
