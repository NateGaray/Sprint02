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
        if (me.getTribe() == otherPerson.getTribe())
        {
            int pointsShared;

            if (otherPerson.getLifePoints() > me.getLifePoints())
            {
                 pointsShared = otherPerson.getLifePoints() / 4;

                 return me.getLifePoints() + pointsShared;
            }
            else if (otherPerson.getLifePoints() < me.getLifePoints())
            {
                pointsShared = me.getLifePoints() / 4;

                return otherPerson.getLifePoints() + pointsShared;
            }
            else
            {
                pointsShared = 1;

                return otherPerson.getLifePoints() + pointsShared;
            }
        }
        else // different tribes
        {
            if (otherPerson.getLifePoints() > me.getLifePoints())
            {
                return otherPerson.getLifePoints() - 30;
            }
            else if (otherPerson.getLifePoints() < me.getLifePoints())
            {
                return otherPerson.getLifePoints() - 10;
            }
            else // equal points
            {
                return otherPerson.getLifePoints() - 20;
            }
        }
    }
}
