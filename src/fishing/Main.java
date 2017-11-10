package fishing;

import fishing.map.BodyOfWater;
import fishing.map.BowSize;
import fishing.map.BowType;

import java.util.Arrays;
import java.util.Collection;

public class Main
{
    public static void main(String[] args)
    {
        Catch.catches.add(new Fish(0,"Carp", BowSize.LARGE_LAKE, Arrays.asList(BowType.STATIC_FRESH,BowType.FLOWING_FRESH)));
        Catch.catches.add(new Fish(0,"Perch", BowSize.POND, Arrays.asList(BowType.STATIC_FRESH,BowType.FLOWING_FRESH)));
        Catch.catches.add(new Fish(0,"Salmon", BowSize.RIVER, Arrays.asList(BowType.STATIC_SALTWATER,BowType.FLOWING_SALTWATER)));
        Catch.catches.add(new Junk(1,"boot"));
        Catch.catches.add(new Junk(1,"Damaged tackle"));

        BodyOfWater testBody = new BodyOfWater(1.0,BowSize.POND, BowType.STATIC_FRESH);
        System.out.println(testBody.getPossibleCatches());
    }
}
