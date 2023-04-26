package Project02;

/**
 * This class defines the strategy for a healer from Nate's nation
 */

public class NateHealerStrategy implements Strategy
{
    /**
     * This method defines the strategy for a warrior from Nate's nation.
     * This is based on the roll of a die.
     */

    @Override
    public int strategy(People me, People otherPerson)
    {
        int lifePoints = me.getLifePoints();

        Die die = new Die();
        die.setDie(100);
        die.rollDie();

        if (me.getNation() == otherPerson.getNation())
        {
            otherPerson.modifyLifePoints(die.getDie());

            return otherPerson.getLifePoints();
        }
        else
        {
            if (lifePoints >= 50)
            {
                lifePoints -= 10;
            }
            else
            {
                lifePoints -= 3;
            }
        }

        return lifePoints;
    }
}
