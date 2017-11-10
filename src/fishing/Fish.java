package fishing;

import fishing.map.BodyOfWater;
import fishing.map.BowSize;
import fishing.map.BowType;

import java.util.Collection;

public class Fish extends Catch
{
    private final BowSize minimumBowSize;
    private final Collection<BowType> supportedBowTypes;

    public Fish(int catchId, String name, BowSize minimumBowSize, Collection<BowType> supportedBowTypes)
    {
        super(catchId, name);
        this.minimumBowSize = minimumBowSize;
        this.supportedBowTypes = supportedBowTypes;
    }

    @Override
    public boolean canExistIn(BodyOfWater bodyOfWater)
    {
        return supportedBowTypes.contains(bodyOfWater.getType()) &&
                bodyOfWater.getSizeCategory().isLargerOrEqualToo(minimumBowSize);
    }
}
