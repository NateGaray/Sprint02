package Project02;

/**
 * In this strategy the people type will run away when other lifepoints are greater than me lifepoints,
 * and in running away it will take on damage.therefore it will call the healer strategy
 * that will heal the me people type (once) and then it will call the defensive strategy to
 * take on the other people type
 */
public class MarieHealerStrategy implements Strategy{
    @Override
    public int strategy(People me, People otherPerson) {
        int mePointsLeftAfterRunning = 0;
        Die die = new Die();
        die.setDie(98);
        die.rollDie();
        if (me.getNation() == otherPerson.getNation()) {
            me.modifyLifePoints(die.getDie());
        }else if (otherPerson.getLifePoints() > me.getLifePoints())
        {
            mePointsLeftAfterRunning = me.getLifePoints() - 15;
        }
        return mePointsLeftAfterRunning;
    }
}