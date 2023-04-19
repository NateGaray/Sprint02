package Project02;

public class JeremyHealerStrategy implements Strategy
{
    @Override
    public int strategy(People me, People otherPerson)
    {
        if (me.getNation() == otherPerson.getNation())
        {
            if (me.getLifePoints() < otherPerson.getLifePoints() || me.getLifePoints() > otherPerson.getLifePoints())
            {
                Die healingDie = new Die();
                healingDie.setDie(98);
                healingDie.rollDie();

                if (healingDie.getDie() <= 49 || healingDie.getDie() >= 60)
                {
                    otherPerson.modifyLifePoints(30);
                }
                else if (healingDie.getDie() >= 50 || healingDie.getDie() <= 59)
                {
                    otherPerson.modifyLifePoints(60);
                }
            }
        }
        return otherPerson.getLifePoints();
    }
}
