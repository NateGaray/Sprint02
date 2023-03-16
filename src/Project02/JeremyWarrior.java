package Project02;

public class JeremyWarrior extends People
{

    JeremyWarrior(String nation, String tribe, int lifePoints, Strategy JeremyWarriorStrategy)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints, JeremyWarriorStrategy);
        myDescription = "\tJeremy Warrior";
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return 0;
    }
}
