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
        if (me.getNation() == otherPerson.getNation() && otherPerson.getType() == PeopleType.wizard)
        {
            otherPerson.modifyLifePoints(lifePoints / 10); //heals ally
            lifePoints -= (lifePoints / 10); //takes damage
        }
        else if (me.getNation() == otherPerson.getNation() && otherPerson.getType() == PeopleType.warrior)
        {
            otherPerson.modifyLifePoints(lifePoints / 5); //heals ally
            lifePoints -= (lifePoints / 5); //takes damage
        }
        else
        {
            if (me.getLifePoints() < otherPerson.getLifePoints())
            {
                lifePoints = otherPerson.getLifePoints();
            }
            else if (me.getLifePoints() > otherPerson.getLifePoints())
            {
                lifePoints -= otherPerson.getLifePoints() / 10;
            }
            else
            {
                otherPerson.modifyLifePoints(-(me.getLifePoints() / 10));
            }
        }
        return lifePoints;
    }
}
