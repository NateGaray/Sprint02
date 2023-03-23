package Project02;

/**
 * This class creates a wizard for Nate's nation.
 * This class inherits the functionality of the People class.
 */

public class NateWarrior extends People
{
    /**
     * The constructor for this class gives the description of a warrior from Nate's Nation
     * @param nation
     * @param tribe
     * @param lifePoints
     * @param strategy
     */
    public NateWarrior(String nation, String tribe, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints, strategy);
        myDescription = "\tNate Warrior";
    }

    /**
     * This method sets the strategy that will be used
     * @param me
     * @param otherPerson
     * @return
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }

}