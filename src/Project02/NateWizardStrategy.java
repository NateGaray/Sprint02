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
        int myLifePoints = me.getLifePoints();
        int otherLifePoints = otherPerson.getLifePoints();

        if (me.getNation() != otherPerson.getNation())
        {
            if (myLifePoints > otherLifePoints || myLifePoints >= 80)
            {
                NateHeavyDamage heavyDamage = new NateHeavyDamage();
                return heavyDamage.strategy(me, otherPerson);
            }
            else if (myLifePoints == otherLifePoints || myLifePoints >= 65)
            {
                NateMediumDamage mediumDamage = new NateMediumDamage();
                return mediumDamage.strategy(me, otherPerson);
            }
            else // myLifePoints < otherLifePoints || myLifePoints < 65
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
