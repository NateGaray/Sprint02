package Project02;

/**
 * This class represents a potion that heals a player
 */

public class NateHealingPotion implements Strategy
{
    /**
     * This simple strategy returns 2
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return
     */

    @Override
    public int strategy(People me, People otherPerson)
    {
        return 2;
    }
}
