package fishing.map;

public enum BowSize {
    POND(0.5),
    LAKE(1),
    RIVER(1.25),
    LARGE_LAKE(1.5),
    OCEAN_SCALE(2);

    public final double scaleMultiplier;

    BowSize(double scaleMultiplier)
    {
        this.scaleMultiplier = scaleMultiplier;
    }
}
