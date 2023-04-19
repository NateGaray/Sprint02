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
    public void testIfTribeWillBeMoreAggressive()
    {
        JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
        People dan = new JeremyWizard("Hello", "0", 100, jeremyWizardStrategy);
        People bob = new JeremyWizard("Hi", "1", 90, jeremyWizardStrategy);

        assertEquals(50, jeremyWizardStrategy.strategy(dan, bob));
    }

    @Test
    public void testIfMyLifePointsAreLess()
    {
        JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
        People dan = new JeremyWizard("Hello", "0", 90, jeremyWizardStrategy);
        People bob = new JeremyWizard("Hi", "1", 100, jeremyWizardStrategy);

        assertEquals(40, jeremyWizardStrategy.strategy(dan, bob));
    }

    @Test
    public void testIfTribesAreEqual()
    {
        JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
        People dan = new JeremyWizard("Hello", "1", 30, jeremyWizardStrategy);
        People bob = new JeremyWarrior("Hi", "1", 50, jeremyWizardStrategy);
        People jeremy = new JeremyWizard("Hi", "1", 70, jeremyWizardStrategy);

        assertEquals(60, jeremyWizardStrategy.strategy(dan, bob));
        assertEquals(90, jeremyWizardStrategy.strategy(dan, jeremy));
    }

    @Test
    public void testIfNationsAreTheSameAndIfThereTribesAreTheSameOrNot()
    {
        JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
        People dan = new JeremyWizard("hello", "0", 70, jeremyWizardStrategy);
        People bob = new JeremyWarrior("hello", "1", 50, jeremyWizardStrategy);

        assertEquals(80, jeremyWizardStrategy.strategy(dan, bob));
    }

    @Test
    public void testToSeeIfMaxHeathWillStayAt100()
    {
        JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
        People dan = new JeremyWizard("Hello", "1", 60, jeremyWizardStrategy);
        People bob = new JeremyWizard("Hi", "1", 60, jeremyWizardStrategy);

        assertEquals(100, jeremyWizardStrategy.strategy(dan, bob));
    }
}