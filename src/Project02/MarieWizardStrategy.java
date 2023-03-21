package Project02;

/**
 * This strategy will run offensive strategy during the battle face off.
 * When the wizard faces an opponent(can be any opponent) that is weaker than them from another nation,
 * it will attack at a greater strength and cause more damage to its opponent.
 *
 * When the wizard faces an opponent that is stronger than them from another nation,
 * if the opponent is a warrior, the wizard will absorb more attacks for the sake of the tribe. making it loose points
 * if the opponet is a wiard, the wizard will try to convert it to become a part if its tribe
 * if the wizard meets a warrior from the same tribe; it will give off points if the warrior
 * points are dangerously low ie 10 points or less
 */

public class MarieWizardStrategy implements Strategy
{

    @Override
    public int strategy(People me, People otherPerson)
    {
        int lifePoints = 0;
        String convertPerson;

            if (me.getNation() != otherPerson.getNation()){

                if (otherPerson.getLifePoints() < me.getLifePoints())
                {
                    if(otherPerson.getType() == PeopleType.warrior)
                        lifePoints = me.getLifePoints()/2;
                }
            }
            else if (me.getNation() != otherPerson.getNation())
            {
                if(otherPerson.getLifePoints() > me.getLifePoints()){
                    if(otherPerson.getType() == PeopleType.wizard)
                        lifePoints = otherPerson.getLifePoints()/2;
                }
            else if(me.getNation() != otherPerson.getNation() && otherPerson.getLifePoints() < me.getLifePoints() && otherPerson.getType() == PeopleType.wizard)
               {
                        convertPerson = otherPerson.encounterStrategy;
                }
            }
            if(me.getLifePoints() > otherPerson.getLifePoints()){
                if(otherPerson.getType() == PeopleType.warrior && me.getType() == PeopleType.wizard){
                    int giveOutLifePointsToAlly = me;
                }

        } else if (me.getNation() != otherPerson.getNation())

        {
            if (otherPerson.getLifePoints() > me.getLifePoints())
            {
                lifePoints = -me.getLifePoints();

            }
            else if (me.getNation() == otherPerson.getNation())
            {

            }

        } else if (me.getNation() == otherPerson.getNation())

        {
            if (otherPerson.getLifePoints() < me.getLifePoints())
            {
                lifePoints = -me.getLifePoints();
            }

        }
        return lifePoints;
    }


}
