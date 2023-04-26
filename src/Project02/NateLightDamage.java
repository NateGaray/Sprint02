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
        int damageDealt = 0;

        if (otherPerson.getType() == PeopleType.warrior)
        {
            if (me.getType() == PeopleType.warrior)
            {
                damageDealt = (otherPerson.getLifePoints() / 3);
            }
            else if (me.getType() == PeopleType.wizard)
            {
                damageDealt = (int) (otherPerson.getLifePoints() / 3.5);
            }
        }
        else if (otherPerson.getType() == PeopleType.wizard)
        {
            if (me.getType() == PeopleType.warrior)
            {
                damageDealt = (int)(otherPerson.getLifePoints() / 2.5);
            }
            else if (me.getType() == PeopleType.wizard)
            {
                damageDealt = (otherPerson.getLifePoints() / 2);
            }
        }
        else
        {

            if (me.getType() == PeopleType.warrior)
            {
                damageDealt = (otherPerson.getLifePoints() / 4);
            }
            else if (me.getType() == PeopleType.wizard)
            {
                damageDealt = (otherPerson.getLifePoints() / 3);
            }
        }

        return damageDealt;
    }
}
