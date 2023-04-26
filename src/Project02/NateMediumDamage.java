package Project02;

/**
 * This class represents medium damage
 */

public class NateMediumDamage implements Strategy
{
    /**
     * This method defines the strategy for medium damage
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
                damageDealt = (otherPerson.getLifePoints() / 6);
            }
            else if (me.getType() == PeopleType.wizard)
            {
                damageDealt = (otherPerson.getLifePoints() / 7);
            }
        }
        else if (otherPerson.getType() == PeopleType.wizard)
        {
            if (me.getType() == PeopleType.warrior)
            {
                damageDealt = otherPerson.getLifePoints() / 5;
            }
            else if (me.getType() == PeopleType.wizard)
            {
                damageDealt = otherPerson.getLifePoints() / 4;
            }
        }
        else
        {

            if (me.getType() == PeopleType.warrior)
            {
                damageDealt = otherPerson.getLifePoints() / 8;
            }
            else if (me.getType() == PeopleType.wizard)
            {
                damageDealt = otherPerson.getLifePoints() / 6;
            }
        }

        return damageDealt;
    }
}
