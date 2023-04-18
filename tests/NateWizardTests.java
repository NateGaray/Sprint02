import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateWizardTests
{

    @Test
    public void testTakesHeavyDamage()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWizard("Nate", "0", 80, nateWizardStrategy);
        People Josh = new NateWarrior("Bee", "0", 77, nateWarriorStrategy);

        assertEquals(40, nateWizardStrategy.strategy(Franq, Josh));

        People Hank = new NateWizard("Nate", "0", 90, nateWizardStrategy);
        People Chris = new NateWarrior("Bee", "0", 88, nateWarriorStrategy);

        assertEquals(45, nateWizardStrategy.strategy(Hank, Chris));
    }

    @Test
    public void testHealingSpecial()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWizard("Nate", "0", 48, nateWizardStrategy);
        People Josh = new NateWarrior("Bee", "0", 56, nateWarriorStrategy);

        assertEquals(60, nateWizardStrategy.strategy(Franq, Josh));

        People Roveq = new NateWizard("Nate", "0", 24, nateWizardStrategy);
        People Poge = new NateWarrior("Bee", "0", 50, nateWarriorStrategy);

        assertEquals(36, nateWizardStrategy.strategy(Roveq, Poge));
    }
}
