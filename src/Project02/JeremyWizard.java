package Project02;

public class JeremyWizard extends People
{
    public JeremyWizard(String nation, String tribe, int lifePoints, Strategy JeremyWizardStrategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, JeremyWizardStrategy);
        myDescription = "\tJeremy Wizard";

    }

    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }

}
