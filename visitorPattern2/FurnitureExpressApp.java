package SoftEng2.visitorPattern2;

public class FurnitureExpressApp {
    public static void main (String [] args){
        Furniture Table = new Furniture("Table", 10000.0, 20);
        Furniture Chair = new Furniture("Chair", 600.0, 30);
        Furniture Sofa = new Furniture("Sofa", 20000.0, 15);
        Furniture Cabinet = new Furniture("Cabinet", 15000.0, 10);
        Furniture Bed = new Furniture("Bed", 25000, 28);

        LightweightCalculator lightweightCalculator = new LightWeight();
        HeavyweightCalculator heavyweightCalculator = new HeavyWeight();

        System.out.println("--Light Weight Furniture--\n");
        System.out.println("Furniture: "+ Table.getFurniture() + " \nShipping Distance: "+Table.getDistance() + "\nOriginal Price: "+Table.getCost() + " \nTotal Cost: ₱" + Table.accept(lightweightCalculator, Table.getCost()));
        System.out.println("\nFurniture: "+ Chair.getFurniture() + " \nShipping Distance: "+Chair.getDistance() + "\nOriginal Price: "+Chair.getCost() + " \nTotal Cost: ₱" + Chair.accept(lightweightCalculator, Chair.getCost()));


        System.out.println("\n--Heavy Weight Furniture--\n");
        System.out.println("Furniture: "+ Sofa.getFurniture() + " \nShipping Distance: "+Sofa.getDistance() + "\nOriginal Price: "+Sofa.getCost() + " \nTotal Cost: ₱" + Sofa.accept(heavyweightCalculator, Sofa.getCost(), Sofa.getDistance()));
        System.out.println("\nFurniture: "+ Cabinet.getFurniture() + " \nShipping Distance: "+Cabinet.getDistance() + "\nOriginal Price: "+Cabinet.getCost() + " \nTotal Cost: ₱" + Cabinet.accept(heavyweightCalculator, Cabinet.getCost(), Cabinet.getDistance()));
        System.out.println("\nFurniture: "+ Bed.getFurniture() + " \nShipping Distance: "+Bed.getDistance() + "\nOriginal Price: "+Bed.getCost() + " \nTotal Cost: ₱" + Bed.accept(heavyweightCalculator, Bed.getCost(), Bed.getDistance()));

    }
}
