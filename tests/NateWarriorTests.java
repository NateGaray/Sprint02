import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateWarriorTests
{
    @Test
    public void testDifferentNationsIHaveMorePointsIAmAWarriorEncounteringAWarrior()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 90, warriorStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 80, warriorStrategy);

        assertEquals(8, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveMorePointsIAmAWarriorEncounteringAWizard()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 90, warriorStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 80, wizardStrategy);

        assertEquals(10, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveMorePointsIAmAWarriorEncounteringAHealer()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 90, warriorStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 80, healerStrategy);

        assertEquals(6, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsIAmAWarriorEncounteringAWarrior()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 60, warriorStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 60, warriorStrategy);

        assertEquals(10, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsIAmAWarriorEncounteringAWizard()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 60, warriorStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 60, wizardStrategy);

        assertEquals(12, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsIAmAWarriorEncounteringAHealer()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 60, warriorStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 60, healerStrategy);

        assertEquals(7, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsIAmAWarriorEncounteringAWarrior()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 30, warriorStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 40, warriorStrategy);

        assertEquals(13, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsIAmAWarriorEncounteringAWizard()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 30, warriorStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 40, wizardStrategy);

        assertEquals(16, warriorStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsIAmAWarriorEncounteringAHealer()
    {
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 30, warriorStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 40, healerStrategy);

        assertEquals(10, warriorStrategy.strategy(Arphaxad, Anthothijah));
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
