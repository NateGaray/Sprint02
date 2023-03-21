package Project02;

public class JeremyWarriorStrategy implements Strategy
{
    private int lifePoints;

    public int strategy(People me, People otherPerson)
    {
        lifePoints = me.getLifePoints();



        return lifePoints;
    }
}
