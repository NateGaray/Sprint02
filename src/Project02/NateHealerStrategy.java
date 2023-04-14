package Project02;

public class NateHealerStrategy implements Strategy
{

    @Override
    public int strategy(People me, People otherPerson)
    {
        Die die = new Die();
        die.setDie(98);
        die.rollDie();
        otherPerson.modifyLifePoints(die.getDie());

        if (otherPerson.getLifePoints() > 100)
        {
            otherPerson.modifyLifePoints(-(otherPerson.getLifePoints() - 100));
        }

        return otherPerson.getLifePoints();
    }
}
