package SoftEng2.visitorPattern2;

import java.util.HashMap;
import java.util.Map;

public class LightWeight implements LightweightCalculator{

    private static Map<String, Double> lightweightMap = new HashMap<>();

    static{
        lightweightMap.put("Table", 0.5);
        lightweightMap.put("Chair", 0.8);
    }



    @Override
    public double lightweightComputation(String furniture, double money) {
        double rate = lightweightMap.getOrDefault(furniture, 0.0);
        return (rate * money) + money ;
    }
}
