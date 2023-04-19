package Project02;

/**
 * This class defines the strategy for a healer from Nate's nation
 */

public class NateHealerStrategy implements Strategy
{
    /**
     * This method defines the strategy for a warrior from Nate's nation.
     * This is based on the roll of a die.
     */

    @Override
    public int strategy(People me, People otherPerson)
    {
        int lifePoints = me.getLifePoints();

        Die die = new Die();
        die.setDie(98);
        die.rollDie();

        if (me.getNation() == otherPerson.getNation())
        {
            otherPerson.modifyLifePoints(die.getDie());

            return otherPerson.getLifePoints();
        }
        else
        {
            if (lifePoints >= 60)
            {
                NateHeavyDamage heavyDamage = new NateHeavyDamage();
                lifePoints -= heavyDamage.strategy(me, otherPerson);
            }
            else if (lifePoints >= 30)
            {
                NateMediumDamage mediumDamage = new NateMediumDamage();
                lifePoints -= mediumDamage.strategy(me, otherPerson);
            }
            else
            {
                NateLightDamage lightDamage = new NateLightDamage();
                lifePoints -= lightDamage.strategy(me, otherPerson);
            }
        }

        return lifePoints;
    }
}
