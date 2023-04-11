import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MarieWizardTests {
    @Test
    public void testWizardStrategy1() {
        MarieWizardStrategy wizardStrategy = new MarieWizardStrategy();
        People me = new MarieWizard("Minions", "2", 35, wizardStrategy);
        People other = new MarieWizard("Idiots", "1", 34, wizardStrategy);
        assertEquals(8, wizardStrategy.strategy(me, other));
    }

    @Test
    public void testWizardStrategy2() {
        MarieWizardStrategy wizardStrategy = new MarieWizardStrategy();
        People me = new MarieWizard("Minions", "2", 34, wizardStrategy);
        People other = new MarieWizard("Idiots", "1", 35, wizardStrategy);
        assertEquals(17, wizardStrategy.strategy(me, other));
    }

    @Test
    public void testSameTribeSameNationOtherPointsGreater() {
        MarieWizardStrategy wizardStrategy = new MarieWizardStrategy();
        People me = new MarieWizard("Idiots", "1", 34, wizardStrategy);
        People other = new MarieWizard("Idiots", "1", 35, wizardStrategy);
        assertEquals(59, wizardStrategy.strategy(me, other));
    }

    @Test
    public void testNotEqualTribeAndNationAndOtherGreaterLifePoint() {
        MarieWizardStrategy wizardStrategy = new MarieWizardStrategy();
        People me = new MarieWizard("Minions", "2", 34, wizardStrategy);
        People other = new MarieWarrior("Idiots", "1", 35, wizardStrategy);
        assertEquals(6, wizardStrategy.strategy(me, other));
    }

    @Test
    public void testNotEqualTribeAndNationAndMeGreaterLifePoint() {
        MarieWizardStrategy wizardStrategy = new MarieWizardStrategy();
        People me = new MarieWizard("Minions", "2", 36, wizardStrategy);
        People other = new MarieWarrior("Idiots", "1", 35, wizardStrategy);
        assertEquals(17, wizardStrategy.strategy(me, other));
    }
}
