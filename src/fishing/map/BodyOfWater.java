package fishing.map;

import fishing.Catch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BodyOfWater
{
    public double currentCatchRate;
    public BowSize sizeCategory;
    public BowType type;

    public Collection<Catch> getPossibleCatches()
    {
        return Catch.getAll().stream().filter(c -> c.canExistIn(sizeCategory,type)).collect(Collectors.toCollection(ArrayList::new));
    }
}
