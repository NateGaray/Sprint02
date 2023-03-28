package Project02;

/**
 * 1.
 * This strategy will run a defensive strategy during the battle standoff.
 * When the warrior faces of against an opponent that is weaker it will attack at a great force
 * to try to impact the most damage to that opponent.
 * if the opponent is a warrior with lower points, me warrior will attack by taking half of the other warrior points
 * 2.
 * When the warrior faces of against an opponent with the same number of life points, it will work to maker sure
 * it also makes the most impact in that meet.
 * 3.
 * If it meets a stronger opponent, the play will be to engage in the safest way while trying to save guard the
 * points that the warrior has a that time.
 * 4.
 *
 */
public class MarieWarriorStrategy implements Strategy
{
        @Override
        public int strategy(People me, People otherPerson) {
        int lifePoints = me.getLifePoints();
        if (otherPerson.getLifePoints() < me.getLifePoints()){ //other less points than me
            if (me.getType() == PeopleType.warrior && otherPerson.getType() == PeopleType.wizard){ //me is warrior
                lifePoints = 0; //decimate the opponent
            }
            if (me.getLifePoints() == otherPerson.getLifePoints()){
                if (otherPerson.getType() == PeopleType.warrior && me.getType() == PeopleType.warrior){
                    lifePoints = otherPerson.getLifePoints()/2;
                }
            }
        }
        return lifePoints;
    }
}



