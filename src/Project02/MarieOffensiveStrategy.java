package Project02;

/**
 * Implement a healer player which will only be able to heal friendly people (from same nation).
 * Amount of healing to be determined by a roll of the dice.
 */
public class MarieHealerStrategy implements Strategy{

    @Override
    public int strategy(People me, People otherPerson)
    {
        if (me.getNation() == otherPerson.getNation())
            if (me.getLifePoints() < otherPerson.getLifePoints())
        {
            Die die = new Die();
            die.setDie(6);
            System.out.println(die);
            die.rollDie();
            System.out.println(die);
            return me.getLifePoints() + 10;
        }else if (otherPerson.getLifePoints() > me.getLifePoints()){
                Die die = new Die();
                die.setDie(6);
                die.rollDie();
            }return otherPerson.getLifePoints() * 2;
    }
}
