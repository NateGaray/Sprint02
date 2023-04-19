package Project02;

/**
 * In this strategy the people type will run away when other lifepoints are greater than me lifepoints,
 * and in running away it will take on damage.therefore it will call the healer strategy
 * that will heal the me people type (once) and then it will call the defensive strategy to
 * take on the other people type
 */
public class MarieOffensive extends People{

    public MarieOffensive(String nation, String tribe, PeopleType person, int lifePoints, Strategy strategy) {
        super(nation, tribe, person, lifePoints, strategy);
        myDescription = "\tMarie Offensive Strategy";
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return 0;
    }
}
