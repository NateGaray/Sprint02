package Project02;

public class NateWizardSuperSpell implements Strategy
{

    @Override
    public int strategy(People me, People otherPerson)
    {
        otherPerson.modifyLifePoints(-(otherPerson.getLifePoints() - 1));

        return otherPerson.getLifePoints();
    }
}
