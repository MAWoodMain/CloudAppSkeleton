package fishing;

import fishing.map.BowSize;
import fishing.map.BowType;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Catch {

    public final int catchId;

    protected Catch(int catchId) {
        this.catchId = catchId;
    }

    public abstract boolean canExistIn(BowSize sizeCategory, BowType type);

    public static Collection<Catch> getAll() {
        return new ArrayList<>();
    }
}
