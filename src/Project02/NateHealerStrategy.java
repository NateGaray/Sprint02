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
        die.setDie(98);
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
                lifePoints -= lifePoints / 2;
            }
            else if (lifePoints >= 25)
            {
                lifePoints -= lifePoints / 4;
            }
            else
            {
                if (lifePoints < 10)
                {
                    lifePoints -= 1;
                }
                else
                {
                    lifePoints -= lifePoints / 10;
                }
            }
        }

        return lifePoints;
    }
}
