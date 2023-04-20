package Project02;

/**
 * This class is a special move for Nate's wizards
 */

public class NateHealingSpecial implements Strategy
{
    /**
     * This method defines the strategy for the healing special
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return
     */

    @Override
    public int strategy(People me, People otherPerson)
    {
        return me.getLifePoints() + 12;
    }
}
