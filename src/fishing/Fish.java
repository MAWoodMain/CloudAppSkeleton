package fishing;

import fishing.map.BowSize;
import fishing.map.BowType;

public class Fish extends Catch{
    public Fish(int catchId) {
        super(catchId);
    }

    @Override
    public boolean canExistIn(BowSize sizeCategory, BowType type) {
        return true;
    }
}
