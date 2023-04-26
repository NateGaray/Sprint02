package Project02;

public class NateAttackingStrategy implements Strategy
{
    @Override
    public int strategy(People me, People otherPerson)
    {
        if (me.getLifePoints() > otherPerson.getLifePoints())
        {
            NateHeavyDamage heavyDamage = new NateHeavyDamage();
            return heavyDamage.strategy(me, otherPerson);
        }
        else if (me.getLifePoints() == otherPerson.getLifePoints())
        {
            NateMediumDamage mediumDamage = new NateMediumDamage();
            return mediumDamage.strategy(me, otherPerson);
        }
        else
        {
            NateLightDamage lightDamage = new NateLightDamage();
            return lightDamage.strategy(me, otherPerson);
        }
    }
}
