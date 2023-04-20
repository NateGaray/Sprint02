package Project02;

/**
 * This class represents light damage
 */

public class NateLightDamage implements Strategy
{
    /**
     * This method defines the strategy for light damage
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return
     */

    @Override
    public int strategy(People me, People otherPerson)
    {
        int damageTaken;

        if (me.getLifePoints() < 10)
        {
            damageTaken = 1;
        }
        else
        {
            damageTaken = me.getLifePoints() / 10;

        }

        return damageTaken;
    }
}
