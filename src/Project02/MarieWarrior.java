package Project02;
/**
 * This class creates a warrior for Marie's nation.
 * This class inherits the functionality of the People class.
 */
public class MarieWarrior extends People{
    public MarieWarrior(String nation, String tribe, int lifePoints, Strategy MarieWarriorStrategy)
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
