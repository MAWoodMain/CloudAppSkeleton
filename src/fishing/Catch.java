package fishing;

import fishing.map.BodyOfWater;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Catch
{
    private final String name;
    public static final Collection<Catch> catches = new ArrayList<>();
    public final int catchId;

    protected Catch(int catchId, String name)
    {
        this.catchId = catchId;
        this.name = name;
    }

    public static Collection<Catch> getAll()
    {
        return catches; // placeholder for datastore access
    }

    public abstract boolean canExistIn(BodyOfWater bodyOfWater);

    @Override
    public String toString()
    {
        return name;
        /*return "Catch{" +
                "name='" + name + '\'' +
                ", catchId=" + catchId +
                '}';*/
    }
}
