package fishing;

import fishing.map.BodyOfWater;

public class Fish extends Catch
{
    public Fish(int catchId)
    {
        super(catchId);
    }

    @Override
    public boolean canExistIn(BodyOfWater bodyOfWater)
    {
        return true;
    }
}
