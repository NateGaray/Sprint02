import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateWizardTests
{

    @Test
    public void testHeavyDamageOnWarrior()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 80, nateWizardStrategy);
        People Josh = new NateWarrior("Bee", "0", 70, nateWarriorStrategy);

        assertEquals(28, nateWizardStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testHeavyDamageOnWizard()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        People Franq = new NateWarrior("Nate", "0", 80, nateWizardStrategy);
        People Josh = new NateWizard("Bee", "0", 70, nateWizardStrategy);

        assertEquals(35, nateWizardStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testHeavyDamageOnHealer()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWarrior("Nate", "0", 80, nateWizardStrategy);
        People Josh = new NateHealer("Bee", "0", 70, nateHealerStrategy);

        assertEquals(23, nateWizardStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testMediumDamageOnWarrior()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWizard("Nate", "0", 70, nateWizardStrategy);
        People Josh = new NateWarrior("Bee", "0", 70, nateWarriorStrategy);

        assertEquals(14, nateWizardStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testMediumDamageOnWizard()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        People Franq = new NateWizard("Nate", "0", 70, nateWizardStrategy);
        People Josh = new NateWizard("Bee", "0", 70, nateWizardStrategy);

        assertEquals(17, nateWizardStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testMediumDamageOnHealer()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWizard("Nate", "0", 70, nateWizardStrategy);
        People Josh = new NateHealer("Bee", "0", 70, nateHealerStrategy);

        assertEquals(11, nateWizardStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testLightDamageOnWarrior()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWizard("Nate", "0", 50, nateWizardStrategy);
        People Josh = new NateWarrior("Bee", "0", 30, nateWarriorStrategy);

        assertEquals(12, nateWizardStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testLightDamageOnWizard()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        People Franq = new NateWizard("Nate", "0", 50, nateWizardStrategy);
        People Josh = new NateWizard("Bee", "0", 30, nateWizardStrategy);

        assertEquals(15, nateWizardStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testLightDamageOnHealer()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWizard("Nate", "0", 50, nateWizardStrategy);
        People Josh = new NateHealer("Bee", "0", 30, nateHealerStrategy);

        assertEquals(10, nateWizardStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testPeacefulEncounterSameNation1()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWizard("Nate", "0", 5, nateWizardStrategy);
        People Josh = new NateHealer("Nate", "0", 10, nateHealerStrategy);

        assertEquals(10, nateWizardStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testPeacefulEncounterSameNation2()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWizard("Nate", "0", 10, nateWizardStrategy);
        People Josh = new NateHealer("Nate", "0", 10, nateHealerStrategy);

        assertEquals(9, nateWizardStrategy.strategy(Franq, Josh));
    }

    @Test
    public void testPeacefulEncounterSameNation3()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        People Franq = new NateWizard("Nate", "0", 40, nateWizardStrategy);
        People Josh = new NateHealer("Nate", "0", 6, nateHealerStrategy);

        assertEquals(50, nateWizardStrategy.strategy(Franq, Josh));
    }
}
