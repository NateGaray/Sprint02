package Project02;

public class NateMediumDamage implements Strategy
{
    @Override
    public int strategy(People me, People otherPerson)
    {
        return me.getLifePoints() / 5;
    }
}
