package Project02;

/**
 * This class represents nothing happening damage
 */

public class NatePeaceful implements Strategy
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
        if (otherPerson.getLifePoints() > me.getLifePoints())
        {
            return otherPerson.getLifePoints();
        }
        else if (me.getLifePoints() == otherPerson.getLifePoints())
        {
            return me.getLifePoints() - 1;
        }
        else
        {
            if (me.getLifePoints() < 10)
            {
                return 1;
            }
            else // otherPerson.getLifePoints() < me.getLifePoints()
            {
                return me.getLifePoints() + 10;
            }
        }
    }
}
