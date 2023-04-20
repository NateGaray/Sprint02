package Project02;

/**
 * This class represents heavy damage
 */

public class NateHeavyDamage implements Strategy
{
    /**
     * This method defines the strategy for heavy damage
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return
     */

    @Override
    public int strategy(People me, People otherPerson)
    {
        return me.getLifePoints() / 2;
    }
}
