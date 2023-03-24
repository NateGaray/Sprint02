package Project02;

/**
 * This class creates a wizard for Jeremy's nation.
 * This class inherits the functionality of the People class.
 */
public class JeremyWizard extends People
{
    /**
     * The constructor for this class gives the description of a wizard from Jeremy's Nation
     * @param nation - The name of the nation
     * @param tribe - The name of the tribe
     * @param lifePoints - The amount of life points that nations/tribe has
     * @param JeremyWizardStrategy - The strategy it implements
     */
    public JeremyWizard(String nation, String tribe, int lifePoints, Strategy JeremyWizardStrategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, JeremyWizardStrategy);
        myDescription = "\tJeremy Wizard";
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
