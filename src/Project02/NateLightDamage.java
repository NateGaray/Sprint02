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
        int damageDealt;

        if (otherPerson.getType() == PeopleType.warrior)
        {
            damageDealt = otherPerson.getLifePoints() / 10;
        }
        else if (otherPerson.getType() == PeopleType.wizard)
        {
            damageDealt = otherPerson.getLifePoints() / 8;
        }
        else
        {
            damageDealt = otherPerson.getLifePoints() / 12;
        }

        return damageDealt;
    }
}
