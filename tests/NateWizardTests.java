import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateWizardTests
{
    @Test
    public void testThrowsSuperSpell()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        People Franq = new NateWizard("Nate", "0", 77, nateWizardStrategy);
        People Josh = new NateWizard("Bee", "0", 89, nateWizardStrategy);

        nateWizardStrategy.strategy(Franq, Josh);

        assertEquals(1, Josh.getLifePoints());

        People Hank = new NateWizard("Nate", "0", 27, nateWizardStrategy);
        People Chris = new NateWizard("Bee", "0", 40, nateWizardStrategy);

        nateWizardStrategy.strategy(Hank, Chris);

        assertEquals(1, Chris.getLifePoints());
    }
}
