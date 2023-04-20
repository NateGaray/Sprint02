package Project02;

/**
 * This class defines the strategy for a defensive warrior from Jeremy's nation
 */
public class JeremyDefensiveWarrior implements Strategy
{
    /**
     * In Jeremy's defence strategy it is first checking to see if the nations are not the same
     * then it checks if the tribes are not the same and if I have more points than the other tribe. If
     * I end up having more than my points will be multiplied by 2 because im stronger than them. So in
     * the case where the tribes are not the same but the other person has more points than me, I will just
     * run away because im playing more on the defensive side. Lastly it just returns my points.
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - my life points
     */
    @Override
    public int strategy(People me, People otherPerson)
    {
        if (me.getNation() != otherPerson.getNation())
        {
            if (me.getTribe() != otherPerson.getTribe() && me.getLifePoints() > otherPerson.getLifePoints())
            {
                return me.getLifePoints() * 2;
                //If I am stronger than the other opponent, I will sneak over and steal there supplies
            }
            else if (me.getTribe() != otherPerson.getTribe() && me.getLifePoints() < otherPerson.getLifePoints())
            {
                return -me.getLifePoints();
                //If I have less health than the other opponent, I will run away
            }
        }
        return me.getLifePoints();
    }
}
