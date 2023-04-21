package Project02;

/**
 * This class defines the strategy for a warrior from Nate's nation
 */

public class NateWarriorStrategy implements Strategy
{

    /**
     * This method defines the strategy for a warrior from Nate's nation.
     * This is based on if the nations are equal or not.
     * It does not matter what tribe they are from.
     * If the nations are not equal, the warrior will inflict damage on the enemy.
     * If the warrior encounters a wizard from his/her own nation, he/she is healed.
     * If the warrior encounters a warrior from his/her nation, a peaceful encounter occurs.
     */
    @Override
    public int strategy(People me, People otherPerson)
    {
        int myLifePoints = me.getLifePoints();
        int otherLifePoints = otherPerson.getLifePoints();

        if (me.getNation() != otherPerson.getNation())
        {
            if (myLifePoints > otherLifePoints || otherLifePoints >= 60)
            {
                NateHeavyDamage heavyDamage = new NateHeavyDamage();
                return heavyDamage.strategy(me, otherPerson);
            }
            else if (myLifePoints == otherLifePoints || otherLifePoints >= 20)
            {
                NateMediumDamage mediumDamage = new NateMediumDamage();
                return mediumDamage.strategy(me, otherPerson);
            }
            else // myLifePoints < otherLifePoints || otherLifePoints < 20
            {
                NateLightDamage lightDamage = new NateLightDamage();
                return lightDamage.strategy(me, otherPerson);
            }
        }
        else // same nation
        {
            NatePeaceful peaceful = new NatePeaceful();
            return peaceful.strategy(me, otherPerson);
        }
    }
}
