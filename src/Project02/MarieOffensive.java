package Project02;

public class MarieHealer extends People{

    public MarieHealer(String nation, String tribe, PeopleType person, int lifePoints, Strategy strategy) {
        super(nation, tribe, person, lifePoints, strategy);
        myDescription = "\tMarie Healer";
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return 0;
    }
}
