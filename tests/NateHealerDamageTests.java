import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateHealerDamageTests
{
    @Test
    public void testTakesHeavyDamage()
    {
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateHealer("Nate", "0", 80, nateHealerStrategy);
        People Josh = new NateWarrior("Bee", "0", 70, nateWarriorStrategy);

        assertEquals(40, nateHealerStrategy.strategy(Franq, Josh));

    }

    @Test
    public void testTakesMediumDamage()
    {
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateHealer("Nate", "0", 50, nateHealerStrategy);
        People Josh = new NateWarrior("Bee", "0", 55, nateWarriorStrategy);

        assertEquals(40, nateHealerStrategy.strategy(Franq, Josh));

    }

    @Test
    public void testTakesLightDamage()
    {
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateHealer("Nate", "0", 19, nateHealerStrategy);
        People Josh = new NateWarrior("Bee", "0", 24, nateWarriorStrategy);

        assertEquals(18, nateHealerStrategy.strategy(Franq, Josh));

        People Franq1 = new NateHealer("Nate", "0", 9, nateHealerStrategy);
        People Josh1 = new NateWarrior("Bee", "0", 6, nateWarriorStrategy);

        assertEquals(8, nateHealerStrategy.strategy(Franq1, Josh1));
    }
}
