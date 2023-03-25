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
    public void testNotSameNationAndLifePointsGreaterThanOpponent()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Harry = new NateWizard("Nate", "0", 62, nateWizardStrategy);
        People Yinx = new NateWarrior("Bink", "0", 57, nateWarriorStrategy);

        assertEquals(57, nateWizardStrategy.strategy(Harry, Yinx));

        People Todd = new NateWizard("Nate", "0", 21, nateWizardStrategy);
        People Carl = new NateWarrior("Bink", "0", 15, nateWarriorStrategy);

        assertEquals(20, nateWizardStrategy.strategy(Todd, Carl));
    }

    @Test
    public void testNotSameNationAndLifePointsLessThan()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Harry = new NateWizard("Nate", "0", 24, nateWizardStrategy);
        People Yinx = new NateWarrior("Bink", "0", 47, nateWarriorStrategy);

        assertEquals(47, nateWizardStrategy.strategy(Harry, Yinx));
    }

    @Test
    public void testNotSameNationAndLifePointsEqual()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Harry = new NateWizard("Nate", "0", 50, nateWizardStrategy);
        People Yinx = new NateWarrior("Bink", "0", 50, nateWarriorStrategy);

        nateWizardStrategy.strategy(Harry, Yinx);

        assertEquals(45, Yinx.getLifePoints());

        People Todd = new NateWizard("Nate", "0", 32, nateWizardStrategy);
        People Carl = new NateWarrior("Bink", "0", 32, nateWarriorStrategy);

        nateWizardStrategy.strategy(Todd, Carl);

        assertEquals(29, Carl.getLifePoints());
    }
}
