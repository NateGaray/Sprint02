package Project02;
/**
 * This class creates an artifact for Jeremy's nation.
 * This class inherits the functionality of the People class.
 */
public class JeremyArtifact extends People
{
    /**
     * The constructor for this class gives the description of a warrior from Jeremy's Nation
     * @param nation - The name of the nation
     * @param tribe - The name of the tribe
     * @param lifePoints - The amount of life points that nations/tribe has
     * @param jeremyArtifact - The strategy it implements
     */
    public JeremyArtifact(String nation, String tribe, PeopleType person, int lifePoints, Strategy jeremyArtifact)
    {
        super(nation, tribe, person, lifePoints, jeremyArtifact);
    }

    /**
     * This method sets the strategy that will be used
     * @param me - Who I am plying as
     * @param otherPerson - Could be friendly or non-friendly
     * @return - returns the strategy
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
