package Project02;

public class NateLightDamage implements Strategy
{

    @Override
    public int strategy(People me, People otherPerson)
    {
        int damageTaken;

        if (me.getLifePoints() < 10)
        {
            damageTaken = 1;
        }
        else
        {
            damageTaken = me.getLifePoints() / 10;

        }

        return damageTaken;
    }
}
