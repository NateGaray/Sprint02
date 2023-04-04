package Project02;
/**
 * This class defines the strategy for a warrior from Jeremy's nation
 */
public class JeremyWarriorStrategy implements Strategy
{
    private int lifePoints;

    /**
     * In my JeremyWarriorStrategy, For the first thing they do is try to heal each other
     * if one is lower in health than the other and if that's not the case they will end
     * up doing nothing. The if the nations are not the same, and it doesn't matter if the
     * nations are the same or not. If the warrior is attacking a wizard they will end
     * up doing double the damage as if they encountered a warrior. Overall this
     * strategy Is a balance between healing/defending and attacking.
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - Life Points Used for the encounter
     */
    public int strategy(People me, People otherPerson)
    {
        lifePoints = me.getLifePoints();

        if (me.getNation() == otherPerson.getNation())
        {
            if (me.getTribe() != otherPerson.getTribe())
            {
                if (me.getLifePoints() > otherPerson.getLifePoints())
                {
                    lifePoints += (otherPerson.getLifePoints() / 10); //gets healed by ally warrior
                    otherPerson.modifyLifePoints(-(otherPerson.getLifePoints() / 10)); //ally warrior takes damage
                }
                else
                {
                    lifePoints += 0; //nothing happens
                }
            }
        }
        else
        {
            if(me.getNation() != otherPerson.getNation())
            {
                if (me.getTribe() != otherPerson.getTribe())
                {
                    if (otherPerson.getType() == PeopleType.wizard)
                    {
                        lifePoints = otherPerson.getLifePoints() - 20;
                    }
                    else
                    {
                        lifePoints = otherPerson.getLifePoints() - 10;
                    }
                }
            }
        }
        return lifePoints;
    }

}
