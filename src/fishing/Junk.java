package fishing;

import fishing.map.BodyOfWater;

public class Junk extends Catch
{
    protected Junk(int catchId) {
        super(catchId);
    }

    @Override
    public boolean canExistIn(BodyOfWater bodyOfWater) {
        return true;
    }
}
