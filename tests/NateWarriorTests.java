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
}
