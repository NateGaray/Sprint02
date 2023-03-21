import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateWizardTests
{
    @Test
    public void testSameNation()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Harry = new NateWizard("Nate", "0", 100, nateWizardStrategy);
        People Yinx = new NateWarrior("Nate", "0", 100, nateWarriorStrategy);

        nateWizardStrategy.strategy(Harry, Yinx);

        assertEquals(110, Yinx.getLifePoints());
        assertEquals(90, nateWizardStrategy.strategy(Harry, Yinx));
    }

    @Test
    public void testNotSameNationAndLifePointsGreaterThanOppoment()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Harry = new NateWizard("Nate", "0", 100, nateWizardStrategy);
        People Yinx = new NateWarrior("Bink", "0", 90, nateWarriorStrategy);

        assertEquals(90, nateWizardStrategy.strategy(Harry, Yinx));
    }

    @Test
    public void testNotSameNationAndLifePointsLessThan()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Harry = new NateWizard("Nate", "0", 90, nateWizardStrategy);
        People Yinx = new NateWarrior("Bink", "0", 100, nateWarriorStrategy);

        assertEquals(80, nateWizardStrategy.strategy(Harry, Yinx));
    }
}
