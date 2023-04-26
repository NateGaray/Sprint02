package Project02;

/**
 * This class defines the strategy for a witch
 * The witch trows potions that can either cause damage, heal, or do nothing
 */

public class NateArtifactStrategy implements Strategy
{
    /**
     * This strategy determines if an encountered player will take damage, get healed, or nothing will happen
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return
     */

    @Override
    public int strategy(People me, People otherPerson)
    {
        Die die = new Die();
        die.setDie(40);
        die.rollDie();

        if (die.getDie() == 17)
        {
           return otherPerson.getLifePoints(); // Decoy potion. No damage dealt.
        }
        else if (die.getDie() % 4 == 0)
        {
            return otherPerson.getLifePoints() - 5; // Damage potion
        }
        else if (die.getDie() % 4 == 1)
        {
            return otherPerson.getLifePoints() + 5; // Healing potion
        }
        else if (die.getDie() % 4 == 2)
        {
            return otherPerson.getLifePoints() - 12; // Damage potion
        }
        else
        {
            return otherPerson.getLifePoints() + 12; // Healing potion
        }
    }
}
