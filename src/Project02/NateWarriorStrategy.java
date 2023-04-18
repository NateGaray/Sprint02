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
     * This means nothing happens.
     */
    @Override
    public int strategy(People me, People otherPerson)
    {
        int lifePoints = me.getLifePoints();

        if (me.getNation() != otherPerson.getNation())
        {
            if (me.getLifePoints() > otherPerson.getLifePoints() && me.getLifePoints() >= 70
                    && otherPerson.getLifePoints() <= 70 && otherPerson.getLifePoints() >= 50)
            {
                NateHeavyDamage heavyDamage = new NateHeavyDamage();
                lifePoints -= heavyDamage.strategy(me, otherPerson);
            }
            else if (me.getLifePoints() < 70 && me.getLifePoints() >= 50 && otherPerson.getLifePoints() > 70 ||
                    otherPerson.getLifePoints() < 50)
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
        else
        {
            NateNothingHappens nothingHappens = new NateNothingHappens();
            lifePoints += nothingHappens.strategy(me, otherPerson); //nothing happens
        }

        if (lifePoints > 100)
        {
            lifePoints = 100;
        }

        return lifePoints;
    }
}
