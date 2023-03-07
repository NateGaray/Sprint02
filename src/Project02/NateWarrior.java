package Project02;


public class NateWarrior extends People
{
    NateWarrior(String nation, String tribe, int lifePoints, Strategy warriorStrategy)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints, warriorStrategy);
        myDescription = "\tNate Warrior";
    }
    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }

}