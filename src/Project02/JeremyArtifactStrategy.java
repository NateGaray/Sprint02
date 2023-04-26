package Project02;

/**
 * This class defines the strategy for an artifact from Jeremy's nation
 */
public class JeremyArtifactStrategy implements Strategy
{
    /**
     * So the first thing that this strategy is doing is seeing if the nation are not the same.
     * Then it is checking if the tribes are the same or not the same. The if I end up having
     * less than 10 heath left I will use a strength potion, and it will multiply my damage. So if
     * I end up having less than 5 health I will end up doing triple the amount of damage to the
     * other person. Then lastly it just returns the other persons life points.
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - re turns other persons life points
     */
    @Override
    public int strategy(People me, People otherPerson)
    {
        if (me.getNation() != otherPerson.getNation())
        {
            if (me.getTribe() != otherPerson.getTribe() || me.getTribe() == otherPerson.getTribe())
            {
                if (me.getLifePoints() <= 10)
                {
                    return otherPerson.getLifePoints() - 50;
                    //If im less than 10 health I will pop a low level strength potion to multiply my damage
                }
                else if (me.getLifePoints() <= 5)
                {
                    return otherPerson.getLifePoints() - 90;
                    //If I less than 5 health I will pop a high level strength potion to multiply my damage
                    //even more
                }
            }
        }
        return otherPerson.getLifePoints();
    }
}
