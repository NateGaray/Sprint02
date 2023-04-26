package Project02;

/**
 * This artifact is a witch.
 * A die will be rolled.
 * Based on the number rolled, a particular potion will be thrown.
 */

public class NatesArtifact extends People
{
    public NatesArtifact(String nation, String tribe, PeopleType person, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, person, lifePoints, strategy);
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson) 
    {
        return 0;
    }
}
