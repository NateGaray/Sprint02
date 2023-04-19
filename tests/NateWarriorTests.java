import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateWarriorTests
{
    @Test
    public void testTakesHeavyDamage()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 77, nateWarriorStrategy);
        People Josh = new NateWarrior("Bee", "0", 70, nateWarriorStrategy);

        assertEquals(39, nateWarriorStrategy.strategy(Franq, Josh));

    }

    @Test
    public void testTakesMediumDamage()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 65, nateWarriorStrategy);
        People Josh = new NateWarrior("Bee", "0", 89, nateWarriorStrategy);

        assertEquals(52, nateWarriorStrategy.strategy(Franq, Josh));

        People Franqlynn = new NateWarrior("Nate", "0", 60, nateWarriorStrategy);
        People Joshmin = new NateWarrior("Bee", "0", 33, nateWarriorStrategy);

        assertEquals(48, nateWarriorStrategy.strategy(Franqlynn, Joshmin));

    }

    @Test
    public void testTakesLightDamage()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 45, nateWarriorStrategy);
        People Josh = new NateWarrior("Bee", "0", 69, nateWarriorStrategy);

        assertEquals(41, nateWarriorStrategy.strategy(Franq, Josh));

        People Franq1 = new NateWarrior("Nate", "0", 9, nateWarriorStrategy);
        People Josh1 = new NateWarrior("Bee", "0", 32, nateWarriorStrategy);

        assertEquals(8, nateWarriorStrategy.strategy(Franq1, Josh1));
    }
}
