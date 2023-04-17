package Project02;

public class NateHealingSpecial implements Strategy
{

    @Override
    public int strategy(People me, People otherPerson)
    {
        return me.getLifePoints() + 12;
    }
}
