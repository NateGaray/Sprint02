package Project02;

/**
 * This class represents heavy damage
 */

public class NateHeavyDamage implements Strategy
{
    /**
     * This method defines the strategy for heavy damage
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
                damageDealt = (otherPerson.getLifePoints() / 9);
            }
            else if (me.getType() == PeopleType.wizard)
            {
                damageDealt = (int) (otherPerson.getLifePoints() / 10.5);
            }
        }
        else if (otherPerson.getType() == PeopleType.wizard)
        {
            if (me.getType() == PeopleType.warrior)
            {
                damageDealt = (int)(otherPerson.getLifePoints() / 7.5);
            }
            else if (me.getType() == PeopleType.wizard)
            {
                damageDealt = (otherPerson.getLifePoints() / 6);
            }
        }
        else
        {

            if (me.getType() == PeopleType.warrior)
            {
                damageDealt = (otherPerson.getLifePoints() / 12);
            }
            else if (me.getType() == PeopleType.wizard)
            {
                damageDealt = (otherPerson.getLifePoints() / 9);
            }
        }

        return damageDealt;
    }
}
