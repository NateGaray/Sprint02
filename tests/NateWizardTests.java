import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateWizardTests
{
    @Test
    public void testDifferentNationsIHaveMorePointsMyPointsAreGreaterThan70IAmAWizardEncounteringAWarrior()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 90, wizardStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 80, warriorStrategy);

        assertEquals(22, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveMorePointsMyPointsAreGreaterThan70IAmAWizardEncounteringAWizard()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 90, wizardStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 80, wizardStrategy);

        assertEquals(40, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveMorePointsMyPointsAreGreaterThan70IAmAWizardEncounteringAHealer()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 90, wizardStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 80, healerStrategy);

        assertEquals(26, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsOtherPointsLessThan50IAmAWizardEncounteringAWarrior()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 40, wizardStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 40, warriorStrategy);

        assertEquals(5, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsOtherPointsLessThan50IAmAWizardEncounteringAWizard()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 40, wizardStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 40, wizardStrategy);

        assertEquals(10, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsOtherPointsLessThan50IAmAWizardEncounteringAHealer()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 40, wizardStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 40, healerStrategy);

        assertEquals(6, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsIAmAWizardEncounteringAWarrior()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 30, wizardStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 40, warriorStrategy);

        assertEquals(3, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsMyPointsLessThan70IAmAWizardEncounteringAWarrior()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Matthew = new NateWizard("Nate", "0", 66, wizardStrategy);
        People Abraraham = new NateWarrior("Bob", "0", 61, warriorStrategy);

        assertEquals(5, wizardStrategy.strategy(Matthew, Abraraham));
    }

    @Test
    public void testDifferentNationsOtherPointsGreaterThanOrEqualTo50IAmAWizardEncounteringAWarrior()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Daniel = new NateWizard("Nate", "0", 50, wizardStrategy);
        People Sarah = new NateWarrior("Bob", "0", 50, warriorStrategy);

        assertEquals(4, wizardStrategy.strategy(Daniel, Sarah));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsIAmAWarriorEncounteringAWizard()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 30, wizardStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 40, wizardStrategy);

        assertEquals(6, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsMyPointsLessThan70IAmAWarriorEncounteringAWizard()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Matthew = new NateWizard("Nate", "0", 66, wizardStrategy);
        People Abraham = new NateWizard("Bob", "0", 61, wizardStrategy);

        assertEquals(10, wizardStrategy.strategy(Matthew, Abraham));
    }

    @Test
    public void testDifferentNationsOtherPointsGreaterThanOrEqualTo50IAmAWarriorEncounteringAWizard()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Daniel = new NateWizard("Nate", "0", 50, wizardStrategy);
        People Sarah = new NateWizard("Bob", "0", 50, wizardStrategy);

        assertEquals(8, wizardStrategy.strategy(Daniel, Sarah));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsIAmAWarriorEncounteringAHealer()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 30, wizardStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 40, healerStrategy);

        assertEquals(3, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsMyPointsLessThan70IAmAWarriorEncounteringAHealer()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Matthew = new NateWarrior("Nate", "0", 66, wizardStrategy);
        People Abraham = new NateHealer("Bob", "0", 61, healerStrategy);

        assertEquals(5, wizardStrategy.strategy(Matthew, Abraham));
    }

    @Test
    public void testDifferentNationsOtherPointsGreaterThanOrEqualTo50IAmAWarriorEncounteringAHealer()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Daniel = new NateWarrior("Nate", "0", 50, wizardStrategy);
        People Sarah = new NateHealer("Bob", "0", 50, healerStrategy);

        assertEquals(4, wizardStrategy.strategy(Daniel, Sarah));
    }

    @Test
    public void testSameNationSameTribeIHaveLessPoints()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 30, wizardStrategy);
        People Anthothijah = new NateHealer("Nate", "0", 40, healerStrategy);

        assertEquals(40, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testSameNationSameTribeIHaveMorePoints()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 60, wizardStrategy);
        People Anthothijah = new NateHealer("Nate", "0", 40, healerStrategy);

        assertEquals(55, wizardStrategy.strategy(Arphaxad, Anthothijah));
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
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 50, wizardStrategy);
        People Anthothijah = new NateHealer("Nate", "1", 60, healerStrategy);

        assertEquals(30, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testSameNationDifferentTribesIHaveMorePoints()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 40, wizardStrategy);
        People Anthothijah = new NateHealer("Nate", "1", 20, healerStrategy);

        assertEquals(10, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testSameNationDifferentTribesWeHaveEqualPoints()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 37, wizardStrategy);
        People Anthothijah = new NateHealer("Nate", "1", 37, healerStrategy);

        assertEquals(17, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }
}
