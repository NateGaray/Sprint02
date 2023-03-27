import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MarieWarriorTests
{
//@Test
//    public void testDifferentNationDifferentTribeDifferentPeople()
//    {
//    MarieWarriorStrategy marieWarriorStrategy = new MarieWarriorStrategy();
//
//    People England = new MarieWizard("Idiot","1",100,marieWarriorStrategy);
//    People Russia = new MarieWizard("Minion","2",100,marieWarriorStrategy);
//    marieWarriorStrategy.strategy(England,Russia);
//    assertEquals(100,marieWarriorStrategy.strategy(Russia,England));
//    }
@Test
    public void testDifferentNationDifferentTribeDifferentPeopleLessLifePointsThanMe(){
    MarieWizardStrategy marieWizardStrategy1 = new MarieWizardStrategy();
    MarieWizardStrategy marieWizardStrategy2 = new MarieWizardStrategy();
    People England = new MarieWizard("Idiot", "1", 100, marieWizardStrategy1);
    People Russia = new MarieWizard("Minions", "2", 98, marieWizardStrategy2);
    assertEquals(50, marieWizardStrategy1.strategy(England,Russia));
    assertEquals(0,marieWizardStrategy2.strategy(Russia, England));
    }


    @Test
    public void testDecimateOpponentIfPointsLessThan10(){
    MarieWizardStrategy marieWizardStrategy = new MarieWizardStrategy();
    People England = new MarieWizard("Idiot", "2",100,marieWizardStrategy);
    People Russia = new MarieWizard("Minions", "2",9,marieWizardStrategy);
    assertEquals(0,marieWizardStrategy.strategy(England, Russia));
    }

    @Test
    public void testSubtract5FromOpponentIfPointsLessThanMine(){
    MarieWizardStrategy marieWizardStrategy = new MarieWizardStrategy();
    People England = new MarieWizard("Idiot", "3", 55,marieWizardStrategy);
    People Russia = new MarieWizard("Minions", "3", 54, marieWizardStrategy);
    assertEquals(49,marieWizardStrategy.strategy(England,Russia));
    }

    @Test
    public void testSpecificPeopleTypeAndOtherPointsGreaterThanMePoints(){
    MarieWizardStrategy marieWizardStrategy = new MarieWizardStrategy();
   People meWizard = new MarieWarrior("Idiot","5",25,marieWizardStrategy);
   People otherWarrior = new MarieWarrior("Minions", "3", 35,marieWizardStrategy);
   if (otherWarrior.getType()== PeopleType.warrior)
       int lifePoints = meWizard.modifyLi; / 2;

    }

}

