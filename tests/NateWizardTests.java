import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateWizardTests
{
    @Test
    public void testDifferentNationsIHaveMorePointsIAmAWizardEncounteringAWarrior()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 90, wizardStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 80, warriorStrategy);

        assertEquals(7, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveMorePointsIAmAWizardEncounteringAWizard()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 90, wizardStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 80, wizardStrategy);

        assertEquals(13, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveMorePointsIAmAWizardEncounteringAHealer()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 90, wizardStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 80, healerStrategy);

        assertEquals(8, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsIAmAWizardEncounteringAWarrior()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 60, wizardStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 60, warriorStrategy);

        assertEquals(8, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsIAmAWizardEncounteringAWizard()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 60, wizardStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 60, wizardStrategy);

        assertEquals(15, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsWeHaveEqualPointsIAmAWizardEncounteringAHealer()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 60, wizardStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 60, healerStrategy);

        assertEquals(10, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsIAmAWizardEncounteringAWarrior()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy warriorStrategy = new NateWarriorStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 30, wizardStrategy);
        People Anthothijah = new NateWarrior("Bob", "0", 40, warriorStrategy);

        assertEquals(11, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsIAmAWarriorEncounteringAWizard()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();

        People Arphaxad = new NateWizard("Nate", "0", 30, wizardStrategy);
        People Anthothijah = new NateWizard("Bob", "0", 40, wizardStrategy);

        assertEquals(20, wizardStrategy.strategy(Arphaxad, Anthothijah));
    }

    @Test
    public void testDifferentNationsIHaveLessPointsIAmAWarriorEncounteringAHealer()
    {
        NateWizardStrategy wizardStrategy = new NateWizardStrategy();
        NateHealerStrategy healerStrategy = new NateHealerStrategy();

        People Arphaxad = new NateWarrior("Nate", "0", 30, wizardStrategy);
        People Anthothijah = new NateHealer("Bob", "0", 40, healerStrategy);

        assertEquals(10, wizardStrategy.strategy(Arphaxad, Anthothijah));
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
