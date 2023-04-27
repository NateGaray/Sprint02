package Project02;

/**
 * This artifact is a witch.
 * A die will be rolled.
 * Based on the number rolled, a particular potion will be thrown.
 */

public class NateArtifact extends People
{
    /**
     * The constructor for this class gives the description of the artifact created by nate
     * @param nation
     * @param tribe
     * @param lifePoints
     * @param strategy
     */

    public NateArtifact(String nation, String tribe, PeopleType peopleType, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, peopleType, lifePoints, strategy);
        myDescription = "\tNate Artifact";

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
