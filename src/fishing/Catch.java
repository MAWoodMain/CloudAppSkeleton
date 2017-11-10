package fishing;

import fishing.map.BodyOfWater;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Catch
{

    public final int catchId;

    protected Catch(int catchId)
    {
        this.catchId = catchId;
    }

    public static Collection<Catch> getAll()
    {
        return new ArrayList<>(); // placeholder for datastore access
    }

    public abstract boolean canExistIn(BodyOfWater bodyOfWater);
}
