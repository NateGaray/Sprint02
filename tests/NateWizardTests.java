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

        nateWizardStrategy.strategy(Franq, Josh);

        assertEquals(80, Franq.getLifePoints());

        People Hank = new NateWizard("Nate", "0", 90, nateWizardStrategy);
        People Chris = new NateWarrior("Bee", "0", 88, nateWarriorStrategy);

        assertEquals(45, nateWizardStrategy.strategy(Hank, Chris));
    }
}
