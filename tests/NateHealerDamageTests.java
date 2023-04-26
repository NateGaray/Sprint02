import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateHealerDamageTests
{
    @Test
    public void testLifePointsGreaterThan50()
    {
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateHealer("Nate", "0", 80, nateHealerStrategy);
        People Josh = new NateWarrior("Bee", "0", 70, nateWarriorStrategy);

        assertEquals(70, nateHealerStrategy.strategy(Franq, Josh));

    }

    @Test
    public void testLessThan50()
    {
        NateHealerStrategy nateHealerStrategy = new NateHealerStrategy();
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateHealer("Nate", "0", 40, nateHealerStrategy);
        People Josh = new NateWarrior("Bee", "0", 55, nateWarriorStrategy);

        assertEquals(37, nateHealerStrategy.strategy(Franq, Josh));

    }
}
