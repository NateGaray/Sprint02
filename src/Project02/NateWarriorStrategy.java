package Project02;

public class NateWarriorStrategy implements Strategy
{
    int lifePoints;
    @Override
    public int strategy(People me, People otherPerson)
    {
        lifePoints = me.getLifePoints();

        if (me.getNation() != otherPerson.getNation())
        {
            if (me.getLifePoints() >= 100)
            {
                lifePoints -= 5; //takes damage
            }
            else
            {
                if (me.getLifePoints() > otherPerson.getLifePoints())
                {
                    lifePoints = otherPerson.getLifePoints();
                }
                else if (me.getLifePoints() == otherPerson.getLifePoints())
                {
                    lifePoints += 0; //nothing happens
                }
                else
                {
                    lifePoints -= (otherPerson.getLifePoints() / 10);
                }
            }
        }
        else if (me.getNation() == otherPerson.getNation() && otherPerson.getType() == PeopleType.wizard)
        {

            lifePoints += (otherPerson.getLifePoints() / 10); //gets healed by ally wizard
            otherPerson.modifyLifePoints(-(otherPerson.getLifePoints() / 10)); //ally wizard takes damage
        }
        else
        {
            lifePoints += 0; //nothing happens
        }

        return lifePoints;
    }
}
