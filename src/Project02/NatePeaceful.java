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
                NateHeavyDamage heavyDamage = new NateHeavyDamage();
                return heavyDamage.strategy(me, otherPerson);
            }
            else if (otherPerson.getLifePoints() < me.getLifePoints())
            {
                NateLightDamage lightDamage = new NateLightDamage();
                return lightDamage.strategy(me, otherPerson);
            }
            else // equal points
            {
                NateMediumDamage mediumDamage = new NateMediumDamage();
                return mediumDamage.strategy(me, otherPerson);
            }
        }
    }
}
