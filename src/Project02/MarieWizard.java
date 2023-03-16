package Project02;

public class MarieWizard extends People
{
    MarieWizard(String nation, String tribe, int lifePoints, Strategy MarieWizardStrategy)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints, MarieWizardStrategy);
        myDescription = "\tMarie Wizard";
    }
    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return 0;

    }
}
