package Project02;

/**
 * This class creates a healer for Nate's nation.
 * This class inherits the functionality of the People class.
 */

public class NateHealer extends People
{

    /**
     * The constructor for this class gives the description of a warrior from Nate's Nation
     * @param nation
     * @param tribe
     * @param lifePoints
     * @param strategy
     */
    public NateHealer(String nation, String tribe, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, PeopleType.healer, lifePoints, strategy);
        myDescription = "\tNate healer";
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
