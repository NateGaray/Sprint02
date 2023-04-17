package Project02;

public class NateHeavyDamage implements Strategy
{

    @Override
    public int strategy(People me, People otherPerson)
    {
        return me.getLifePoints() / 2;
    }
}
