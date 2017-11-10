package fishing;

import fishing.map.BowSize;
import fishing.map.BowType;

public class Junk extends Catch
{
    protected Junk(int catchId) {
        super(catchId);
    }

    @Override
    public boolean canExistIn(BowSize sizeCategory, BowType type) {
        return true;
    }
}
