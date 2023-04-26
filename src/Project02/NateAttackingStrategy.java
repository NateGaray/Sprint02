package Project02;

public class NateAttackingStrategy implements Strategy
{
    @Override
    public int strategy(People me, People otherPerson)
    {
        if (me.getLifePoints() > otherPerson.getLifePoints()
                && me.getLifePoints() > 70)
        {
            NateLightDamage lightDamage = new NateLightDamage();
            return lightDamage.strategy(me, otherPerson);
        }
        else if (me.getLifePoints() == otherPerson.getLifePoints()
                && otherPerson.getLifePoints() < 50)
        {
            NateMediumDamage mediumDamage = new NateMediumDamage();
            return mediumDamage.strategy(me, otherPerson);
        }
        else
        {
            NateHeavyDamage heavyDamage = new NateHeavyDamage();
            return heavyDamage.strategy(me, otherPerson);
        }
    }
}
