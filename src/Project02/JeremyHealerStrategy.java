package Project02;

/**
 * This class defines the strategy for a healer from Jeremy's nation
 */
public class JeremyHealerStrategy implements Strategy
{
    /**
     * So the first thing this stratigy does is that it checks to see of the other person is a part
     * of the same nation. Then it sees if I have less points than the other tribe or vise versa. If that
     * is the case then it will create a die with 100 sides on it, and it will roll the die. So if the die
     * rolls below a 39 and above a 70 it will heal 40 life points to my tribe, but if the die ends up rolling
     * in between 40 and 69 it will heal my tribe double the amount of paints. Then lastly it will return the
     * other person life points.
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - the other persons points
     */
    @Override
    public int strategy(People me, People otherPerson)
    {
        if (me.getNation() == otherPerson.getNation())
        {
            if (me.getLifePoints() < otherPerson.getLifePoints() || me.getLifePoints() > otherPerson.getLifePoints())
            {
                Die healingDie = new  Die();
                healingDie.setDie(98);
                healingDie.rollDie();

                if (healingDie.getDie() <= 39 || healingDie.getDie() >= 70)
                {
                    otherPerson.modifyLifePoints(40);
                }
                else if (healingDie.getDie() >= 40 || healingDie.getDie() <= 69)
                {
                    otherPerson.modifyLifePoints(80);
                }
            }
        }
        return otherPerson.getLifePoints();
    }
}
