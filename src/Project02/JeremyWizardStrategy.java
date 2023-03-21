package Project02;


public class JeremyWizardStrategy implements Strategy {

    /**
     * In my JeremyWizardStrategy class, this strategy is kind of a balance
     * of a lot of different strategy. In the first part of this strategy, it
     * is more aggressive if the nations do not equal and the more that they are not
     * alike the more damage is dealt. The for the defensive part, if the other person is a
     * warrior he wizards will end up running way to play it safe. Lastly if the nations end up
     * being the same then they have the potential of healing an ally.
     *  @param me - person to get life points for.
     *  @param otherPerson - the opponent of the encounter
     *  @return - Life points used in the encounter
     */
    private int lifePoints;

    public int strategy(People me, People otherPerson) {

        lifePoints = me.getLifePoints();

        if (me.getNation() != otherPerson.getNation())
        {
            if (me.getTribe() != otherPerson.getTribe())
            {
                lifePoints = otherPerson.getLifePoints() - 3;

                if (me.getLifePoints() == otherPerson.getLifePoints())
                {
                    lifePoints = otherPerson.getLifePoints() - 6;
                }
                else
                {
                    if (otherPerson.getType() == PeopleType.warrior) // run away
                    {
                        lifePoints = -me.getLifePoints();
                    }
                }
            }
        }
        else
        {
            if (me.getNation() == otherPerson.getNation())
            {
                if (me.getLifePoints() < otherPerson.getLifePoints() || me.getLifePoints() > otherPerson.getLifePoints())
                {
                    otherPerson.modifyLifePoints(lifePoints / 10); //heals ally
                    lifePoints -= (lifePoints / 10); //takes damage
                }
            }

        }
        return lifePoints;
    }
}




