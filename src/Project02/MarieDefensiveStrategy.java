package Project02;
/**
 * This class defines the strategy for a conflict resolution in Marie's Strategies
 * if the nations, tribes and types are not equal and other has more life points, it will
 * return my life points divided by 5
 * If latter is false, it will return the other life points in half
 */
public class MarieDefensiveStrategy implements Strategy{
    @Override
    public int strategy(People me, People otherPerson) {
        return 0;
    }
    public static int calculateLifePoints(People me, People otherPerson) {
        if (me.getNation() != otherPerson.getNation() &&
                me.getTribe() != otherPerson.getTribe() &&
                otherPerson.getType() != me.getType()) ;
        if (otherPerson.getLifePoints() > me.getLifePoints())

            return me.getLifePoints() / 5;
        // else if different nation, tribe and type but me life points greater return other life points in half
        return otherPerson.getLifePoints() / 2;
    }
}