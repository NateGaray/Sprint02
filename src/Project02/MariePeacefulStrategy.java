package Project02;
/**
 * This class defines the strategy for a peaceful resolution in Marie's Strategies
 * if the nations, tribes and types are equal and other has more life points, it will
 * exchange life points with me type regardless.
 * If latter is false, it will cast a spell by calling Marie Defensive Strategy
 */
public class MariePeacefulStrategy implements  Strategy{

    public static int calculateLifePoints(People me, People otherPerson) {
        if (me.getNation() == otherPerson.getNation() &&
        me.getTribe() == otherPerson.getTribe() && otherPerson.getLifePoints() > me.getLifePoints()
        && me.getType() == otherPerson.getType()){
            // if same nation, same tribe, same type peacefully exchange points
            int pointsToShare = otherPerson.getLifePoints() - 25;
            return pointsToShare + me.getLifePoints();
        }else {
            return MarieDefensiveStrategy.calculateLifePoints(me, otherPerson);
        }
    }

    @Override
    public int strategy(People me, People otherPerson) {
        return MariePeacefulStrategy.calculateLifePoints(me, otherPerson);
    }
}
