package Project02;

/**
 *  This class defines the defensive strategy for a wizard from Jeremy's nation
 */
public class JeremyDefensiveWizard implements Strategy
{
    /**
     * In my defensive strategy, it is first checking to see of the nations are not equal to each
     * other. Then it is seeing if the tribes are the same or not, and if they are it keeps going. If
     * the person I'm going against is a warrior I will end up gaining 30 points, but of they are a wizard
     * I will end up gaining 60 points. But if the nations are the same and if the tribes are equal or not
     * I will end up gaining 10 points because we are helping out each other.
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - my life points
     */

    @Override
    public int strategy(People me, People otherPerson)
    {
        if (me.getNation() != otherPerson.getNation())
        {
            if (me.getTribe() != otherPerson.getTribe() || me.getTribe() == otherPerson.getTribe())
            {
                if (otherPerson.getType() == PeopleType.warrior)
                {
                    return me.getLifePoints() + 30;
                    //Even if my wizards get attacked they will fall back and recover by healing themselves
                }
                else if (otherPerson.getType() == PeopleType.wizard)
                {
                    return me.getLifePoints() + 60;
                    //Since they were attacked by that same people, they know how to heal faster
                }
            }
        }
        else if (me.getNation() == otherPerson.getNation())
        {
            if (me.getTribe() != otherPerson.getTribe() || me.getTribe() == otherPerson.getTribe())
            {
                return me.getLifePoints() + 10;
                //The same nation will help each other out, so they will help heal
            }
        }
        return me.getLifePoints();
    }
}
