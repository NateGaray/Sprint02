import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateWarriorTests
{
    @Test
    public void testHeavyDamageOnWarrior()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 75, nateWarriorStrategy);
        People Josh = new NateWarrior("Bee", "0", 70, nateWarriorStrategy);

        assertEquals(28, nateWarriorStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testHeavyDamageOnWizard()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        People Franq = new NateWarrior("Nate", "0", 75, nateWarriorStrategy);
        People Josh = new NateWizard("Bee", "0", 70, nateWizardStrategy);

        assertEquals(35, nateWarriorStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testHeavyDamageOnHealer()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWarrior("Nate", "0", 75, nateWarriorStrategy);
        People Josh = new NateHealer("Bee", "0", 70, nateHealerStrategy);

        assertEquals(23, nateWarriorStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testMediumDamageOnWarrior()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 50, nateWarriorStrategy);
        People Josh = new NateWarrior("Bee", "0", 50, nateWarriorStrategy);

        assertEquals(10, nateWarriorStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testMediumDamageOnWizard()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        People Franq = new NateWarrior("Nate", "0", 50, nateWarriorStrategy);
        People Josh = new NateWizard("Bee", "0", 50, nateWizardStrategy);

        assertEquals(12, nateWarriorStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testMediumDamageOnHealer()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWarrior("Nate", "0", 50, nateWarriorStrategy);
        People Josh = new NateHealer("Bee", "0", 50, nateHealerStrategy);

        assertEquals(8, nateWarriorStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testLightDamageOnWarrior()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 5, nateWarriorStrategy);
        People Josh = new NateWarrior("Bee", "0", 10, nateWarriorStrategy);

        assertEquals(1, nateWarriorStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testLightDamageOnWizard()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        People Franq = new NateWarrior("Nate", "0", 10, nateWarriorStrategy);
        People Josh = new NateWizard("Bee", "0", 5, nateWizardStrategy);

        assertEquals(2, nateWarriorStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testLightDamageOnHealer()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWarrior("Nate", "0", 10, nateWarriorStrategy);
        People Josh = new NateHealer("Bee", "0", 5, nateHealerStrategy);

        assertEquals(1, nateWarriorStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testPeacefulEncounterSameNation1()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWarrior("Nate", "0", 5, nateWarriorStrategy);
        People Josh = new NateHealer("Nate", "0", 10, nateHealerStrategy);

        assertEquals(10, nateWarriorStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testPeacefulEncounterSameNation2()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWarrior("Nate", "0", 10, nateWarriorStrategy);
        People Josh = new NateHealer("Nate", "0", 10, nateHealerStrategy);

        assertEquals(9, nateWarriorStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testPeacefulEncounterSameNation3()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWarrior("Nate", "0", 40, nateWarriorStrategy);
        People Josh = new NateHealer("Nate", "0", 6, nateHealerStrategy);

        assertEquals(50, nateWarriorStrategy.strategy(Franq, Josh));
    }
}
