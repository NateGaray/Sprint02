package Project02;

public class MarieWarrior extends People{
    MarieWarrior(String nation, String tribe, int lifePoints, Strategy MarieWarriorStrategy)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints, MarieWarriorStrategy);
        myDescription = "\tMarie Warrior";
    }
    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return 0;
    }
}
