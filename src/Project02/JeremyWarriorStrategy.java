package Project02;
/**
 * This class defines the strategy for a warrior from Jeremy's nation
 */
public class JeremyWarriorStrategy implements Strategy
{
    private int lifePoints;

    /**
     * In Jeremy's warrior strategy if is first  checking if the nations are the same and if they are
     * then it checks if the tribes are not the same or are the same. Then it just does one more check
     * to see if I have less point than the other peron vise versa. If that is the case it will use
     * Jeremy's healing strategy. So if the nations are not the same it checks if the tribes the same
     * or not, then if the other person ends up being a wizard it will use Jeremy's aggressive strategy.
     * If the Person ends up being a warrior it will use Jeremy's defensive strategy. Then lastly it will
     * just return the outcome of my heath.
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - Life Points Used for the encounter
     */
    public int strategy(People me, People otherPerson)
    {
        lifePoints = me.getLifePoints();

        if (me.getNation() == otherPerson.getNation())
        {
            if (me.getTribe() != otherPerson.getTribe() || me.getTribe() == otherPerson.getTribe())
            {
                if (me.getLifePoints() > otherPerson.getLifePoints() || me.getLifePoints() < otherPerson.getLifePoints())
                {
                    JeremyHealerStrategy jeremyHealerStrategy = new JeremyHealerStrategy();
                    lifePoints = jeremyHealerStrategy.strategy(me, otherPerson);
                }
            }
        }
        else
        {
            if (me.getNation() != otherPerson.getNation())
            {
                if (me.getTribe() != otherPerson.getTribe() || me.getTribe() == otherPerson.getTribe())
                {
                    if (otherPerson.getType() == PeopleType.wizard)
                    {
                        JeremyAggressiveWarrior jeremyAggressiveWarrior = new JeremyAggressiveWarrior();
                        lifePoints = jeremyAggressiveWarrior.strategy(me, otherPerson);
                    }
                    if (otherPerson.getType() == PeopleType.warrior)
                    {
                        JeremyDefensiveWarrior jeremyDefensiveWarrior = new JeremyDefensiveWarrior();
                        lifePoints = jeremyDefensiveWarrior.strategy(me, otherPerson);
                    }
                }
            }
        }
        return lifePoints;
    }
}
