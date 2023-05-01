package Project02;

public class MarieArtifactStrategy implements Strategy {

/*
This class will stimulate the invisibility cloak in Harry Potter. This cloak will hide the
person in this case weak wizards or warriors from strong opponents. It will protect them till
those opponents move on to the next round. The premise is to hide till the opponent weakens and
attacking using my defensive strategy.
 */

    @Override
    public int strategy(People me, People otherPerson) {
        int coveredCloak = 45;
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation())
            if (me.getTribe() != otherPerson.getTribe()
                    && otherPerson.getLifePoints() > me.getLifePoints()) {
                lifePoints = me.getLifePoints() + coveredCloak; //the invisible cloak attaches itself to increase me lifepoints
                return lifePoints;
            } else if (me.getNation() == otherPerson.getNation())
                if (me.getTribe() == otherPerson.getTribe() && otherPerson.getLifePoints() == me.getLifePoints()) {
                    MariePeacefulStrategy.calculateLifePoints(me, otherPerson);
                }
        return coveredCloak;
    }
}

