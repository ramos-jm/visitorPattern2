package SoftEng2.visitorPattern2;

import java.util.HashMap;
import java.util.Map;

public class HeavyWeight implements HeavyweightCalculator{

    private static Map<String, Double> heavyweightMap = new HashMap<>();

    static{
        heavyweightMap.put("Sofa", 0.5);
        heavyweightMap.put("Cabinet", 0.8);
        heavyweightMap.put("Bed", 0.6);
    }

    @Override
    public double heavyweightComputation(String furniture, double money, double distance) {
        double rate = heavyweightMap.getOrDefault(furniture, 0.0);
        double extraFee = distance * 0.5;
        return (rate * money) + extraFee + money;
    }
}
