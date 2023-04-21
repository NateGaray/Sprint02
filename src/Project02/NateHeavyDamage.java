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
        int damageDealt;

        if (otherPerson.getType() == PeopleType.warrior)
        {
            damageDealt = (int)(otherPerson.getLifePoints() / 2.5);
        }
        else if (otherPerson.getType() == PeopleType.wizard)
        {
            damageDealt = otherPerson.getLifePoints() / 2;
        }
        else
        {
            damageDealt = otherPerson.getLifePoints() / 3;
        }

        return damageDealt;
    }
}
