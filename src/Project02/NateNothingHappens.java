package Project02;

/**
 * This class represents nothing happening damage
 */

public class NateNothingHappens implements Strategy
{
    /**
     * This method defines the strategy for nothing happening
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return
     */

    @Override
    public int strategy(People me, People otherPerson)
    {
        return 0;
    }
}
