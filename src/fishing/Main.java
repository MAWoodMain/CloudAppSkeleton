package fishing;

import fishing.map.BodyOfWater;
import fishing.map.BowSize;
import fishing.map.BowType;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Catch.catches.add(new Fish(0,"Carp", BowSize.LARGE_LAKE, Arrays.asList(BowType.STATIC_FRESH,BowType.FLOWING_FRESH)));
        Catch.catches.add(new Fish(1, "Perch", BowSize.POND, Arrays.asList(BowType.STATIC_FRESH, BowType.FLOWING_FRESH)));
        Catch.catches.add(new Fish(2, "Salmon", BowSize.RIVER, Arrays.asList(BowType.STATIC_SALTWATER, BowType.FLOWING_SALTWATER)));
        Catch.catches.add(new Junk(3, "boot"));
        Catch.catches.add(new Junk(4, "Damaged tackle"));

        BodyOfWater testBody = new BodyOfWater(1.0,BowSize.POND, BowType.STATIC_FRESH);
        System.out.println("Freshwater pond:\t\t" + testBody.getPossibleCatches());
        testBody = new BodyOfWater(1.0,BowSize.OCEAN_SCALE, BowType.STATIC_SALTWATER);
        System.out.println("Saltwater ocean:\t\t" + testBody.getPossibleCatches());
        testBody = new BodyOfWater(1.0,BowSize.LARGE_LAKE, BowType.STATIC_FRESH);
        System.out.println("Freshwater large lake:\t" + testBody.getPossibleCatches());
    }
}
