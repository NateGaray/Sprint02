package Project02;

public class NateHealer extends People
{
    public NateHealer(String nation, String tribe, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, PeopleType.healer, lifePoints, strategy);
        myDescription = "\tNate healer";
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
