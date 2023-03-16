package Project02;

public class NateWizardStrategy implements Strategy
{
    private int lifePoints;
    @Override
    public int strategy(People me, People otherPerson)
    {
        lifePoints = me.getLifePoints();
        if (me.getNation() == otherPerson.getNation())
        {
            otherPerson.modifyLifePoints(lifePoints / 10); //heals ally
            lifePoints -= (lifePoints / 10); //takes damage
        }
        else
        {
            if (me.getLifePoints() > otherPerson.getLifePoints())
            {
                lifePoints = otherPerson.getLifePoints();
            }
            else
            {
                lifePoints -= otherPerson.getLifePoints() - me.getLifePoints();
            }
        }
        return lifePoints;
    }
}
