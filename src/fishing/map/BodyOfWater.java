package fishing.map;

import fishing.Catch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class BodyOfWater
{
    private double currentCatchRate;
    private BowSize sizeCategory;
    private BowType type;

    public BodyOfWater(double currentCatchRate, BowSize sizeCategory, BowType type)
    {
        this.currentCatchRate = currentCatchRate;
        this.sizeCategory = sizeCategory;
        this.type = type;
    }

    public Collection<Catch> getPossibleCatches()
    {
        // extract the subset of catches that are possible in the given BOW
        return Catch.getAll().stream().filter(c -> c.canExistIn(this)).collect(Collectors.toCollection(ArrayList::new));
    }

    public double getCurrentCatchRate()
    {
        return currentCatchRate;
    }

    public BowSize getSizeCategory()
    {
        return sizeCategory;
    }

    public BowType getType()
    {
        return type;
    }
}
