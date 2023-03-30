import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MarieWizardTests
{
@Test

    public void testDifferentNationDifferentTribeDifferentPeople()
    {
    MarieWizardStrategy marieWizardStrategy = new MarieWizardStrategy();

    People England = new MarieWizard("Idiot","1",99,marieWizardStrategy);
    People Russia = new MarieWizard("Minion","2",100,marieWizardStrategy);
    marieWizardStrategy.strategy(England,Russia);
    assertEquals(20,marieWizardStrategy.strategy(England,Russia));
    }
@Test
    public void testDecimateOpponentIfPointsLessThan10AndTribeAndNationDifferent(){
    MarieWizardStrategy marieWizardStrategy1 = new MarieWizardStrategy();
    MarieWizardStrategy marieWizardStrategy2 = new MarieWizardStrategy();
    People England = new MarieWizard("Idiot", "1", 100, marieWizardStrategy1);
    People Russia = new MarieWizard("Minions", "2", 8, marieWizardStrategy2);
    assertEquals(0,marieWizardStrategy2.strategy(England, Russia));
    }

    @Test
    public void testIfMePointsLessThanOtherLifePointsNationsNotEqualOtherWarriorMeWizard(){
    MarieWizardStrategy marieWizardStrategy = new MarieWizardStrategy();
    People England = new MarieWizard("Idiot", "2",9,marieWizardStrategy);
    People Russia = new MarieWarrior("Minions", "2",100,marieWizardStrategy);
    assertEquals(3,marieWizardStrategy.strategy(England, Russia));
    }
}

