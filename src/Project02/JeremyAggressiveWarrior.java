package Project02;
/**
 * This class defines the strategy for aggressive warrior from Jeremy's nation
 */
public class JeremyAggressiveWarrior implements Strategy
{
    /**
     * In Jeremy's aggressive warrior, it first checks if the nation are not the same, and then
     * it checks to see of the tribes are the same or if they are the same. So then it checks if
     * I have more life points than the other nation and if that's the case then I will take away half
     * the other tribes points away. Then if I end up having less points than the other tribe I will be able
     * to be sneaky and steal some gear from them making me stringer by adding 50 points to myself. Lastly
     * it just returns my points at the end of the outcome.
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
                if (me.getLifePoints() > otherPerson.getLifePoints())
                {
                    return otherPerson.getLifePoints() / 2;
                    //If I have more life points than the other person, I can easily overtake them
                }
                else if (me.getLifePoints() < otherPerson.getLifePoints())
                {
                    return me.getLifePoints() + 50;
                    //If I have less points than the other person, I will be very sneaky and steal gear
                    //from the other tribe.
                }
            }
        }
        return me.getLifePoints();
    }
}
