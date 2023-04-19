package Project02;

/**
 * This class defines the aggressive strategy for a wizard from Jeremy's nation
 */
public class JeremyAggressiveWizard implements Strategy
{
    /**
     *  In my aggressive strategy it starts off by seeing if the nations are not the same then seeing if
     *  the tribes are not the same then if I have more life points than the other tribe I will end
     *  up doing minus 40 points to that tribe. If I have less points than the other tribe I will end
     *  up doing minus 60 points to the other tribe. Then it just returns my life points.
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - my life points
     */
    @Override
    public int strategy(People me, People otherPerson)
    {
        if (me.getNation() != otherPerson.getNation())
        {
            if (me.getTribe() != otherPerson.getTribe())
            {
                if (me.getLifePoints() > otherPerson.getLifePoints())
                {
                    return otherPerson.getLifePoints() - 40;
                    // The wizards are going to be very aggressive if the other nation is weaker
                }
                else if (me.getLifePoints() < otherPerson.getLifePoints())
                {
                    if (me.getTribe() != otherPerson.getTribe()) {
                        return otherPerson.getLifePoints() - 60;
                        // This will do the most damage if im lower in health and if the tribes
                        // are not the same
                    }
                }
            }
        }
        return me.getLifePoints();
    }
}
