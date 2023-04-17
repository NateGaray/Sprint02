package Project02;

/**
 * This class defines the strategy for a wizard from Nate's nation
 */

public class NateWizardStrategy implements Strategy
{

    /**
     * This method defines the strategy for a wizard from Nate's nation.
     * This is based on if the nations are equal or not.
     * It does not matter what tribe they are from.
     * If the nations are equal, the wizard will transfer some of his/her life points to the ally encountered.
     * If the nations are not equal, the wizard will receive damage.
     */
    @Override
    public int strategy(People me, People otherPerson)
    {
        int lifePoints = me.getLifePoints();

        if (otherPerson.getNation() != me.getNation())
        {
            if(otherPerson.getType() == PeopleType.warrior && otherPerson.getLifePoints() >= 75
                    && me.getLifePoints() >= 75)
            {
                NateHeavyDamage heavyDamage = new NateHeavyDamage();
                return heavyDamage.strategy(me, otherPerson);
            }
            else if (lifePoints < 75 && lifePoints % 12 == 0 && otherPerson.getLifePoints()
                    >= me.getLifePoints() + 8 && otherPerson.getLifePoints() < 75)
            {
                NateHealingSpecial healingSpecial = new NateHealingSpecial();
                return healingSpecial.strategy(me, otherPerson);
            }
        }

        return lifePoints;
    }
}
