package Project02;
/**
 * This class defines the strategy for a wizard from Jeremy's nation
 */
public class JeremyWizardStrategy implements Strategy {

    private int lifePoints;

    /**
     *  In my wizard strategy class it is first checking of the nations are not equal then
     *  checking if the tribes are not the same, and if that's the case it will move toward my
     *  aggressive strategy and go thought that. If the tribes end up being the same tho it will use
     *  my defensive strategy instead. So if the nations end up being the same then it will also use
     *  my defensive strategy. One last thing my strategy has is if the nations are the same I have less
     *  life points than the person im going against witch is my teammate, I will end up using a healer.
     *  Lastly if the life points end up going above 100 it will set them back to 100.
     *  @param me - person to get life points for
     *  @param otherPerson - the opponent of the encounter
     *  @return - Life points used in the encounter
     */
    public int strategy(People me, People otherPerson) {

        lifePoints = me.getLifePoints();

        if (me.getNation() != otherPerson.getNation())
        {
            if (me.getTribe() != otherPerson.getTribe())
            {
                JeremyAggressiveWizard jeremyAggressiveWizard = new JeremyAggressiveWizard();
                lifePoints = jeremyAggressiveWizard.strategy(me, otherPerson);
            }
            else if (me.getTribe() == otherPerson.getTribe())
            {
                JeremyDefensiveWizard jeremyDefensiveWizard = new JeremyDefensiveWizard();
                lifePoints = jeremyDefensiveWizard.strategy(me, otherPerson);
            }
        }
        else
        {
            if (me.getNation() == otherPerson.getNation())
            {
                JeremyDefensiveWizard jeremyDefensiveWizard = new JeremyDefensiveWizard();
                lifePoints = jeremyDefensiveWizard.strategy(me, otherPerson);
            }
                if (me.getLifePoints() < otherPerson.getLifePoints())
                {
                    JeremyHealerStrategy jeremyHealerStrategy = new JeremyHealerStrategy();
                    lifePoints = jeremyHealerStrategy.strategy(me, otherPerson);
                }
            }
        return lifePoints;
    }
}




