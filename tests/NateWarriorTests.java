import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateWarriorTests
{
    @Test
    public void testDifferentNationsIHaveMorePointsMyPointsAreGreaterThan70IAmAWarriorEncounteringAWarrior()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 90, warriorStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 80, warriorStrategy);

        assertEquals(26, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveMorePointsMyPointsAreGreaterThan70IAmAWarriorEncounteringAWizard()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 90, warriorStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 80, wizardStrategy);

        assertEquals(32, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveMorePointsMyPointsAreGreaterThan70IAmAWarriorEncounteringAHealer()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 90, warriorStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 80, healerStrategy);

        assertEquals(20, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsOtherPointsLessThan50IAmAWarriorEncounteringAWarrior()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 40, warriorStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 40, warriorStrategy);

        assertEquals(6, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsOtherPointsLessThan50IAmAWarriorEncounteringAWizard()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 40, warriorStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 40, wizardStrategy);

        assertEquals(8, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsOtherPointsLessThan50IAmAWarriorEncounteringAHealer()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 40, warriorStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 40, healerStrategy);

        assertEquals(5, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsOrMyPointsLessThan70OrOtherPointsGreaterThanOrEqualTo50IAmAWarriorEncounteringAWarrior()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 30, warriorStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 40, warriorStrategy);

        assertEquals(4, warriorStrategy.strategy(Arphaxad, Anthothijah));

        People Daniel = new NateWarrior("Nate", "0", 50, warriorStrategy);
        People Sarah = new NateWarrior("Bob", "0", 50, warriorStrategy);

        assertEquals(5, warriorStrategy.strategy(Daniel, Sarah));

        People Matthew = new NateWarrior("Nate", "0", 66, warriorStrategy);
        People Abraham = new NateWarrior("Bob", "0", 61, warriorStrategy);

        assertEquals(6, warriorStrategy.strategy(Matthew, Abraham));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsOrMyPointsLessThan70OrOtherPointsGreaterThanOrEqualTo50IAmAWarriorEncounteringAWizard()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 30, warriorStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 40, wizardStrategy);

        assertEquals(5, warriorStrategy.strategy(Arphaxad, Anthothijah));

        People Daniel = new NateWarrior("Nate", "0", 50, warriorStrategy);
        People Sarah = new NateWizard("Bob", "0", 50, wizardStrategy);

        assertEquals(6, warriorStrategy.strategy(Daniel, Sarah));

        People Matthew = new NateWarrior("Nate", "0", 66, warriorStrategy);
        People Abraham = new NateWizard("Bob", "0", 61, wizardStrategy);

        assertEquals(8, warriorStrategy.strategy(Matthew, Abraham));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsOrMyPointsLessThan70OrOtherPointsGreaterThanOrEqualTo50IAmAWarriorEncounteringAHealer()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 30, warriorStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 40, healerStrategy);

        assertEquals(3, warriorStrategy.strategy(Arphaxad, Anthothijah));

        People Daniel = new NateWarrior("Nate", "0", 50, warriorStrategy);
        People Sarah = new NateHealer("Bob", "0", 50, healerStrategy);

        assertEquals(4, warriorStrategy.strategy(Daniel, Sarah));

        People Matthew = new NateWarrior("Nate", "0", 66, warriorStrategy);
        People Abraham = new NateHealer("Bob", "0", 61, healerStrategy);

        assertEquals(5, warriorStrategy.strategy(Matthew, Abraham));
    }

    @Test
    public void testSameNationSameTribeIHaveLessPoints()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 30, warriorStrategy);
        People Anthothijah = new NateHealer("Nate", "0", 40, healerStrategy);

        assertEquals(40, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testSameNationSameTribeIHaveMorePoints()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 60, warriorStrategy);
        People Anthothijah = new NateHealer("Nate", "0", 40, healerStrategy);

        assertEquals(55, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testSameNationSameTribeWeHaveEqualPoints()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 42, warriorStrategy);
        People Anthothijah = new NateHealer("Nate", "0", 42, healerStrategy);

        assertEquals(43, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testSameNationDifferentTribesIHaveLessPoints()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 50, warriorStrategy);
        People Anthothijah = new NateHealer("Nate", "1", 60, healerStrategy);

        assertEquals(30, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testSameNationDifferentTribesIHaveMorePoints()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 40, warriorStrategy);
        People Anthothijah = new NateHealer("Nate", "1", 20, healerStrategy);

        assertEquals(10, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testSameNationDifferentTribesWeHaveEqualPoints()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 37, warriorStrategy);
        People Anthothijah = new NateHealer("Nate", "1", 37, healerStrategy);

        assertEquals(17, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }
}
