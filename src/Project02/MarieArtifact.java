package Project02;

// shoukld have a strategy
// make a type of tribe
// should return life points

public class MarieArtifact extends People
{

    public MarieArtifact(String nation, String tribe, PeopleType person, int lifePoints, Strategy strategy) {
        super(nation, tribe, person, lifePoints, strategy);
        myDescription = "\tMarie Artifact";
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me,otherPerson);
    }
}
