package Project02;

/**
 * This class defines the strategy for a witch;
 */

public class NateArtifactStrategy implements Strategy
{
    /**
     * This strategy determines if an encountered player will get healed take damage or nothing will happen
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return
     */

    @Override
    public int strategy(People me, People otherPerson)
    {
        Die die = new Die();
        die.setDie(30);
        die.rollDie();

        if (die.getDie() % 3 == 0)
        {
           return otherPerson.getLifePoints() - 5;
        }
        else if (die.getDie() % 3 == 1)
        {
            return otherPerson.getLifePoints() - 12;
        }
        else
        {
            return otherPerson.getLifePoints() - 21;
        }
    }
}
