package Project02;

public class JeremyHealer extends People
{

    public JeremyHealer(String nation, String tribe, PeopleType person, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, person, lifePoints, strategy);
        myDescription = "\tJeremy Healer";
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
