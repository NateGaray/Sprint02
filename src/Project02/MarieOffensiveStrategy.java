package Project02;

/**
 * In this strategy the me people type will run away when other lifepoints are greater ,
 * and in running away it will take on damage.therefore it will call the healer strategy
 * that will heal the me people type (once) and then it will call the defensive strategy to
 * take on the other people type
 */
public class MarieOffensiveStrategy implements Strategy{
    @Override
    public int strategy(People me, People otherPerson)
    {
        int lifePoints;
    if (me.getNation() != otherPerson.getNation() && me.getTribe() != otherPerson.getTribe()){
        if (me.getLifePoints() < otherPerson.getLifePoints()){
            if (otherPerson.getType() == PeopleType.warrior)
            {
                lifePoints = me.getLifePoints() - 15; // always run away
            }
        }
    }
    else if (me.getNation() != otherPerson.getNation() && me.getTribe() != otherPerson.getTribe()){
        if (me.getLifePoints() > otherPerson.getLifePoints()){
            if(otherPerson.getType() == PeopleType.warrior){
                return MarieDefensive.calculateLifePoints(me, otherPerson);
            }
        }
    }else return MariePeaceful.calculateLifePoints(me,otherPerson);

    }
}
