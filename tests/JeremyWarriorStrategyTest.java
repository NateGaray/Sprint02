import Project02.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeremyWarriorStrategyTest
{
    @Test
    public void testIfNationsAreTheSameOrIfTheAreNotTheSame()
    {
        JeremyWarriorStrategy jeremyWarriorStrategy = new JeremyWarriorStrategy();
        People Dan = new JeremyWarrior("Hello", "0", 100, jeremyWarriorStrategy);
        People Bob = new JeremyWarrior("Hello", "0", 100, jeremyWarriorStrategy);
        People Jeremy = new JeremyWarrior("Hey", "0", 100, jeremyWarriorStrategy);

        assertTrue(Dan.getNation() == Bob.getNation());
        assertFalse(Dan.getNation() == Jeremy.getNation());
    }

    @Test
    public void testIfTribesAreTheSameOrNotTheSame()
    {
        JeremyWarriorStrategy jeremyWarriorStrategy = new JeremyWarriorStrategy();
        People Dan = new JeremyWarrior("Hello", "0", 100, jeremyWarriorStrategy);
        People Bob = new JeremyWarrior("Hello", "0", 100, jeremyWarriorStrategy);
        People Jeremy = new JeremyWarrior("Hello", "1", 100, jeremyWarriorStrategy);

        assertTrue(Dan.getTribe() == Bob.getTribe());
        assertTrue(Dan.getTribe() != Jeremy.getTribe());
    }

    @Test
    public void testIfOtherPersonIsAWizardToSeeIfIHaveMoreLifePoints()
    {
        JeremyWarriorStrategy jeremyWarriorStrategy = new JeremyWarriorStrategy();
        People dan = new JeremyWarrior("hello", "0", 100, jeremyWarriorStrategy);
        People bob = new JeremyWizard("hi", "0", 80, jeremyWarriorStrategy);

        assertEquals(40, jeremyWarriorStrategy.strategy(dan, bob));
    }

    @Test
    public void testIfOtherPersonIsAWizardToSeeIfIHaveLessLifePoints()
    {
        JeremyWarriorStrategy jeremyWarriorStrategy = new JeremyWarriorStrategy();
        People dan = new JeremyWarrior("hello", "0", 40, jeremyWarriorStrategy);
        People bob = new JeremyWizard("hi", "1", 80, jeremyWarriorStrategy);

        assertEquals(90, jeremyWarriorStrategy.strategy(dan, bob));
    }

    @Test
    public void testIfOtherPersonIsAWarrior()
    {
        JeremyWarriorStrategy jeremyWarriorStrategy = new JeremyWarriorStrategy();
        People dan = new JeremyWarrior("hello", "0", 20, jeremyWarriorStrategy);
        People bob = new JeremyWarrior("hi", "1", 10, jeremyWarriorStrategy);

        assertEquals(40, jeremyWarriorStrategy.strategy(dan, bob));
    }

    @Test
    public void testIfIHaveLessPointsThanTheOtherPersonIIWillRunAway()
    {
        JeremyWarriorStrategy jeremyWarriorStrategy = new JeremyWarriorStrategy();
        People dan = new JeremyWarrior("hello", "0", 10, jeremyWarriorStrategy);
        People bob = new JeremyWarrior("hi", "1", 20, jeremyWarriorStrategy);

        assertEquals(-10, jeremyWarriorStrategy.strategy(dan, bob));
    }
}