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
    public void testToSeeIfSameNationAndTribeWillHealEachOther()
    {
        JeremyWarriorStrategy jeremyWarriorStrategy = new JeremyWarriorStrategy();
        People Dan = new JeremyWarrior("Hello", "0", 90, jeremyWarriorStrategy);
        People Bob = new JeremyWarrior("Hello", "0", 80, jeremyWarriorStrategy);

        assertEquals(98, jeremyWarriorStrategy.strategy(Dan, Bob));
        assertEquals(72, Bob.getLifePoints());

    }

    @Test
    public void testNothingWillHappenIfLifePointsIsLessThanOtherPerson()
    {
        JeremyWarriorStrategy jeremyWarriorStrategy = new JeremyWarriorStrategy();
        People Dan = new JeremyWarrior("Hello", "0", 80, jeremyWarriorStrategy);
        People Bob = new JeremyWarrior("Hello", "0", 70, jeremyWarriorStrategy);

        assertEquals(70, jeremyWarriorStrategy.strategy(Bob, Dan));
    }

    @Test
    public void testIfTheyAreNotTheSameTypePeople()
    {
        JeremyWarriorStrategy jeremyWarriorStrategy = new JeremyWarriorStrategy();
        People Dan = new JeremyWizard("Hello", "0", 80, jeremyWarriorStrategy);
        People Bob = new JeremyWarrior("Hello", "0", 70, jeremyWarriorStrategy);

        assertEquals(87, jeremyWarriorStrategy.strategy(Dan, Bob));
        assertEquals(63, Bob.getLifePoints());
    }

    @Test
    public void testWarriorHasToFight()
    {
        JeremyWarriorStrategy jeremyWarriorStrategy = new JeremyWarriorStrategy();
        People Dan = new JeremyWizard("Hello", "0", 100, jeremyWarriorStrategy);
        People Bob = new JeremyWarrior("Minion", "1", 100, jeremyWarriorStrategy);

        assertEquals(95, jeremyWarriorStrategy.strategy(Dan, Bob));
    }

    @Test
    public void testWarriorWillRunAway()
    {
        JeremyWarriorStrategy jeremyWizardStrategy = new JeremyWarriorStrategy();
        People Dan = new JeremyWarrior("Minion", "0", 100, jeremyWizardStrategy);
        People Bob = new JeremyWizard("Hello", "1", 100, jeremyWizardStrategy);

        assertEquals(90, jeremyWizardStrategy.strategy(Dan, Bob));
    }



}