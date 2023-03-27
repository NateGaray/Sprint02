package Project02;

public class MarieWizard extends People
{
    public MarieWizard(String nation, String tribe, int lifePoints, Strategy MarieWizardStrategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, MarieWizardStrategy);
        myDescription = "\tMarie Wizard";
    }
    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me,otherPerson);

    }
}
