package Project02;

/**
 * This class defines the strategy for a wizard from Marie's nation
 * will cause minimal damage if other life points are less than me life points
 * and other is from a different tribe and nation. In the same breath is other has more life points
 * it will cause maximum damage
 * if nations and tribes are equal and other lifepoints is greater it will call the Marie Peaceful strategy
 * if the opposite is true, it will call cast a spell by calling the Marie Defensive Strategy
 */
public class MarieWizardStrategy implements Strategy{
    @Override
    public int strategy(People me, People otherPerson) {
            int myLifePoints = me.getLifePoints();
            int otherLifePoints = otherPerson.getLifePoints();
        // if other is a wizard from different nation and tribe
        if (otherPerson.getType() == PeopleType.wizard && otherPerson.getNation() != me.getNation()
                    && otherPerson.getTribe() != me.getTribe()) {
                // if other life points are also less than my life points
                if (otherLifePoints < myLifePoints) {
                    // attack causing as minimal damage as possible
                    return otherLifePoints/4;
                } else {
                    // if meo has more life points than me attack to cause as much damage as possible
                    return otherLifePoints / 2;
                }
            } else if (otherPerson.getNation() == me.getNation() &&
                    otherPerson.getTribe() == me.getTribe() && otherPerson.getLifePoints() > me.getLifePoints()) {
                return MariePeaceful.calculateLifePoints(me, otherPerson);
            } else {
                return MarieDefensive.calculateLifePoints(me, otherPerson);
            }

        }
    }