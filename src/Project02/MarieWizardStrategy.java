package Project02;

/**
 * 1.
 * This strategy will run offensive strategy during the battle face off.
 * When the wizard faces an opponent(can be any opponent) that is weaker than them,
 * it will attack at a greater strength and causing alot of damage to its opponent.
 * When the wizard faces an opponent that is stronger than them from another nation,
 * and if the opponent is a warrior, the wizard will absorb more attacks for the sake of the tribe. making it loose points
 * if the opponent is a wiard, the wizard will try to convert me to become a part if its tribe
 * if the wizard meets a warrior from the same tribe; it will give off points if the warrior
 * points are dangerously low ie 10 points or less
 */

public class MarieWizardStrategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson) {

        int lifePoints = me.getLifePoints();

        if (me.getNation() != otherPerson.getNation())//different nations
        {
            if (otherPerson.getLifePoints() < 10) {                               //other lifepoints less than 10 //decimate the opponent
                lifePoints = 0;

            }
            if (me.getLifePoints() < otherPerson.getLifePoints()) {
                if (me.getNation() != otherPerson.getNation()) {
                    if (otherPerson.getType() == PeopleType.warrior && me.getType() == PeopleType.wizard) {
                        lifePoints = me.getLifePoints() / 3;
                    }
                if (otherPerson.getType() == PeopleType.wizard && me.getType() == PeopleType.wizard) {
                        lifePoints = otherPerson.getLifePoints()/5; //meWizard dominates cause other wizard on his hometurf
                    }
                }
            }
        }
        return lifePoints;
    }
}

                                                                    //if my lifepoints greater than other

