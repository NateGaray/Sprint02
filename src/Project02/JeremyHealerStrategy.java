package Project02;

public class JeremyHealerStrategy implements Strategy
{
    @Override
    public int strategy(People me, People otherPerson)
    {
        Die healingDie = new Die();
        healingDie.setDie(98);
        healingDie.rollDie();
        otherPerson.modifyLifePoints(healingDie.getDie());

        return otherPerson.getLifePoints();
    }
}
