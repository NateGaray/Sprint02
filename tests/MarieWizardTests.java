import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MarieWizardTests {
    @Test
    public void testWizardStrategy1() {
        MarieWizardStrategy wizardStrategy = new MarieWizardStrategy();
        People me = new MarieWizard("Minions", "2", 35, wizardStrategy);
        People other = new MarieWizard("Idiots", "1", 34, wizardStrategy);
        assertEquals(5, wizardStrategy.strategy(me, other));
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
        assertEquals(44, wizardStrategy.strategy(me, other));
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
    @Test
    public void testArtifactStrategy()
    {
        MarieArtifactStrategy artifactStrategy = new MarieArtifactStrategy();
        People me = new MarieWizard("Idiots","2",55,artifactStrategy);
        People other = new MarieWizard("Minons","1",100,artifactStrategy);
        assertEquals(100,artifactStrategy.strategy(me,other));
    }

    @Test
    public void testPeacefulStrategy()
    {
        MariePeacefulStrategy peacefulStrategy = new MariePeacefulStrategy();
        People me = new MarieWizard("Idiots","3",55,peacefulStrategy);
        People other = new MarieWizard("Idiots", "3",65,peacefulStrategy);
        assertEquals(95,peacefulStrategy.strategy(me,other));
    }
}
