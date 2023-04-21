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
        int damageDealt;

        if (otherPerson.getType() == PeopleType.warrior)
        {
            damageDealt = otherPerson.getLifePoints() / 5;
        }
        else if (otherPerson.getType() == PeopleType.wizard)
        {
            damageDealt = otherPerson.getLifePoints() / 4;
        }
        else
        {
            damageDealt = otherPerson.getLifePoints() / 6;
        }

        return damageDealt;
    }
}
