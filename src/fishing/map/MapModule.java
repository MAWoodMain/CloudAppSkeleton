package fishing.map;

public abstract class MapModule
{
    // gets the ID of a BOW at a certain log lat, if non is known, do static maps analysis
    public abstract int getBowId(double longitude, double latitude);

    // returns data from BOW used for mini game calcs
    public abstract BodyOfWater getBow(int bowId);

    // reduce catch rate in BOW on catch, refresh rate overnight
    public abstract void announceCatch(int bowId, int catchId);
}
