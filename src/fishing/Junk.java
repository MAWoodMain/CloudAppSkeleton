package fishing;

import fishing.map.BodyOfWater;

public class Junk extends Catch
{
    protected Junk(int catchId, String name)
    {
        super(catchId, name);
    }

    @Override
    public boolean canExistIn(BodyOfWater bodyOfWater)
    {
        // always present
        return true;
    }
}
