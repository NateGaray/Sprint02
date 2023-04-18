package Project02;

public class NateLightDamage implements Strategy
{

    @Override
    public int strategy(People me, People otherPerson)
    {
        return me.getLifePoints() / 10;
    }
}
