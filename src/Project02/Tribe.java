package Project02;
import java.util.Collection;
import java.util.Collections;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import Project02.People;
import Project02.PeopleType;
import Project02.SchaperWarrior;
import Project02.SchaperWizard;


public class Tribe
{
    private String nationName;
    private String tribeName;
    private int tribeLifePoints;
    private ArrayList<People> members = new ArrayList<>();
    private ArrayList<People> livingMembers = new ArrayList<>();

    public Tribe(String nation, String tribe, int lifePoints)
    {
        nationName = nation;
        tribeName = tribe;
        tribeLifePoints = lifePoints;
        for(int i = 0; i < 2; i++)
            if(i % 2 == 0)
            {
                members.add(new SchaperWarrior("Schaper", tribeName, tribeLifePoints / 2, new WarriorStrategy()));
                members.add(new NateWarrior("Nate", tribeName, tribeLifePoints / 2, new NateWarriorStrategy()));
                members.add(new MarieWarrior("Marie", tribeName, tribeLifePoints / 2, new MarieWarriorStrategy()));
                members.add(new JeremyWarrior("Jeremy", tribeName, tribeLifePoints / 2, new JeremyWarriorStrategy()));
            }
            else
            {
                members.add(new SchaperWizard("Schaper", tribeName, tribeLifePoints / 2, new WizardStrategy()));
                members.add(new NateWizard("Nate", tribeName, tribeLifePoints / 2, new NateWizardStrategy()));
                members.add(new MarieWizard("Marie", tribeName, tribeLifePoints / 2, new MarieWizardStrategy()));
                members.add(new JeremyWizard("Jeremy", tribeName, tribeLifePoints / 2, new JeremyWizardStrategy()));
            }
        for(int i = 0; i < members.size(); i++)
            livingMembers.addAll(members);
    }

    public ArrayList<People> getLivingTribeMembers()
    {
        livingMembers.clear();
        tribeLifePoints = 0;
        for(int person = 0; person < members.size(); person++)
        {
            if(members.get(person).isPersonAlive())
            {
                livingMembers.add(members.get(person));
                tribeLifePoints += members.get(person).getLifePoints();
                //System.out.println(members.get(person));
            }
            else
            {
                if(!(members.get(person).getDead()))
                {
                    members.get(person).setDead();
                    System.out.println("\t\t" + members.get(person) + " is dead!");
                }
            }
        }
        //System.out.println(livingMembers);
        return livingMembers;
    }
    /*
    public void printMembers()
    {
        for(int i = 0; i < 2; i++)
        {
            System.out.println(people.get(i));
        }
    }
*/


    public int getTribeSize()
    {
        return livingMembers.size();
    }

    public Boolean isTribeAlive()
    {
        return (tribeLifePoints > 0);
    }


    public int getTribeLifePoints()
    {
        return tribeLifePoints;
    }

    public String getTribeName()
    {
        return tribeName;
    }

    public String toString()
    {
        String result = "\0";

        result = tribeName;
        for(int i = 0; i < members.size(); i++)
        {
            result = result + '\n' + members.get(i).toString();
        }
        result = result + '\n';
        return result;
    }

}
