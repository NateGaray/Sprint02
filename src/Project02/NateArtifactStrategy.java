package Project02;

public class NateArtifactStrategy implements Strategy
{
    @Override
    public int strategy(People me, People otherPerson)
    {
        Die die = new Die();
        die.setDie(10);
        die.rollDie();

        if (die.getDie() == 2)
        {
            NateHealingPotion healingPotion = new NateHealingPotion();
            return healingPotion.strategy(me, otherPerson);
        }
        else if (die.getDie() == 9)
        {
            NateDamagePotion damagePotion = new NateDamagePotion();
            return damagePotion.strategy(me, otherPerson);
        }
        else
        {
            NateNothingHappens nothingHappens = new NateNothingHappens();
            return nothingHappens.strategy(me, otherPerson);
        }
    }
}
