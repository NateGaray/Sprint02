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
            int healingReceived = otherPerson.getLifePoints();

            NateHealingPotion healingPotion = new NateHealingPotion();
            healingReceived *= healingPotion.strategy(me, otherPerson);

            return healingReceived;
        }
        else if (die.getDie() == 9)
        {
            int damageTaken = otherPerson.getLifePoints();

            NateDamagePotion damagePotion = new NateDamagePotion();
            damageTaken /= damagePotion.strategy(me, otherPerson);

            return damageTaken;
        }
        else
        {
            NateNothingHappens nothingHappens = new NateNothingHappens();

            return nothingHappens.strategy(me, otherPerson); // Decoy potion
        }
    }
}
