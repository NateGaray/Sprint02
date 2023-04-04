import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateWizardTests
{
    @Test
    public void testEncountersSameNationWizard()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        People Harry = new NateWizard("Nate", "0", 100, nateWizardStrategy);
        People Yinx = new NateWizard("Nate", "0", 100, nateWizardStrategy);

        nateWizardStrategy.strategy(Harry, Yinx);

        assertEquals(110, Yinx.getLifePoints());
        assertEquals(90, nateWizardStrategy.strategy(Harry, Yinx));
    }

    @Test
    public void testEncountersSameNationWarrior()
    {
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Harry = new NateWizard("Nate", "0", 100, nateWizardStrategy);
        People Yinx = new NateWarrior("Nate", "0", 100, nateWarriorStrategy);

        nateWizardStrategy.strategy(Harry, Yinx);

        assertEquals(120, Yinx.getLifePoints());
        assertEquals(80, nateWizardStrategy.strategy(Harry, Yinx));

        People Kojo = new NateWizard("Nate", "0", 50, nateWizardStrategy);
        People Victor = new NateWarrior("Nate", "1", 40, nateWarriorStrategy);

        nateWizardStrategy.strategy(Kojo, Victor);

        assertEquals(50, Victor.getLifePoints());
        assertEquals(40, nateWizardStrategy.strategy(Kojo, Victor));

        People Ben = new NateWizard("Nate", "0", 60, nateWizardStrategy);
        People Jordan = new NateWarrior("Nate", "1", 54, nateWarriorStrategy);

        nateWizardStrategy.strategy(Ben, Jordan);

        assertEquals(66, Jordan.getLifePoints());
        assertEquals(48, nateWizardStrategy.strategy(Ben, Jordan));
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

        assertEquals(49, nateWizardStrategy.strategy(Harry, Yinx));

        People Todd = new NateWizard("Nate", "0", 32, nateWizardStrategy);
        People Carl = new NateWarrior("Bink", "0", 32, nateWarriorStrategy);

        assertEquals(31, nateWizardStrategy.strategy(Todd, Carl));
    }
}
