package fishing.map;

public enum BowSize
{
    POND(0,0.5),
    LAKE(1,1),
    RIVER(2,1.25),
    LARGE_LAKE(3,1.5),
    OCEAN_SCALE(4,2);

    private final int id;
    public final double scaleMultiplier;

    BowSize(int id, double scaleMultiplier)
    {
        this.id = id;
        this.scaleMultiplier = scaleMultiplier;
    }

    public boolean isLargerOrEqualToo(BowSize other)
    {
        return this.id >= other.id;
    }
}
