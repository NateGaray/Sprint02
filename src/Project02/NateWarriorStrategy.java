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
            if (me.getLifePoints() >= 100)
            {
                lifePoints -= 5; //takes damage
            }
            else
            {
                if (me.getLifePoints() > otherPerson.getLifePoints())
                {
                    lifePoints -= me.getLifePoints() - (otherPerson.getLifePoints() * 1.5);
                }
                else if (me.getLifePoints() == otherPerson.getLifePoints())
                {
                    lifePoints += 10;
                }
                else
                {
                    lifePoints -= (otherPerson.getLifePoints() / 10); //inflicts damage
                }
            }
        }
        else if (me.getNation() == otherPerson.getNation() && otherPerson.getType() == PeopleType.wizard)
        {

            lifePoints += (otherPerson.getLifePoints() / 5); //gets healed by ally wizard
            otherPerson.modifyLifePoints(-(otherPerson.getLifePoints() / 5)); //ally wizard takes damage
        }
        else
        {
            lifePoints += 0; //nothing happens
        }

        return lifePoints;
    }
}
