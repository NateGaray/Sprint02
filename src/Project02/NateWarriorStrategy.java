package Project02;

/**
 * This class defines the strategy for a warrior from Nate's nation
 */

public class NateWarriorStrategy implements Strategy
{

    /**
     * This method defines the strategy for a warrior from Nate's nation.
     * This is based on if the nations are equal or not.
     * It does not matter what tribe they are from.
     * If the nations are not equal, the warrior will inflict damage on the enemy.
     * If the warrior encounters a wizard from his/her own nation, he/she is healed.
     * If the warrior encounters a warrior from his/her nation, a peaceful encounter occurs.
     */
    @Override
    public int strategy(People me, People otherPerson)
    {
        if (me.getNation() != otherPerson.getNation())
        {
            NateAttackingStrategy attackingStrategy = new NateAttackingStrategy();
            return attackingStrategy.strategy(me, otherPerson);
        }
        else // same nation
        {
            NatePeaceful peaceful = new NatePeaceful();
            return peaceful.strategy(me, otherPerson);
        }
    }
}
