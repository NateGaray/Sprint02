import Project02.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeremyWizardStrategyTest
{
    @Test
    public void testIfNationsAreNotTheSame()
    {
        JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
        People Dan = new JeremyWizard("Idiot", "0", 100, jeremyWizardStrategy);
        People Bob = new JeremyWizard("Minion", "0", 100, jeremyWizardStrategy);
        People Jeremy = new JeremyWizard("Idiot", "0", 100, jeremyWizardStrategy);

        assertFalse(Dan.getNation() == Bob.getNation());
        assertTrue(Dan.getNation() == Jeremy.getNation());
    }

    @Test
    public void testIfTribesAreNotTheSame()
    {
        JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
        People Dan = new JeremyWizard("Hello", "0", 100, jeremyWizardStrategy);
        People Bob = new JeremyWizard("Hello", "0", 100, jeremyWizardStrategy);
        People Jeremy = new JeremyWizard("Hello", "1", 100, jeremyWizardStrategy);

        assertTrue(Dan.getTribe() == Bob.getTribe());
        assertFalse(Dan.getTribe() == Jeremy.getTribe());
    }

    @Test
    public void testToSeeIfOtherNationWillTakeDamage()
    {
        JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
        People Dan = new JeremyWizard("Idiot", "0", 100, jeremyWizardStrategy);
        People Bob = new JeremyWizard("Minion", "1", 99, jeremyWizardStrategy);

        assertEquals(79, jeremyWizardStrategy.strategy(Dan, Bob));

        People Jeremy = new JeremyWizard("Jeremy", "2", 100, jeremyWizardStrategy);

        assertEquals(65, jeremyWizardStrategy.strategy(Dan, Jeremy));
    }

    @Test
    public void testIfWizardWillRunAway()
    {
        JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
        People Dan = new JeremyWizard("Minion", "0", 100, jeremyWizardStrategy);
        People Bob = new JeremyWizard("Minion", "1", 100, jeremyWizardStrategy);

        assertEquals(100, jeremyWizardStrategy.strategy(Dan, Bob));
    }

    @Test
    public void testIfWizardWillHealAnotherFriend()
    {
        JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
        People Dan = new JeremyWizard("Idiot", "0", 90, jeremyWizardStrategy);
        People Bob = new JeremyWizard("Idiot", "0", 10, jeremyWizardStrategy);

        assertEquals(90, jeremyWizardStrategy.strategy(Dan, Bob));
    }
}